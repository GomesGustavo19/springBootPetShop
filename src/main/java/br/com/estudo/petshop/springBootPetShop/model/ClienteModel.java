package br.com.estudo.petshop.springBootPetShop.model;

import br.com.estudo.petshop.springBootPetShop.validations.constrains.Cep;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.NotBlank;
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
    private String Cpf;
    private String nomeDoPet;
    @Cep
    private String cep;
    private String numeroResidencia;
    @NotBlank
    private String localidade;
    private String bairro;
    private String logradouro;

    public ClienteModel() {}

    public ClienteModel(Integer id, String nomeDoDono, String CPF, String nomeDoPet, String cep, String numeroResidencia, String localidade, String bairro, String logradouro) {
        this.id = id;
        this.nomeDoDono = nomeDoDono;
        this.Cpf = Cpf;
        this.nomeDoPet = nomeDoPet;
        this.cep = cep;
        this.numeroResidencia = numeroResidencia;
        this.localidade = localidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    public ClienteModel(String nomeDoDono, String cpf, String nomeDoPet, String cep, String numeroResidencia, String localidade, String bairro, String logradouro) {
        this.nomeDoDono = nomeDoDono;
        this.Cpf = cpf;
        this.nomeDoPet = nomeDoPet;
        this.cep = cep;
        this.numeroResidencia = numeroResidencia;
        this.localidade = localidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    public ClienteModel(ClienteModel clienteModel) {
        this.nomeDoDono = clienteModel.getNomeDoDono();
        this.Cpf = clienteModel.getCpf();
        this.nomeDoPet = clienteModel.getNomeDoPet();
        this.cep = clienteModel.getCep();
        this.numeroResidencia = clienteModel.getNumeroResidencia();
        this.localidade = clienteModel.getLocalidade();
        this.bairro = clienteModel.getBairro();
        this.logradouro = clienteModel.getLogradouro();

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
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
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
                ", Cpf='" + Cpf + '\'' +
                ", nomeDoPet='" + nomeDoPet + '\'' +
                ", cep='" + cep + '\'' +
                ", numeroResidencia='" + numeroResidencia + '\'' +
                ", localidade='" + localidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", logradouro='" + logradouro + '\'' +
                '}';
    }
}
