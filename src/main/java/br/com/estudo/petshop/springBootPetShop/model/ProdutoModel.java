package br.com.estudo.petshop.springBootPetShop.model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "produtos")
public class ProdutoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int codigoDoProduto;
    private String nomeDoProduto;
    private double valor;
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaModel categoria;

    @Deprecated
    public ProdutoModel() {}

    public ProdutoModel(Integer id, int codigoDoProduto, String nomeDoProduto, double valor, int quantidade, CategoriaModel categoria) {
        this.id = id;
        this.codigoDoProduto = codigoDoProduto;
        this.nomeDoProduto = nomeDoProduto;
        this.valor = valor;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public CategoriaModel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaModel categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdutoModel that = (ProdutoModel) o;
        return nomeDoProduto.equals(that.nomeDoProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeDoProduto);
    }

    @Override
    public String toString() {
        return "ProdutoModel{" +
                "id=" + id +
                ", codigoDoProduto=" + codigoDoProduto +
                ", nomeDoProduto='" + nomeDoProduto + '\'' +
                ", valor=" + valor +
                ", quantidade=" + quantidade +
                '}';
    }
}
