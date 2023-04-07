package br.com.estudo.petshop.springBootPetShop.controller;

import br.com.estudo.petshop.springBootPetShop.model.ClienteModel;
import br.com.estudo.petshop.springBootPetShop.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SpringBootPetShopController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping(value = "cadastroCliente")
    @ResponseBody
    public ResponseEntity<ClienteModel> cadastroCliente(@RequestBody ClienteModel clienteModel){

        ClienteModel cliente = clienteRepository.save(clienteModel);

        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
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
}
