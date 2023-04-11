package br.com.estudo.petshop.springBootPetShop.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "cliente")
public class ClienteModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeDoDono;
    private String documentoCPF;
    private String nomeDoPet;
    private String cep;

}
