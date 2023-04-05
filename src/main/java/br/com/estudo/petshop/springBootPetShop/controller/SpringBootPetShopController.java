package br.com.estudo.petshop.springBootPetShop.controller;

import br.com.estudo.petshop.springBootPetShop.model.ClienteModel;
import br.com.estudo.petshop.springBootPetShop.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class SpringBootPetShopController {

    @Autowired
    private ClienteRepository clienteRepository;

    @RequestMapping(value =  "/{nome}/{documento}/{nomePet}/{endereco}")
    @ResponseStatus(HttpStatus.OK)
    public String cadastroCliente(@PathVariable String nome,@PathVariable String documento,@PathVariable String nomePet,@PathVariable String endereco){

        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setNomeDoDono(nome);
        clienteModel.setDocumentoCPF(documento);
        clienteModel.setNomeDoPet(nomePet);
        clienteModel.setEndereco(endereco);
        clienteRepository.save(clienteModel);


        return "";
    }
}
