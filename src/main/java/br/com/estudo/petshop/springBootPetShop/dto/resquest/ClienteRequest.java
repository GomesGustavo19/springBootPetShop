package br.com.estudo.petshop.springBootPetShop.dto.resquest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {
    private Integer id;
    private String nomeDoDono;
    private String documentoCPF;
    private String nomeDoPet;
    private String cep;


}
