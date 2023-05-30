package br.com.estudo.petshop.springBootPetShop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidoProduto")
public class PedidoProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private ProdutoModel produto;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private PedidoModel pedido;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private ClienteModel cliente;

    private String quantiade;

    @Deprecated
    public PedidoProdutoModel() {
    }

    public PedidoProdutoModel(Integer id, ProdutoModel produto, PedidoModel pedido, ClienteModel cliente, String quantiade) {
        this.id = id;
        this.produto = produto;
        this.pedido = pedido;
        this.cliente = cliente;
        this.quantiade = quantiade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProdutoModel getProduto() {
        return produto;
    }

    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }

    public PedidoModel getPedido() {
        return pedido;
    }

    public void setPedido(PedidoModel pedido) {
        this.pedido = pedido;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public String getQuantiade() {
        return quantiade;
    }

    public void setQuantiade(String quantiade) {
        this.quantiade = quantiade;
    }

    @Override
    public String toString() {
        return "PedidoProduto{" +
                "produto=" + produto +
                ", pedido=" + pedido +
                ", cliente=" + cliente +
                '}';
    }
}
