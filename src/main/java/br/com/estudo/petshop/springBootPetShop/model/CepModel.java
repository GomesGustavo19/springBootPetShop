package br.com.estudo.petshop.springBootPetShop.model;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CepModel {
    private String cep;
    private String numeroResidencia;
    private String localidade;
    private String bairro;
    private String logradouro;

}
