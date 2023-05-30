package br.com.estudo.petshop.springBootPetShop.dto.resquest;

public class CategoriaRequest {

    private Integer id;
    private String categoria;

    public CategoriaRequest() {
    }

    public CategoriaRequest(Integer id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
