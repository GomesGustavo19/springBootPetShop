package br.com.estudo.petshop.springBootPetShop.service;

import br.com.estudo.petshop.springBootPetShop.exception.PesquisaCepException;
import br.com.estudo.petshop.springBootPetShop.model.CepModel;
import br.com.estudo.petshop.springBootPetShop.model.ClienteModel;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class CepService {

    public CepModel pesquisarCep(String cep) {

        CepModel model = new CepModel();
        model.setCep(cep);

        try {
            URL consultaViaCep = new URL("https://viacep.com.br/ws/" + cep + "/json/");
            URLConnection connection = consultaViaCep.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader bfr = new BufferedReader(new InputStreamReader(is, "UTF-8"));

            String entradaDados = "";
            StringBuilder cepJason = new StringBuilder();

            while ((entradaDados = bfr.readLine()) != null) {
                cepJason.append(entradaDados);
            }

            CepModel cepModels = new Gson().fromJson(String.valueOf(cepJason), CepModel.class);

            model.setCep(cepModels.getCep());
            model.setLocalidade(cepModels.getLocalidade());
            model.setBairro(cepModels.getBairro());
            model.setLogradouro(cepModels.getLogradouro());

            System.out.println(cepJason);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return model;

    }

}
