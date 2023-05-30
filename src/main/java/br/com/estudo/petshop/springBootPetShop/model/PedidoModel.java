package br.com.estudo.petshop.springBootPetShop.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;
@Entity
@Table(name = "pedidos")
public class PedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date data;
    private Double valorTotal;

    @Deprecated
    public PedidoModel() {
    }

    public PedidoModel(Integer id, Date data, Double valorTotal) {
        this.id = id;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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
                ", data=" + data +
                ", valorTotal=" + valorTotal +
                '}';
    }
}