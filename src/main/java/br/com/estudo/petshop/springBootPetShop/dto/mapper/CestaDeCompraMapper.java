package br.com.estudo.petshop.springBootPetShop.dto.mapper;

import br.com.estudo.petshop.springBootPetShop.dto.response.CestaDeCompraResponse;
import br.com.estudo.petshop.springBootPetShop.dto.resquest.ProdutoRequest;
import br.com.estudo.petshop.springBootPetShop.model.CestaDeCompraModel;
import br.com.estudo.petshop.springBootPetShop.model.ProdutoModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CestaDeCompraMapper {

    public static CestaDeCompraModel toCestaDeCompra(ProdutoRequest request) {
        CestaDeCompraModel cestaDeCompraModel = new CestaDeCompraModel(request.getId(), request.getNomeDoProduto()
                , request.getQuantidadeEstoque(), request.getValor());
        return cestaDeCompraModel;
    }

    public static CestaDeCompraResponse toCestaDeCompraResponse(ProdutoModel model) {
        CestaDeCompraResponse cestaDeCompraResponse = new CestaDeCompraResponse(model.getId(), model.getNomeDoProduto()
                , model.getQuantidadeEstoque(), model.getValor());

        return cestaDeCompraResponse;

    }

    public static CestaDeCompraModel toProdutoListadoOptional(Optional<ProdutoModel> produtoListado) {

        CestaDeCompraModel model = new CestaDeCompraModel(produtoListado.get().getId()
                , produtoListado.get().getNomeDoProduto(), produtoListado.get().getQuantidadeEstoque()
                , produtoListado.get().getValor());

        return model;

    }

    public static ProdutoModel toItemCestaDeCompraResponse(CestaDeCompraModel modeloCesta) {

        ProdutoModel modeloProduto = new ProdutoModel();

        modeloProduto.setId(modeloCesta.getIdProduto());
        modeloProduto.setNomeDoProduto(modeloCesta.getNomeProduto());
        modeloProduto.setQuantidadeEstoque(modeloCesta.getQuantidade());
        modeloProduto.setValor(modeloCesta.getValorUnitario());

        return modeloProduto;

    }

    public static CestaDeCompraResponse toCestaDeCompraResponse(CestaDeCompraModel modelo) {
        CestaDeCompraResponse response = new CestaDeCompraResponse(modelo.getIdProduto(), modelo.getNomeProduto()
                , modelo.getQuantidade(), modelo.getValorUnitario(), modelo.getValorTotal());

        return response;
    }

    public static List<CestaDeCompraModel> toCestaDeCompraLista(List<CestaDeCompraModel> modelList) {

        List<CestaDeCompraModel> responseList = new ArrayList<>();

        for (CestaDeCompraModel modelo : modelList) {

            responseList.add(modelo);

        }

        return responseList;
    }


}
