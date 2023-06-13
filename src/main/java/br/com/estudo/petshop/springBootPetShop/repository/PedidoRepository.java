package br.com.estudo.petshop.springBootPetShop.repository;

import br.com.estudo.petshop.springBootPetShop.model.PedidoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<PedidoModel, Integer> {
}

