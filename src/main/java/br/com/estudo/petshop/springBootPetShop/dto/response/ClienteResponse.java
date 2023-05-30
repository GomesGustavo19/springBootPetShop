package br.com.estudo.petshop.springBootPetShop.dto.response;

public class ClienteResponse {
    private Integer id;
    private String nomeDoDono;
    private String cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public void setNomeDoPet(String nomeDoPet) {
        this.nomeDoPet = nomeDoPet;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }


    public void setNumeroResidencia(String numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }


    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }


    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
