package br.com.estudo.petshop.springBootPetShop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    private String nomeDoDono;
    private String documentoCPF;
    private String nomeDoPet;
    private String endereco;


}
