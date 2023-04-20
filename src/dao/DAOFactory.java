/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author 182120023
 */
public class DAOFactory {

    private static ClienteDAO cDAO = new ClienteDAO();
    public static EditoraDAO eDAO = new EditoraDAO();
    private static LivroDAO livroDAO = new LivroDAO();
    private static VendaLivroDAO vDAO = new VendaLivroDAO();

    public static ClienteDAO getClienteDAO() {
        return cDAO;
    }

    public static EditoraDAO getEditoraDAO() {
        return eDAO;
    }

    public static LivroDAO getLivroDAO() {
        return livroDAO;
    }
    public static VendaLivroDAO getVendaLivroDAO(){
        return vDAO;
    }
}
