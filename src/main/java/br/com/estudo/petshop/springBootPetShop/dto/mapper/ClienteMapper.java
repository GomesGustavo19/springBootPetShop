package br.com.estudo.petshop.springBootPetShop.dto.mapper;

import br.com.estudo.petshop.springBootPetShop.dto.response.ClienteResponse;
import br.com.estudo.petshop.springBootPetShop.dto.resquest.ClienteRequest;
import br.com.estudo.petshop.springBootPetShop.exception.PesquisaCepException;
import br.com.estudo.petshop.springBootPetShop.model.CepModel;
import br.com.estudo.petshop.springBootPetShop.model.ClienteModel;
import br.com.estudo.petshop.springBootPetShop.service.CepService;

import java.util.*;

public class ClienteMapper {

    public static ClienteModel toCliente(ClienteRequest request) {
        ClienteModel clienteModel = new ClienteModel();
        CepService cepService = new CepService();
        CepModel cepModel = cepService.pesquisarCep(request.getCep());

        clienteModel.setNomeDoDono(request.getNomeDoDono());
        clienteModel.setCPF(request.getDocumentoCPF());
        clienteModel.setNomeDoPet(request.getNomeDoPet());
        clienteModel.setCep(request.getCep());
        clienteModel.setNumeroResidencia(request.getNumeroResidencia());
        clienteModel.setLocalidade(cepModel.getLocalidade());
        if (cepModel.getLocalidade() == null)
            throw new PesquisaCepException("CEP Informado invalido");
        clienteModel.setBairro(cepModel.getBairro());
        clienteModel.setLogradouro(cepModel.getLogradouro());

        return clienteModel;

    }

    public static ClienteResponse toClienteReponse(ClienteModel clienteModel) {
        ClienteResponse reponse = new ClienteResponse();

        reponse.setId(clienteModel.getId());
        reponse.setNomeDoDono(clienteModel.getNomeDoDono());
        reponse.setDocumentoCPF(clienteModel.getCPF());
        reponse.setNomeDoPet(clienteModel.getNomeDoPet());
        reponse.setCep(clienteModel.getCep());
        reponse.setNumeroResidencia(clienteModel.getNumeroResidencia());
        reponse.setLocalidade(clienteModel.getLocalidade());
        reponse.setBairro(clienteModel.getBairro());
        reponse.setLogradouro(clienteModel.getLogradouro());


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
