package br.com.estudo.petshop.springBootPetShop.service;

import br.com.estudo.petshop.springBootPetShop.model.CestaDeCompraModel;
import br.com.estudo.petshop.springBootPetShop.model.ProdutoModel;
import br.com.estudo.petshop.springBootPetShop.repository.CestaDeCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CestaDeCompraService {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private CestaDeCompraRepository repository;

    public Optional<CestaDeCompraModel> cestaBasicaListado(Integer idPedido) {
        Optional<CestaDeCompraModel> cestaDeCompraModelList;
        cestaDeCompraModelList = repository.findById(idPedido);
        return cestaDeCompraModelList;

    }

    public CestaDeCompraModel carrinhoProduto(Integer idProduto, Integer qtd) {

        CestaDeCompraModel cestaDeCompraModel = new CestaDeCompraModel();

        cestaDeCompraModel.setId(1);

        Optional<ProdutoModel> produtoListado = produtoService.pesquisarProdutoId(idProduto);
        Optional<CestaDeCompraModel> cestaExistante = cestaBasicaListado(cestaDeCompraModel.getId());


        if (produtoListado.isPresent() && cestaExistante.isPresent()) {

            cestaDeCompraModel.setIdProduto(produtoListado.get().getId());
            cestaDeCompraModel.setNomeProduto(produtoListado.get().getNomeDoProduto());
            cestaDeCompraModel.setValorUnitario(produtoListado.get().getValor());
            cestaDeCompraModel.setQuantidade(qtd);
            cestaDeCompraModel.setValorTotal(cestaDeCompraModel.getQuantidade() * produtoListado.get().getValor());

            if (cestaExistante.get().getIdProduto() == produtoListado.get().getId()) {
                cestaDeCompraModel.setQuantidade(qtd + cestaExistante.get().getQuantidade());
                cestaDeCompraModel.setValorTotal(cestaDeCompraModel.getQuantidade() * produtoListado.get().getValor());
                cestaDeCompraModel.getProduto().add(produtoListado.get());
                repository.save(cestaDeCompraModel);
            } else {
                cestaExistante.get().setProduto(cestaDeCompraModel.getProduto());
                repository.save(cestaDeCompraModel);
            }

            produtoListado.get().setQuantidadeEstoque(produtoListado.get().getQuantidadeEstoque() - cestaDeCompraModel.getQuantidade());
            System.out.println(produtoListado.get().getQuantidadeEstoque());

            produtoService.salvar(produtoListado.get());

            return cestaDeCompraModel;

        } else {

            //Adicinando o produto ao carrinho
            cestaDeCompraModel.setIdProduto(produtoListado.get().getId());
            cestaDeCompraModel.setNomeProduto(produtoListado.get().getNomeDoProduto());
            cestaDeCompraModel.setQuantidade(qtd);
            cestaDeCompraModel.setValorUnitario(produtoListado.get().getValor());
            cestaDeCompraModel.setValorTotal(cestaDeCompraModel.getQuantidade() * produtoListado.get().getValor());

            //Salvar a quantidade no carrinho, e debitar a quantidade do estoque
            produtoListado.get().setQuantidadeEstoque(produtoListado.get().getQuantidadeEstoque() - cestaDeCompraModel.getQuantidade());

            //Calculo do valor total
            cestaDeCompraModel.setValorTotal(cestaDeCompraModel.getQuantidade() * produtoListado.get().getValor());

            //Salva o produto com a nova quantidade
            produtoService.salvar(produtoListado.get());

            repository.save(cestaDeCompraModel);

            System.out.println("Adicionado pelo else");

            return cestaDeCompraModel;

        }

    }


}
