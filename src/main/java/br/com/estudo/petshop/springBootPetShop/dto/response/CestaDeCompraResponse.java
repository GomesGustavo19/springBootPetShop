package br.com.estudo.petshop.springBootPetShop.dto.response;

public class CestaDeCompraResponse {

    private Integer idproduto;
    private String nomeProduto;
    private int quantidade;
    private Double valor;

    private Double valorTotal;

    public CestaDeCompraResponse() {
    }

    public CestaDeCompraResponse(Integer idproduto, String nomeProduto, int quantidade, Double valor) {
        this.idproduto = idproduto;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public CestaDeCompraResponse(Integer idproduto, String nomeProduto, int quantidade, Double valor, Double valorTotal) {
        this.idproduto = idproduto;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valor = valor;
        this.valorTotal = valorTotal;
    }

    public Integer getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(Integer idproduto) {
        this.idproduto = idproduto;
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

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "CestaDeCompraResponse{" +
                "idproduto=" + idproduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", quantidade=" + quantidade +
                ", valor=" + valor +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
