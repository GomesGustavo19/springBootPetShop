package br.com.estudo.petshop.springBootPetShop.repository;

import br.com.estudo.petshop.springBootPetShop.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {
}
