package br.com.estudo.petshop.springBootPetShop.dto.mapper;

import br.com.estudo.petshop.springBootPetShop.dto.response.ProdutoResponse;
import br.com.estudo.petshop.springBootPetShop.dto.resquest.ProdutoRequest;
import br.com.estudo.petshop.springBootPetShop.model.ProdutoModel;

import java.util.ArrayList;
import java.util.List;

public class ProdutoMapper {

    public static ProdutoModel toPorduto(ProdutoRequest request) {
        ProdutoModel model = new ProdutoModel();
        model.setNomeDoProduto(request.getNomeDoProduto());
        model.setQuantidade(request.getQuantidade());
        model.setValor(request.getValor());
        model.setCategoria(request.getCategoria());

        return model;

    }

    public static ProdutoResponse toProdutoResponse(ProdutoModel prd) {
        ProdutoResponse response = new ProdutoResponse();
        response.setId(prd.getId());
        response.setNomeDoProduto(prd.getNomeDoProduto());
        response.setQuantidade(prd.getQuantidade());
        response.setValor(prd.getValor());
        response.setCategoria(prd.getCategoria());

        return response;
    }

    public static List<ProdutoResponse> toProdutoResponseList(List<ProdutoModel> prdList) {

        List<ProdutoResponse> modelsList = new ArrayList<>();

        for (ProdutoModel model : prdList) {

            ProdutoResponse response = toProdutoResponse(model);

            modelsList.add(response);

        }

        return modelsList;

    }

}
