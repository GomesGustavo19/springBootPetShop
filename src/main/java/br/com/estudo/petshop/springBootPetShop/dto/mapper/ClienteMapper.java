package br.com.estudo.petshop.springBootPetShop.dto.mapper;

import br.com.estudo.petshop.springBootPetShop.dto.response.ClienteResponse;
import br.com.estudo.petshop.springBootPetShop.dto.resquest.ClienteRequest;
import br.com.estudo.petshop.springBootPetShop.model.ClienteModel;

import java.util.*;
import java.util.concurrent.ExecutionException;

public class ClienteMapper {

    public static ClienteModel toCliente(ClienteRequest request){
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setNomeDoDono(request.getNomeDoDono());
        clienteModel.setDocumentoCPF(request.getDocumentoCPF());
        clienteModel.setNomeDoPet(request.getNomeDoPet());
        clienteModel.setCep(request.getCep());
        return clienteModel;

    }

    public static ClienteResponse toClienteReponse(ClienteModel clienteModel){
        ClienteResponse reponse = new ClienteResponse();
        reponse.setId(clienteModel.getId());
        reponse.setNomeDoDono(clienteModel.getNomeDoDono());
        reponse.setDocumentoCPF(clienteModel.getDocumentoCPF());
        reponse.setNomeDoPet(clienteModel.getNomeDoPet());
        reponse.setCep(clienteModel.getCep());

        return reponse;
    }

    public static List<ClienteResponse> toClienteListReponse(List<ClienteModel> modelListar){

        List<ClienteResponse> responseLista = new ArrayList<>();

        for (ClienteModel clienteModel : modelListar){

            ClienteResponse response = ClienteMapper.toClienteReponse(clienteModel);

            responseLista.add(response);

        }

        return responseLista;
    }
}
