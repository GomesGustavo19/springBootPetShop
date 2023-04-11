package br.com.estudo.petshop.springBootPetShop.controller;

import br.com.estudo.petshop.springBootPetShop.dto.mapper.ClienteMapper;
import br.com.estudo.petshop.springBootPetShop.dto.response.CepResponse;
import br.com.estudo.petshop.springBootPetShop.dto.response.ClienteResponse;
import br.com.estudo.petshop.springBootPetShop.dto.resquest.ClienteRequest;
import br.com.estudo.petshop.springBootPetShop.model.ClienteModel;
import br.com.estudo.petshop.springBootPetShop.repository.ClienteRepository;
import br.com.estudo.petshop.springBootPetShop.service.CepService;
import br.com.estudo.petshop.springBootPetShop.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SpringBootPetShopController {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private CepService service;

    @Autowired
    private ClienteService serviceCliente;

    @PostMapping(value = "cadastroCliente")
    @ResponseBody
    public ResponseEntity<ClienteResponse> cadastroCliente(@RequestBody ClienteRequest request){

        ClienteModel model = ClienteMapper.toCliente(request);
        ClienteModel modelSalvo = serviceCliente.salvar(model).getBody();
        ClienteResponse reponse = ClienteMapper.toClienteReponse(modelSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(reponse);

    }

    @GetMapping(value = "listarCliente")
    @ResponseBody
    public ResponseEntity<List<ClienteModel>> listarUsario(){

        List<ClienteModel> clienteModels = clienteRepository.findAll();

        return new ResponseEntity<List<ClienteModel>>(clienteModels,HttpStatus.OK);

    }

    @DeleteMapping(value = "/excluirCliente")
    @ResponseBody
    public ResponseEntity<String> excluirCliente(@RequestParam(name = "id") Integer id){

        clienteRepository.deleteById(id);

        return new ResponseEntity<String>("Deletado com sucesso", HttpStatus.OK);

    }

    @GetMapping(value = "buscarPorId")
    @ResponseBody
    public ResponseEntity<ClienteModel> buscarCliente(@RequestParam(name = "id") Integer id){

        ClienteModel cliente = clienteRepository.findById(id).get();

        return new ResponseEntity<ClienteModel>(cliente,HttpStatus.OK);
    }

    @PutMapping(value = "atualizarCliente")
    @ResponseBody
    public ResponseEntity<?> atualizarCliente(@RequestBody ClienteModel clienteModel){

        if (clienteModel.getId() == null)
            return new ResponseEntity<String>("Id necessario para realizar atualização do cliente", HttpStatus.OK);

        ClienteModel cliente = clienteRepository.saveAndFlush(clienteModel);

        return new ResponseEntity<ClienteModel>(cliente,HttpStatus.OK);

    }

    @GetMapping(value = "pesquisarCep/{cep}")
    @ResponseBody
    public CepResponse pesquisaDeCep(@PathVariable("cep") String cep){
        return service.pesquisarCep(cep);
    }
}
