package br.com.estudo.petshop.springBootPetShop.model;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name = "pedidos")
public class PedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double valorTotal;
    @Deprecated
    public PedidoModel() {
    }

    public PedidoModel(Integer id, Double valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;


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

