package br.com.estudo.petshop.springBootPetShop.dto.mapper;


import br.com.estudo.petshop.springBootPetShop.dto.response.CepResponse;
import br.com.estudo.petshop.springBootPetShop.dto.resquest.CepRequest;
import br.com.estudo.petshop.springBootPetShop.model.CepModel;

public class CepMapper {

    public static CepModel toCep(CepRequest request) {

        CepModel cepModel = new CepModel();
        request.setCep(request.getCep());
        return cepModel;

    }

    public static CepResponse toCepResponse(CepModel cepModel){

        CepResponse cepResponse = new CepResponse();

        cepResponse.setCep(cepModel.getCep());
        cepResponse.setLocalidade(cepModel.getLocalidade());
        cepResponse.setBairro(cepModel.getBairro());
        cepResponse.setLogradouro(cepModel.getLogradouro());
        return cepResponse;

        }


}
