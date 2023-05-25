package br.com.estudo.petshop.springBootPetShop.repository;

import br.com.estudo.petshop.springBootPetShop.model.PedidoModel;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<PedidoModel, Integer> {
}

