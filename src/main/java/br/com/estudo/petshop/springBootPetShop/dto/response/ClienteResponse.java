package br.com.estudo.petshop.springBootPetShop.dto.response;

import br.com.estudo.petshop.springBootPetShop.model.CepModel;
import lombok.*;

@Setter
@Getter
public class ClienteResponse {
    private Integer id;
    private String nomeDoDono;
    private String documentoCPF;
    private String nomeDoPet;
    private String cep;
    private String numeroResidencia;
    private String localidade;
    private String bairro;
    private String logradouro;


}
