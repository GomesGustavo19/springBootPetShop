package br.com.estudo.petshop.springBootPetShop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "produtos")
public class ProdutoModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int codigoDoProduto;
    private String nomeDoProduto;
    private double valor;
    private int quantidade;

}
