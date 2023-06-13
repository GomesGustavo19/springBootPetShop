package br.com.estudo.petshop.springBootPetShop.service;

import br.com.estudo.petshop.springBootPetShop.dto.mapper.CestaDeCompraMapper;
import br.com.estudo.petshop.springBootPetShop.dto.response.CestaDeCompraResponse;
import br.com.estudo.petshop.springBootPetShop.model.CestaDeCompraModel;
import br.com.estudo.petshop.springBootPetShop.model.ClienteModel;
import br.com.estudo.petshop.springBootPetShop.model.PedidoModel;
import br.com.estudo.petshop.springBootPetShop.model.ProdutoModel;
import br.com.estudo.petshop.springBootPetShop.repository.CestaDeCompraRepository;
import br.com.estudo.petshop.springBootPetShop.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CestaDeCompraService {

    @Autowired
    private ProdutoService produtoService;

    @Autowired
    private CestaDeCompraRepository repository;

    @Autowired
    private PedidoRepository pedidoRepository;


    public Optional<CestaDeCompraModel> cestaBasicaListado(Integer idPedido) {
        Optional<CestaDeCompraModel> cestaDeCompraModelList;
        cestaDeCompraModelList = repository.findById(idPedido);
        return cestaDeCompraModelList;

    }

    public CestaDeCompraModel carrinhoProduto(Integer idProduto) {

        List<CestaDeCompraModel> cestaDeCompraList = new ArrayList<CestaDeCompraModel>();

        PedidoModel buscarPedido = new PedidoModel();
        buscarPedido.setId(1);

        Optional<ProdutoModel> produtoListado = produtoService.pesquisarProdutoId(idProduto);
        Optional<CestaDeCompraModel> cestaExistante = cestaBasicaListado(buscarPedido.getId());

        CestaDeCompraModel cestaDeCompraModel = new CestaDeCompraModel();


        if (produtoListado.isPresent() && cestaExistante.isPresent()
                && produtoListado.get().getQuantidadeEstoque() >= cestaDeCompraModel.getQuantidade()
                && !(cestaExistante.get().getProduto().isEmpty())) {

            produtoListado.get().getCestaDeCompra().add(cestaExistante.get());

            cestaDeCompraModel.setIdProduto(produtoListado.get().getId());
            cestaDeCompraModel.setNomeProduto(produtoListado.get().getNomeDoProduto());
            cestaDeCompraModel.setQuantidade(2);
            cestaDeCompraModel.setValorUnitario(produtoListado.get().getValor());
            cestaDeCompraModel.setValorTotal(cestaDeCompraModel.getQuantidade() * produtoListado.get().getValor());

            cestaDeCompraList.add(cestaDeCompraModel);

            cestaExistante.get().setProduto(Collections.singletonList(produtoListado.get()));

            int contador = 0;

            Integer[] vetor = new Integer[cestaExistante.get().getProduto().size()];

            for (int i = 0; i < cestaExistante.get().getProduto().size(); i++) {

                vetor[i] = cestaExistante.get().getProduto().get(i).getId();

                if (vetor[i] == cestaExistante.get().getId()) {
                    contador++;
                    System.out.println("Adicionado ao carrinho");

                }

            }

            contador++;
            System.out.println("Qtd prd: " + contador);

            produtoListado.get().setQuantidadeEstoque(produtoListado.get().getQuantidadeEstoque() - cestaDeCompraModel.getQuantidade());
            System.out.println(produtoListado.get().getQuantidadeEstoque());


            return cestaDeCompraModel;

        } else {

            //Adicinando o produto ao carrinho
            cestaDeCompraModel.setIdProduto(produtoListado.get().getId());
            cestaDeCompraModel.setNomeProduto(produtoListado.get().getNomeDoProduto());
            cestaDeCompraModel.setQuantidade(2);
            cestaDeCompraModel.setValorUnitario(produtoListado.get().getValor());
            cestaDeCompraModel.setValorTotal(cestaDeCompraModel.getQuantidade() * produtoListado.get().getValor());

            //Salvar a quantidade no carrinho, e debitar a quantidade do estoque
            produtoListado.get().setQuantidadeEstoque(produtoListado.get().getQuantidadeEstoque() - cestaDeCompraModel.getQuantidade());

            //Calculo do valor total
            cestaDeCompraModel.setValorTotal(cestaDeCompraModel.getQuantidade() * produtoListado.get().getValor());

            //Produto adicionado ao carrinho
            cestaDeCompraList.add(cestaDeCompraModel);

            //Salva o produto com a nova quantidade
            produtoService.salvar(produtoListado.get());

            System.out.println("Adicionado pelo else");

            return cestaDeCompraModel;

        }


    }


}
