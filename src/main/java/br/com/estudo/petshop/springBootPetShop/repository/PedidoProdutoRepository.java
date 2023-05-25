package br.com.estudo.petshop.springBootPetShop.repository;

import br.com.estudo.petshop.springBootPetShop.model.PedidoProdutoModel;
import org.springframework.data.repository.CrudRepository;

public interface PedidoProdutoRepository extends CrudRepository<PedidoProdutoModel,Integer> {
}
