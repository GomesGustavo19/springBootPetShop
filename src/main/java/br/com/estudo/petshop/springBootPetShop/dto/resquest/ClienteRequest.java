package br.com.estudo.petshop.springBootPetShop.dto.resquest;

public class ClienteRequest {
    private Integer id;
    private String nomeDoDono;
    private String cpf;
    private String nomeDoPet;
    private String cep;
    private String numeroResidencia;

    public ClienteRequest() {
    }

    public ClienteRequest(Integer id, String nomeDoDono, String cpf, String nomeDoPet, String cep, String numeroResidencia) {
        this.id = id;
        this.nomeDoDono = nomeDoDono;
        this.cpf = cpf;
        this.nomeDoPet = nomeDoPet;
        this.cep = cep;
        this.numeroResidencia = numeroResidencia;
    }

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
}
