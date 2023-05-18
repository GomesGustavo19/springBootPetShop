package br.com.estudo.petshop.springBootPetShop.dto.response;

import lombok.*;

@Setter
@Getter
public class ProdutoResponse {

    private Integer id;
    private int codigoDoProduto;
    private String nomeDoProduto;
    private double valor;
    private int quantidade;

}
