package br.com.estudo.petshop.springBootPetShop.dto.response;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CepResponse {

    private String cep;
    private String localidade;
    private String bairro;
    private String logradouro;
    private String complemento;
    private String numero;
}
