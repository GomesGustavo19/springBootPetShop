package br.com.estudo.petshop.springBootPetShop.dto.resquest;

import br.com.estudo.petshop.springBootPetShop.model.CategoriaModel;

public class ProdutoRequest {

    private Integer id;
    private String nomeDoProduto;
    private double valor;
    private int quantidadeEstoque;
    private CategoriaRequest categoria;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public CategoriaRequest getCategoria() {
        return categoria;
    }
}
