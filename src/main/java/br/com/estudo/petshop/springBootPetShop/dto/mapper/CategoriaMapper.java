package br.com.estudo.petshop.springBootPetShop.dto.mapper;

import br.com.estudo.petshop.springBootPetShop.dto.response.CategoriaResponse;
import br.com.estudo.petshop.springBootPetShop.dto.resquest.CategoriaRequest;
import br.com.estudo.petshop.springBootPetShop.model.CategoriaModel;

public class CategoriaMapper {

    public static CategoriaModel toCategoria(CategoriaRequest request){
        CategoriaModel model =  new CategoriaModel();

        model.setId(request.getId());
        model.setCategoria(request.getCategoria());

        return model;
    }

    public static CategoriaResponse toCategoriaResponse(CategoriaModel model){
        CategoriaResponse response = new CategoriaResponse();

        response.setId(model.getId());
        response.setCategoria(model.getCategoria());

        return response;

    }
}
