package br.com.estudo.petshop.springBootPetShop.dto.response;

public class CategoriaResponse {

    private Integer id;
    private String categoria;

    public CategoriaResponse() {
    }

    public CategoriaResponse(Integer id, String categoria) {
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
