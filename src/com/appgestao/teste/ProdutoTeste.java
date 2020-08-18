package com.appgestao.teste;

import com.appgestao.dao.ProdutoDao;
import com.appgestao.model.Categoria;
import com.appgestao.model.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setNome("Teclado Master");
        p.setPreco(500.00f);
        ProdutoDao.incluir(p);

//        ProdutoDao.deletar(1);
    }
}
