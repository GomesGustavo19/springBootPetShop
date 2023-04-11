package br.com.estudo.petshop.springBootPetShop.dto.resquest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CepRequest {

    private String cep;
    private String localidade;
    private String bairro;
    private String logradouro;
    private String complemento;
    private String numero;
}
