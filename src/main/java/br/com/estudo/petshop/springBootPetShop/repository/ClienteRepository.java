package br.com.estudo.petshop.springBootPetShop.repository;

import br.com.estudo.petshop.springBootPetShop.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {

    @Query("select obj from ClienteModel obj")
    List<ClienteModel> pesquisarPorTodos();
}
