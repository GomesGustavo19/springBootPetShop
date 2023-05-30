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
    private String nomeDoProduto;
    private double valor;
    @Column(name = "quantidade")
    private int quantidadeEstoque;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaModel categoria;

    @Deprecated
    public ProdutoModel() {
    }

    public ProdutoModel(Integer id, String nomeDoProduto, double valor, int quantidade, CategoriaModel categoria) {
        this.id = id;
        this.nomeDoProduto = nomeDoProduto;
        this.valor = valor;
        this.quantidadeEstoque = quantidade;
        this.categoria = categoria;
    }

    public ProdutoModel(ProdutoModel model) {

        this.id = model.getId();
        this.nomeDoProduto = model.getNomeDoProduto();
        this.valor = model.getValor();
        this.quantidadeEstoque = model.getQuantidadeEstoque();
        this.categoria = model.getCategoria();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
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
                ", nomeDoProduto='" + nomeDoProduto + '\'' +
                ", valor=" + valor +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", categoria=" + categoria +
                '}';
    }
}
