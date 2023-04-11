package br.com.estudo.petshop.springBootPetShop.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponse {
    private Integer id;
    private String nomeDoDono;
    private String documentoCPF;
    private String nomeDoPet;
    private String cep;


}
