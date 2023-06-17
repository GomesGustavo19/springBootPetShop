package br.com.estudo.petshop.springBootPetShop.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "pedidoProduto")
public class PedidoProdutoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cestaDeCompra_id", nullable = false)
    private CestaDeCompraModel cestaDeCompra;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private ClienteModel cliente;

    @Deprecated
    public PedidoProdutoModel() {
    }

    public PedidoProdutoModel(CestaDeCompraModel cestaDeCompra, ClienteModel cliente) {
        this.cestaDeCompra = cestaDeCompra;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CestaDeCompraModel getCestaDeCompra() {
        return cestaDeCompra;
    }

    public void setCestaDeCompra(CestaDeCompraModel cestaDeCompra) {
        this.cestaDeCompra = cestaDeCompra;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }
}
