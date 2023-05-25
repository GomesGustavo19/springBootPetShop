package br.com.estudo.petshop.springBootPetShop.service;

import br.com.estudo.petshop.springBootPetShop.model.ProdutoModel;
import br.com.estudo.petshop.springBootPetShop.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.swing.*;
import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public ResponseEntity<ProdutoModel> salvar(ProdutoModel model) {

        ProdutoModel produtoModel = repository.save(model);

        return new ResponseEntity<ProdutoModel>(produtoModel, HttpStatus.CREATED);

    }

    public ResponseEntity<List<ProdutoModel>> listar() {

        List<ProdutoModel> modeList = repository.findAll();

        return new ResponseEntity<List<ProdutoModel>>(modeList, HttpStatus.OK);

    }


    public ResponseEntity<String> excluirPorId(Integer id) {

        repository.deleteById(id);

        return new ResponseEntity<String>("Deletado com sucesso! " + id, HttpStatus.OK);

    }

    public ResponseEntity<ProdutoModel> atualizarPorId(ProdutoModel model) {

        if (model.getId() == null) {
            System.out.println("É necessario digitar o id para atualizar");
            return new ResponseEntity<ProdutoModel>(HttpStatus.BAD_REQUEST);
        } else if (model.getId() == model.getId()) {
            ProdutoModel produtoModel = repository.saveAndFlush(model);
            return new ResponseEntity<ProdutoModel>(produtoModel, HttpStatus.OK);
        } else {
            return new ResponseEntity<ProdutoModel>(HttpStatus.BAD_REQUEST);
        }
    }

}
