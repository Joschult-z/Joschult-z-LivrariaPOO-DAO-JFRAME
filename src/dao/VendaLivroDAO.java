/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.mysql.cj.xdevapi.PreparableStatement;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Livro;
import model.VendaLivro;

/**
 *
 * @author 182120023
 */
public class VendaLivroDAO {

    public void cadastrarVendaLivroDAO(VendaLivro vlVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "insert into pedidos values(null,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            // Converter LocalDate em date no Formato SQL
            java.sql.Date dataAtual = java.sql.Date.valueOf(vlVO.getDataVenda());
            pst.setDate(1, dataAtual);
            pst.setInt(2, vlVO.getIdCliente().getIdCliente());
            pst.setFloat(3, vlVO.getSubTotal());
            pst.executeUpdate();

            //inserir pedidos livros com base no array de livros da venda
            String sqlIdPedido = "select max(idpedido) as idpedido from pedidos";
            PreparedStatement pst2 = con.prepareStatement(sqlIdPedido);
            ResultSet rsIdPed = pst2.executeQuery();
            int idPedido = 0;
            while (rsIdPed.next()) {
                idPedido = rsIdPed.getInt("idpedido");
            }
            //inserir pedidos livros com base no array de livros da venda
            String sqlPedLivros = "insert into pedidoslivros values (?,?)";
            PreparedStatement pst3 = con.prepareStatement(sqlPedLivros);
            for (Livro livro : vlVO.getLivros()) {
                pst3.setInt(1, idPedido);
                pst3.setInt(2, livro.getIdLivro());
                pst3.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println("Erro ao realizar venda!\n" + e.getMessage());
        }
    }//fim cadastroVendaLivroDAO
}//fim classe
