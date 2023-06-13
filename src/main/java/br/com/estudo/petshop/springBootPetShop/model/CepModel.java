package br.com.estudo.petshop.springBootPetShop.model;


import br.com.estudo.petshop.springBootPetShop.validations.constrains.Cep;

import java.io.Serializable;

public class CepModel implements Serializable {
    @Cep
    private String cep;
    private String numeroResidencia;
    private String localidade;
    private String bairro;
    private String logradouro;

    public CepModel() {}

    public CepModel(String cep, String numeroResidencia, String localidade, String bairro, String logradouro) {
        this.cep = cep;
        this.numeroResidencia = numeroResidencia;
        this.localidade = localidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
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


    @Override
    public String toString() {
        return "CepModel{" +
                "cep='" + cep + '\'' +
                ", numeroResidencia='" + numeroResidencia + '\'' +
                ", localidade='" + localidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                '}';
    }
}
