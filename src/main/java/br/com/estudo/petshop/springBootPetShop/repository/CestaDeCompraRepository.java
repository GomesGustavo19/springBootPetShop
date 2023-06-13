package br.com.estudo.petshop.springBootPetShop.repository;

import br.com.estudo.petshop.springBootPetShop.model.CestaDeCompraModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CestaDeCompraRepository extends CrudRepository<CestaDeCompraModel, Integer> {
}
