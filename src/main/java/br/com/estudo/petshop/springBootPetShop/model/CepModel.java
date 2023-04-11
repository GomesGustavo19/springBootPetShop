package br.com.estudo.petshop.springBootPetShop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CepModel{

    private Integer id;
    private String cep;
    private String localidade;
    private String bairro;
    private String logradouro;
    private String complemento;
    private String numero;



}
