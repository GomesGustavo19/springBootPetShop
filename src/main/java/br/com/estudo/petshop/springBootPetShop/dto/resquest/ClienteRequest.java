package br.com.estudo.petshop.springBootPetShop.dto.resquest;

import lombok.*;

@Setter
@Getter
public class ClienteRequest {
    private Integer id;
    private String nomeDoDono;
    private String documentoCPF;
    private String nomeDoPet;
    private String cep;
    private String numeroResidencia;

}
