package br.com.estudo.petshop.springBootPetShop.controller;

import br.com.estudo.petshop.springBootPetShop.dto.mapper.CestaDeCompraMapper;
import br.com.estudo.petshop.springBootPetShop.dto.response.CestaDeCompraResponse;
import br.com.estudo.petshop.springBootPetShop.model.CestaDeCompraModel;
import br.com.estudo.petshop.springBootPetShop.service.CestaDeCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "cestaDeCompra")
public class CestaDeCompraController {

    @Autowired
    private CestaDeCompraService service;

    @PutMapping(value = "carrinho")
    public CestaDeCompraResponse carrinho(@RequestParam("idProduto") Integer idProduto,@RequestParam("qtd") Integer qtd) {

        CestaDeCompraModel model = service.carrinhoProduto(idProduto,qtd);
        return CestaDeCompraMapper.toCestaDeCompraResponse(model);

    }

}
