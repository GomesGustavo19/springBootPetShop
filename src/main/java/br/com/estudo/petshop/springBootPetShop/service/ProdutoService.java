package br.com.estudo.petshop.springBootPetShop.service;

import br.com.estudo.petshop.springBootPetShop.model.ProdutoModel;
import br.com.estudo.petshop.springBootPetShop.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public ResponseEntity<ProdutoModel> salvar(ProdutoModel model) {

        ProdutoModel produtoModel = repository.save(model);

        return new ResponseEntity<ProdutoModel>(produtoModel, HttpStatus.CREATED);

    }

    public List<ProdutoModel> listar() {

        List<ProdutoModel> modeList;
        modeList = repository.produtoCategorizado().stream().map(x -> new ProdutoModel(x)).collect(Collectors.toList());

        return modeList;

    }

    public ResponseEntity<String> excluirPorId(Integer id) {

        repository.deleteById(id);

        return new ResponseEntity<String>("Deletado com sucesso! " + id, HttpStatus.OK);

    }

    public ResponseEntity<ProdutoModel> atualizarPorId(ProdutoModel model) {

        if (model.getId() == null) {
            return new ResponseEntity<ProdutoModel>(HttpStatus.BAD_REQUEST);
        } else if (model.getId() == model.getId()) {
            ProdutoModel produtoModel = repository.saveAndFlush(model);
            return new ResponseEntity<ProdutoModel>(produtoModel, HttpStatus.OK);
        } else {
            return new ResponseEntity<ProdutoModel>(HttpStatus.BAD_REQUEST);
        }
    }

    public Optional<ProdutoModel> pesquisarProdutoId(Integer id) {

        Optional<ProdutoModel> modelList;
        modelList = repository.findById(id);

        return modelList;

    }

    public List<ProdutoModel> pesquisarProdutoPorTodosId(List<Integer> id) {

        List<ProdutoModel> modelList;
        modelList = repository.findAllById(id).stream().map(produtoListado -> new ProdutoModel(produtoListado)).collect(Collectors.toList());

        return modelList;

    }


}
