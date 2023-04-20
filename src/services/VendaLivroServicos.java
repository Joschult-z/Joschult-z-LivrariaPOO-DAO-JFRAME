/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DAOFactory;
import dao.VendaLivroDAO;
import model.VendaLivro;

/**
 *
 * @author 182120023
 */
public class VendaLivroServicos {

    public void vendaLivros(VendaLivro vlVO) {
        VendaLivroDAO vlDAO = DAOFactory.getVendaLivroDAO();
        vlDAO.cadastrarVendaLivroDAO(vlVO);
    }
}
