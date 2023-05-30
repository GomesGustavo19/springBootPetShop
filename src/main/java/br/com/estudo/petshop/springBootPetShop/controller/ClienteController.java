package br.com.estudo.petshop.springBootPetShop.controller;

import br.com.estudo.petshop.springBootPetShop.dto.mapper.ClienteMapper;
import br.com.estudo.petshop.springBootPetShop.dto.response.ClienteResponse;
import br.com.estudo.petshop.springBootPetShop.dto.resquest.ClienteRequest;
import br.com.estudo.petshop.springBootPetShop.model.ClienteModel;
import br.com.estudo.petshop.springBootPetShop.service.CepService;
import br.com.estudo.petshop.springBootPetShop.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping(value = "cadastro")
    public ResponseEntity<ClienteResponse> cadastroCliente(@RequestBody ClienteRequest request) {

        ClienteModel model = ClienteMapper.toCliente(request);
        ClienteModel modelSalvo = service.salvar(model).getBody();
        ClienteResponse reponse = ClienteMapper.toClienteReponse(modelSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(reponse);

    }

    @GetMapping(value = "listar")
    public List<ClienteResponse> listarUsario() {
        List<ClienteModel> modelListar = service.listarUsario().getBody();
        return ClienteMapper.toClienteListReponse(modelListar);

    }

    @DeleteMapping(value = "excluir")
    public ResponseEntity<String> excluirCliente(@RequestParam(name = "id") Integer id) {

        return service.excluirCliente(id);

    }

    @PutMapping(value = "atualizar")
    public ResponseEntity<ClienteResponse> atualizarCliente(@RequestBody ClienteRequest request) {

        ClienteModel model = ClienteMapper.toCliente(request);
        ClienteModel modelSalvo = service.atualizarCliente(model).getBody();
        ClienteResponse response = ClienteMapper.toClienteReponse(modelSalvo);
        return ResponseEntity.status(200).body(response);

    }

}
