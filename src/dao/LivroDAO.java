/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Livro;
import services.EditoraServicos;
import services.ServicosFactory;

/**
 *
 * @author 182120023
 */
public class LivroDAO {

    public void cadastrarLivroDAO(Livro liVO) {
        try {
            Connection con = conexao.Conexao.getConexao();
            String sql = "insert into livros values (null, ?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, liVO.getTitulo());
            pst.setString(2, liVO.getAutor());
            pst.setString(3, liVO.getAssunto());
            pst.setString(4, liVO.getIsbn());
            pst.setInt(5, liVO.getEstoque());
            pst.setFloat(6, liVO.getPreco());
            pst.setInt(7, liVO.getIdEditora().getIdEditora());
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar livro!\n" + e.getMessage());
        }
    }// fim cadastro de livro na editora

    public ArrayList<Livro> listarLivrosDAO() {
        ArrayList<Livro> livros = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "select livros.*, e.cnpj from livros "
                    + "join editora e using(ideditora)";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            EditoraServicos editoraS = ServicosFactory.getEditoraServicos();
            while (rs.next()) {
                Livro li = new Livro();
                //lado do java |x| (lado do banco)
                li.setIdLivro(rs.getInt("idlivro"));
                li.setTitulo(rs.getString("titulo"));
                li.setAutor(rs.getString("autor"));
                li.setAssunto(rs.getString("assunto"));
                li.setIsbn(rs.getString("isbn"));
                li.setEstoque(rs.getInt("estoque"));
                li.setPreco(rs.getFloat("preco"));
                li.setIdEditora(editoraS.buscarEditoraByCNPJ(rs.getString("cnpj")));
                livros.add(li);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar livros!\n"
                    + ex.getMessage());
        }
        return livros;
    }//fim do listar

    public Livro getLivroByISBN(String isbn) {
        Livro li = new Livro();
        EditoraServicos editoraS = ServicosFactory.getEditoraServicos();// consultar editoraS
        try {
            Connection con = Conexao.getConexao();
            String sql = "select livros.*, e.cnpj from livros "
                    + "join editora e using(ideditora) where isbn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, isbn);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                li.setIdLivro(rs.getInt("idlivro"));
                li.setTitulo(rs.getString("titulo"));
                li.setAutor(rs.getString("autor"));
                li.setAssunto(rs.getString("assunto"));
                li.setIsbn(rs.getString("isbn"));
                li.setEstoque(rs.getInt("estoque"));
                li.setPreco(rs.getFloat("preco"));
                li.setIdEditora(editoraS.buscarEditoraByCNPJ(rs.getString("cnpj")));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar livro.\n" + e.getMessage());
        }
        return li;
    }// fim busca livro pelo isbn

    public void deletarLivroDAO(String isbn) {
        try {
            Connection con = conexao.Conexao.getConexao();
            String sql = "delete from livros where isbn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, isbn);
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao deletar livro.\n"
                    + e.getMessage());
        }
    }// fim deletar livro

    public void editarLivroDAO(Livro livroVO) {
        try {
            Connection con = conexao.Conexao.getConexao();
            String sql = "update livros set estoque = ?, preco = ? where isbn = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, livroVO.getEstoque());
            pst.setFloat(2, livroVO.getPreco());
            pst.setString(3, livroVO.getIsbn());
            pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar livro.\n" + e.getMessage());
        }
    }// fim atualizar livro

}
