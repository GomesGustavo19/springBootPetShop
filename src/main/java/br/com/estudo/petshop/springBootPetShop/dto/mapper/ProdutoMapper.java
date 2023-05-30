package br.com.estudo.petshop.springBootPetShop.dto.mapper;

import br.com.estudo.petshop.springBootPetShop.dto.response.ProdutoResponse;
import br.com.estudo.petshop.springBootPetShop.dto.resquest.ProdutoRequest;
import br.com.estudo.petshop.springBootPetShop.model.ProdutoModel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoMapper {

    public static ProdutoModel toPorduto(ProdutoRequest request) {
        ProdutoModel model = new ProdutoModel();

        model.setNomeDoProduto(request.getNomeDoProduto());
        model.setQuantidadeEstoque(request.getQuantidadeEstoque());
        model.setValor(request.getValor());
        model.setCategoria(CategoriaMapper.toCategoria(request.getCategoria()));

        return model;
    }

    public static ProdutoModel toPordutoAtualizar(ProdutoRequest request) {
        ProdutoModel model = new ProdutoModel();

        model.setId(request.getId());
        model.setNomeDoProduto(request.getNomeDoProduto());
        model.setQuantidadeEstoque(request.getQuantidadeEstoque());
        model.setValor(request.getValor());
        model.setCategoria(CategoriaMapper.toCategoria(request.getCategoria()));

        return model;
    }

    public static ProdutoResponse toProdutoResponse(ProdutoModel model) {
        ProdutoResponse response = new ProdutoResponse();

        response.setId(model.getId());
        response.setNomeDoProduto(model.getNomeDoProduto());
        response.setQuantidadeEstoque(model.getQuantidadeEstoque());
        response.setValor(model.getValor());
        response.setCategoria(CategoriaMapper.toCategoriaResponse(model.getCategoria()));

        return response;
    }

    public static List<ProdutoResponse> toProdutoResponseList(List<ProdutoModel> produtoModelList) {

        List<ProdutoResponse> responseList = new ArrayList<>();

        for (ProdutoModel model : produtoModelList) {

            ProdutoResponse response = toProdutoResponse(model);

            responseList.add(response);

        }

        return responseList.stream().map(x -> new ProdutoResponse(x)).collect(Collectors.toList());

    }

}
