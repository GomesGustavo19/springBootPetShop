package br.com.estudo.petshop.springBootPetShop.dto.response;

import br.com.estudo.petshop.springBootPetShop.model.CategoriaModel;
import br.com.estudo.petshop.springBootPetShop.model.ProdutoModel;

import java.util.List;

public class ProdutoResponse {

    private Integer id;
    private String nomeDoProduto;
    private double valor;
    private int quantidadeEstoque;
    private CategoriaResponse categoria;

    public ProdutoResponse() {}

    public ProdutoResponse(Integer id, String nomeDoProduto, double valor, int quantidadeEstoque, CategoriaResponse categoria) {
        this.id = id;
        this.nomeDoProduto = nomeDoProduto;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
    }

    public ProdutoResponse(ProdutoResponse response) {
        this.id = response.getId();
        this.nomeDoProduto = response.getNomeDoProduto();
        this.valor = response.getValor();
        this.quantidadeEstoque = response.getQuantidadeEstoque();
        this.categoria = response.getCategoria();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setCategoria(CategoriaResponse categoria) {
        this.categoria = categoria;
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

    public CategoriaResponse getCategoria() {
        return categoria;
    }
}
