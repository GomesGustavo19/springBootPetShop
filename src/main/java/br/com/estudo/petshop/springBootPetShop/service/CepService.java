package br.com.estudo.petshop.springBootPetShop.service;

import br.com.estudo.petshop.springBootPetShop.dto.mapper.CepMapper;
import br.com.estudo.petshop.springBootPetShop.dto.response.CepResponse;
import br.com.estudo.petshop.springBootPetShop.model.CepModel;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@Service
public class CepService {

    public CepResponse pesquisarCep(String cep){

        CepModel cepModel = new CepModel();
        cepModel.setCep(cep);

        try {
            URL consultaViaCep = new URL("https://viacep.com.br/ws/"+cep+"/json/");
            URLConnection connection = consultaViaCep.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader bfr =  new BufferedReader(new InputStreamReader(is,"UTF-8"));

            String entradaDados = "";
            StringBuilder cepJason = new StringBuilder();

            while ((entradaDados = bfr.readLine()) != null){
                cepJason.append(entradaDados);
            }


            CepModel cepModels = new Gson().fromJson(String.valueOf(cepJason),CepModel.class);

            cepModel.setCep(cepModels.getCep());
            cepModel.setLocalidade(cepModels.getLocalidade());
            cepModel.setBairro(cepModels.getBairro());
            cepModel.setLogradouro(cepModels.getLogradouro());
            cepModel.setComplemento(cepModels.getComplemento());

            System.out.println(cepJason.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return CepMapper.toCepResponse(cepModel);

    }

}
