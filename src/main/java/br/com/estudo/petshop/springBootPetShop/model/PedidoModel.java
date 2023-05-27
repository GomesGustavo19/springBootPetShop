package br.com.estudo.petshop.springBootPetShop.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "pedidos")
public class PedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double valorTotal;

    @OneToMany(mappedBy = "pedido")
    private List<PedidoProdutoModel> pedidoProduto;

    @Deprecated
    public PedidoModel() {
    }

    public PedidoModel(Integer id, Double valorTotal, List<PedidoProdutoModel> pedidoProduto) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.pedidoProduto = pedidoProduto;
    }

    public Integer getId() {
        return id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<PedidoProdutoModel> getPedidoProduto() {
        return pedidoProduto;
    }

    public void setPedidoProduto(List<PedidoProdutoModel> pedidoProduto) {
        this.pedidoProduto = pedidoProduto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PedidoModel that = (PedidoModel) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PedidoModel{" +
                "id=" + id +
                ", valorTotal=" + valorTotal +
                '}';
    }
}

