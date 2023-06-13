package br.com.estudo.petshop.springBootPetShop.dto.resquest;

public class CestaDeCompraRequest {

    private Integer id_produto;
    private String nomeProduto;
    private int quantidade;
    private Double valor;

    public CestaDeCompraRequest() {
    }

    public CestaDeCompraRequest(Integer id_produto, String nomeProduto, int quantidade, Double valor) {
        this.id_produto = id_produto;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public Integer getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto = id_produto;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "CestaDeCompraResponse{" +
                "id_produto=" + id_produto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                '}';
    }
}
