package br.com.estudo.petshop.springBootPetShop.service;


import br.com.estudo.petshop.springBootPetShop.model.ClienteModel;
import br.com.estudo.petshop.springBootPetShop.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public ResponseEntity<ClienteModel> salvar(ClienteModel clienteModel){

        ClienteModel model = repository.save(clienteModel);

        return new ResponseEntity<ClienteModel>(model, HttpStatus.CREATED);
    }

    public List<ClienteModel> listarUsario(){

        List<ClienteModel> clienteModels;
        clienteModels = repository.pesquisarPorTodos().stream().map(x-> new ClienteModel(x)).collect(Collectors.toList());

        return clienteModels;

    }

    public ResponseEntity<String> excluirCliente(Integer id){

        repository.deleteById(id);

        return new ResponseEntity<String>("Deletado com sucesso", HttpStatus.OK);

    }

    public ResponseEntity<ClienteModel> atualizarCliente(ClienteModel clienteModel){

        if (clienteModel.getId() == null) {
            ClienteModel cliente = repository.saveAndFlush(clienteModel);
            return new ResponseEntity<ClienteModel>(cliente, HttpStatus.OK);
        } else if (clienteModel.getId() == clienteModel.getId()) {
            ClienteModel cliente = repository.saveAndFlush(clienteModel);
            return new ResponseEntity<ClienteModel>(cliente, HttpStatus.OK);
        } else {
            return new ResponseEntity<ClienteModel>(HttpStatus.BAD_REQUEST);
        }

    }


}
