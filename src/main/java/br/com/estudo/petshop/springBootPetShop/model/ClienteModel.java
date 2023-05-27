package br.com.estudo.petshop.springBootPetShop.model;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.br.CPF;


import java.io.Serializable;

@Entity
@Table(name = "cliente")
public class ClienteModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeDoDono;
    @CPF
    private String CPF;
    private String nomeDoPet;
    private String cep;
    private String numeroResidencia;
    private String localidade;
    private String bairro;
    private String logradouro;

    public ClienteModel() {}

    public ClienteModel(Integer id, String nomeDoDono, String CPF, String nomeDoPet, String cep, String numeroResidencia, String localidade, String bairro, String logradouro) {
        this.id = id;
        this.nomeDoDono = nomeDoDono;
        this.CPF = CPF;
        this.nomeDoPet = nomeDoPet;
        this.cep = cep;
        this.numeroResidencia = numeroResidencia;
        this.localidade = localidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    public Integer getId() {
        return id;
    }

    public String getNomeDoDono() {
        return nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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

    @Override
    public String toString() {
        return "ClienteModel{" +
                "id=" + id +
                ", nomeDoDono='" + nomeDoDono + '\'' +
                ", CPF='" + CPF + '\'' +
                ", nomeDoPet='" + nomeDoPet + '\'' +
                ", cep='" + cep + '\'' +
                ", numeroResidencia='" + numeroResidencia + '\'' +
                ", localidade='" + localidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                '}';
    }
}
