package br.com.estudo.petshop.springBootPetShop.controller;

import br.com.estudo.petshop.springBootPetShop.dto.mapper.ProdutoMapper;
import br.com.estudo.petshop.springBootPetShop.dto.response.ProdutoResponse;
import br.com.estudo.petshop.springBootPetShop.dto.resquest.ProdutoRequest;
import br.com.estudo.petshop.springBootPetShop.model.ProdutoModel;
import br.com.estudo.petshop.springBootPetShop.service.ProdutoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping(value = "cadastro")
    public ResponseEntity<ProdutoResponse> salvar(@RequestBody ProdutoRequest request){

        ProdutoModel model = ProdutoMapper.toPorduto(request);
        ProdutoModel produtoModelSalvo = service.salvar(model).getBody();
        ProdutoResponse response = ProdutoMapper.toProdutoResponse(produtoModelSalvo);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
    @GetMapping(value = "listar")
    public List<ProdutoResponse> listar(){
        ProdutoModel model = new ProdutoModel();
        List<ProdutoModel> modelListado = service.listar().getBody();
        return ProdutoMapper.toProdutoResponseList(modelListado);
    }

    @DeleteMapping(value = "excluir")
    public ResponseEntity<String> excluirPorID(@RequestParam(name = "id") Integer id){

        return service.excluirPorId(id);

    }
    @PutMapping(value = "atualizar")
    public ResponseEntity<ProdutoResponse> atualizarPorId(@RequestBody ProdutoRequest request){

        ProdutoModel model = ProdutoMapper.toPorduto(request);
        ProdutoModel modelAtualizado = service.atualizarPorId(model).getBody();
        ProdutoResponse response = ProdutoMapper.toProdutoResponse(modelAtualizado);

        return ResponseEntity.status(HttpStatus.OK).body(response);

    }

}
