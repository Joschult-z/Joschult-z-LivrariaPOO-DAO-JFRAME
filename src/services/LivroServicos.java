/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DAOFactory;
import dao.LivroDAO;
import java.util.ArrayList;
import model.Livro;

/**
 *
 * @author 182120023
 */
public class LivroServicos {

    public void cadastrarLivro(Livro livroVO) {
        LivroDAO livroDAO = DAOFactory.getLivroDAO();
        livroDAO.cadastrarLivroDAO(livroVO);
    }

    public ArrayList<Livro> listarLivrosDAO() {
        LivroDAO livroDAO = DAOFactory.getLivroDAO();
        return livroDAO.listarLivrosDAO();
    }

    public Livro buscaLivroISBN(String isbn) {
        LivroDAO livroDAO = DAOFactory.getLivroDAO();
        return livroDAO.getLivroByISBN(isbn);
    }

    public void deletarLivro(String isbn) {
        LivroDAO livroDAO = DAOFactory.getLivroDAO();
        livroDAO.deletarLivroDAO(isbn);
    }

    public void editarLivroDAO(Livro livroVO) {
        LivroDAO livroDAO = DAOFactory.getLivroDAO();
        livroDAO.editarLivroDAO(livroVO);
    }
}
