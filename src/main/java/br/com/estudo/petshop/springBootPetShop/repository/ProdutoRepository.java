package br.com.estudo.petshop.springBootPetShop.repository;

import br.com.estudo.petshop.springBootPetShop.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {
   @Query("SELECT obj FROM ProdutoModel obj JOIN FETCH obj.categoria")
   List<ProdutoModel> produtoCategorizado();

}
