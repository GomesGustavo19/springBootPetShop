package br.com.estudo.petshop.springBootPetShop.dto.resquest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {

    private Integer id;
    private int codigoDoProduto;
    private String nomeDoProduto;
    private double valor;
    private int quantidade;
}
