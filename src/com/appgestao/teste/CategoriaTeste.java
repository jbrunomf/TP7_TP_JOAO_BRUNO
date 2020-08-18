package com.appgestao.teste;

import com.appgestao.dao.CategoriaDao;
import com.appgestao.model.Categoria;

public class CategoriaTeste {

    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setNome("Mouses");

        CategoriaDao.incluir(categoria);
    }
}
