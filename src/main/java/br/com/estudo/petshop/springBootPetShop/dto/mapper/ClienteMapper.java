package br.com.estudo.petshop.springBootPetShop.dto.mapper;

import br.com.estudo.petshop.springBootPetShop.dto.response.ClienteResponse;
import br.com.estudo.petshop.springBootPetShop.dto.resquest.ClienteRequest;
import br.com.estudo.petshop.springBootPetShop.model.CepModel;
import br.com.estudo.petshop.springBootPetShop.model.ClienteModel;
import br.com.estudo.petshop.springBootPetShop.service.CepService;

import java.util.ArrayList;
import java.util.List;

public class ClienteMapper {

    public static ClienteModel toCliente(ClienteRequest request) {
        CepService cepService = new CepService();
        CepModel cepModel = cepService.pesquisarCep(request.getCep());
        ClienteModel clienteModel = new ClienteModel();

        clienteModel.setNomeDoDono(request.getNomeDoDono());
        clienteModel.setCpf(request.getCpf());
        clienteModel.setNomeDoPet(request.getNomeDoPet());
        clienteModel.setCep(request.getCep());
        clienteModel.setNumeroResidencia(request.getNumeroResidencia());
        clienteModel.setLocalidade(cepModel.getLocalidade());
        clienteModel.setBairro(cepModel.getBairro());
        clienteModel.setLogradouro(cepModel.getLogradouro());

        return clienteModel;

    }

    public static ClienteResponse toClienteReponse(ClienteModel model) {
        ClienteResponse reponse = new ClienteResponse();

        reponse.setId(model.getId());
        reponse.setNomeDoDono(model.getNomeDoDono());
        reponse.setCpf(model.getCpf());
        reponse.setNomeDoPet(model.getNomeDoPet());
        reponse.setCep(model.getCep());
        reponse.setNumeroResidencia(model.getNumeroResidencia());
        reponse.setLocalidade(model.getLocalidade());
        reponse.setBairro(model.getBairro());
        reponse.setLogradouro(model.getLogradouro());

        return reponse;
    }

    public static List<ClienteResponse> toClienteListReponse(List<ClienteModel> modelListar) {

        List<ClienteResponse> responseLista = new ArrayList<>();

        for (ClienteModel model : modelListar) {

            ClienteResponse response = toClienteReponse(model);

            responseLista.add(response);

        }

        return responseLista;
    }
}
