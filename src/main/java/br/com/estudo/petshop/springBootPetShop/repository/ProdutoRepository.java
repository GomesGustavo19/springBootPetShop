package br.com.estudo.petshop.springBootPetShop.repository;

import br.com.estudo.petshop.springBootPetShop.model.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Integer> {

   // @Query(nativeQuery = true,value = "select produtos.nomeDoProduto,categoria.categoria from produtos join categoria on produtos.categoria_id = categoria:id")
   // List<ProdutoModel> produtoCategorizado(Integer id);


}
