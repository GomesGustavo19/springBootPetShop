package br.com.estudo.petshop.springBootPetShop.dto.resquest;

import lombok.*;

@Setter
@Getter
public class ProdutoRequest {

    private Integer id;
    private int codigoDoProduto;
    private String nomeDoProduto;
    private double valor;
    private int quantidade;
}
