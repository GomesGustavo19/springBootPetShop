package br.com.estudo.petshop.springBootPetShop.dto.response;

public class ClienteResponse {
    private Integer id;
    private String nomeDoDono;
    private String documentoCPF;
    private String nomeDoPet;
    private String cep;
    private String numeroResidencia;
    private String localidade;
    private String bairro;
    private String logradouro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public String getDocumentoCPF() {
        return documentoCPF;
    }

    public void setDocumentoCPF(String documentoCPF) {
        this.documentoCPF = documentoCPF;
    }

    public String getNomeDoPet() {
        return nomeDoPet;
    }

    public void setNomeDoPet(String nomeDoPet) {
        this.nomeDoPet = nomeDoPet;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(String numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
