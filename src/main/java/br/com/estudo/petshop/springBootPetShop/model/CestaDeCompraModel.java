package br.com.estudo.petshop.springBootPetShop.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carrinho")
public class CestaDeCompraModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer idProduto;
    private String nomeProduto;
    private int quantidade;
    private Double valorUnitario;
    private Double valorTotal;

    @ManyToMany(mappedBy = "cestaDeCompra")
    List<ProdutoModel> produto = new ArrayList<>();

    @Deprecated
    public CestaDeCompraModel() {
    }

    public CestaDeCompraModel(Integer idproduto, String nomeProduto, int quantidade, Double valorUnitario, Double valorTotal) {
        this.idProduto = idproduto;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorTotal = valorTotal;
    }

    public CestaDeCompraModel(Integer idproduto, String nomeProduto, int quantidade, Double valorUnitario) {
        this.idProduto = idproduto;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public CestaDeCompraModel(CestaDeCompraModel cestaDeCompra) {
        this.idProduto = cestaDeCompra.getIdProduto();
        this.nomeProduto = cestaDeCompra.getNomeProduto();
        this.quantidade = cestaDeCompra.getQuantidade();
        this.valorUnitario = cestaDeCompra.valorUnitario;
        this.valorTotal = cestaDeCompra.getValorTotal();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ProdutoModel> getProduto() {
        return produto;
    }

    public void setProduto(List<ProdutoModel> produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "CestaDeCompraModel{" +
                "id_produto=" + idProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valorTotal +
                '}';
    }
}
