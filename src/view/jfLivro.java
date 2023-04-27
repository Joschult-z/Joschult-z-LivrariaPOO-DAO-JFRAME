/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Util.Validadores;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Livro;
import services.EditoraServicos;
import services.LivroServicos;
import services.ServicosFactory;
import model.Editora;

/**
 *
 * @author joaocs.silva
 */
public class jfLivro extends javax.swing.JFrame {

    /**
     * Creates new form jfLivro
     */
    public jfLivro() {
        initComponents();
        addRowToTable();
        jb_Deletar.setVisible(false);
        jb_Editar.setEnabled(false);
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlTituloLivro = new javax.swing.JLabel();
        jlAutorLivro = new javax.swing.JLabel();
        jlAssuntoLivro = new javax.swing.JLabel();
        jlIsbnLivro = new javax.swing.JLabel();
        jlEstoqueLivro = new javax.swing.JLabel();
        jlPrecoLivro = new javax.swing.JLabel();
        jtfTituloLivro = new javax.swing.JTextField();
        jtfAssuntoLivro = new javax.swing.JTextField();
        jtfAutorLivro = new javax.swing.JTextField();
        jtfEstoqueLivro = new javax.swing.JTextField();
        jtfPrecoLivro = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtLivro = new javax.swing.JTable();
        jb_Salvar = new javax.swing.JButton();
        jb_Editar = new javax.swing.JButton();
        jb_Limpar = new javax.swing.JButton();
        jb_Cancelar = new javax.swing.JButton();
        jb_Deletar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfCNPJEditoraLivro = new javax.swing.JTextField();
        jtfISBN = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Livro Management");

        jlTituloLivro.setText("Título:");

        jlAutorLivro.setText("Autor:");

        jlAssuntoLivro.setText("Assunto:");

        jlIsbnLivro.setText("ISBN:");

        jlEstoqueLivro.setText("Estoque:");

        jlPrecoLivro.setText("Preço:");

        jtfTituloLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTituloLivroActionPerformed(evt);
            }
        });
        jtfTituloLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTituloLivroKeyTyped(evt);
            }
        });

        jtfAssuntoLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAssuntoLivroKeyTyped(evt);
            }
        });

        jtfAutorLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAutorLivroKeyTyped(evt);
            }
        });

        jtfEstoqueLivro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEstoqueLivroKeyTyped(evt);
            }
        });

        jtfPrecoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPrecoLivroActionPerformed(evt);
            }
        });

        jtLivro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jtLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Assunto", "ISBN", "Estoque", "Preço", "Editora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLivro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtLivroMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtLivro);

        jb_Salvar.setText("Salvar");
        jb_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SalvarActionPerformed(evt);
            }
        });

        jb_Editar.setText("Editar");
        jb_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_EditarActionPerformed(evt);
            }
        });

        jb_Limpar.setText("Limpar");
        jb_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_LimparActionPerformed(evt);
            }
        });

        jb_Cancelar.setText("Cancelar");
        jb_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_CancelarActionPerformed(evt);
            }
        });

        jb_Deletar.setText("Deletar");
        jb_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_DeletarActionPerformed(evt);
            }
        });

        jLabel3.setText("*Editora");

        jtfCNPJEditoraLivro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCNPJEditoraLivroFocusLost(evt);
            }
        });

        jtfISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfISBNActionPerformed(evt);
            }
        });
        jtfISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfISBNKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jb_Salvar)
                .addGap(18, 18, 18)
                .addComponent(jb_Editar)
                .addGap(18, 18, 18)
                .addComponent(jb_Deletar)
                .addGap(18, 18, 18)
                .addComponent(jb_Limpar)
                .addGap(18, 18, 18)
                .addComponent(jb_Cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlAssuntoLivro)
                            .addComponent(jlTituloLivro)
                            .addComponent(jlEstoqueLivro)
                            .addComponent(jlIsbnLivro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfAssuntoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlPrecoLivro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPrecoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCNPJEditoraLivro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfISBN)
                                .addGap(18, 18, 18)
                                .addComponent(jlAutorLivro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtfTituloLivro)
                            .addComponent(jtfEstoqueLivro)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTituloLivro)
                    .addComponent(jtfTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIsbnLivro)
                    .addComponent(jlAutorLivro)
                    .addComponent(jtfAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlEstoqueLivro)
                    .addComponent(jtfEstoqueLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlPrecoLivro)
                        .addComponent(jtfPrecoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jtfCNPJEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlAssuntoLivro)
                        .addComponent(jtfAssuntoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Editar)
                    .addComponent(jb_Salvar)
                    .addComponent(jb_Deletar)
                    .addComponent(jb_Limpar)
                    .addComponent(jb_Cancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTituloLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTituloLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTituloLivroActionPerformed

    private void jtfTituloLivroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTituloLivroKeyTyped
        // TODO add your handling code here:
        String Letras = "0123456789<>:?/~^}][{´`=+-_!|'\'@#$%¨&*()²³£¢¬§º°ª";
        if (Letras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfTituloLivroKeyTyped

    private void jb_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_LimparActionPerformed
        // TODO add your handling code here:
        jtfTituloLivro.setText("");
        jtfAutorLivro.setText("");
        jtfAssuntoLivro.setText("");
        jtfISBN.setText("");
        jtfEstoqueLivro.setText("");
        jtfPrecoLivro.setText("");
        jtfTituloLivro.requestFocus();

    }//GEN-LAST:event_jb_LimparActionPerformed

    private void jb_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_CancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jb_CancelarActionPerformed

    private void jtfAutorLivroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAutorLivroKeyTyped
        // TODO add your handling code here:
        String Letras = "0123456789<>:?/~^}][{´`=+-_!|'\'@#$%¨&*()²³£¢¬§º°ª";
        if (Letras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfAutorLivroKeyTyped

    private void jtfAssuntoLivroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAssuntoLivroKeyTyped
        // TODO add your handling code here:
        String Letras = "0123456789<>:?/~^}][{´`=+-_!|'\'@#$%¨&*()²³£¢¬§º°ª";
        if (Letras.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtfAssuntoLivroKeyTyped

    private void jtfPrecoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecoLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfPrecoLivroActionPerformed

    private void jb_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalvarActionPerformed
        // TODO add your handling code here:
        if (validaInputs()) {
            //pegar dados da tela para salvar
            int idLivro = 0;
            String TituloLivro = jtfTituloLivro.getText().toUpperCase();
            String isbn = jtfISBN.getText();
            String autor = jtfAutorLivro.getText();
            int estoque = Integer.parseInt(jtfEstoqueLivro.getText());
            String assunto = jtfAssuntoLivro.getText();
            float preco = Float.parseFloat(jtfPrecoLivro.getText());
            EditoraServicos editoraS = ServicosFactory.getEditoraServicos();
            Editora editora = editoraS.buscarEditoraByCNPJ(jtfISBN.getText());
            LivroServicos livroS = ServicosFactory.getLivroServicos();

            Livro li = new Livro(idLivro, assunto, autor, assunto, isbn, estoque, preco, editora);
            if (jb_Salvar.getText().equals("Salvar")) {
                livroS.cadastrarLivro(li);
            } else {
                livroS.editarLivroDAO(li);
                jb_Limpar.doClick();
            }
            limparCampos();
            addRowToTable();
        }

    }//GEN-LAST:event_jb_SalvarActionPerformed

    private void jtLivroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtLivroMouseClicked
        // TODO add your handling code here:
        jb_Editar.setEnabled(true);
        jb_Deletar.setVisible(true);
    }//GEN-LAST:event_jtLivroMouseClicked

    private void jtfEstoqueLivroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEstoqueLivroKeyTyped
        // TODO add your handling code here:
        somenteNum(evt);
    }//GEN-LAST:event_jtfEstoqueLivroKeyTyped

    private void jtfISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfISBNActionPerformed

    private void jtfISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfISBNKeyTyped
        // TODO add your handling code here:
        somenteNum(evt);
    }//GEN-LAST:event_jtfISBNKeyTyped

    private void jtfCNPJEditoraLivroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCNPJEditoraLivroFocusLost
        // TODO add your handling code here:
        EditoraServicos editoraS = ServicosFactory.getEditoraServicos();
        Editora edi = editoraS.buscarEditoraByCNPJ(jtfCNPJEditoraLivro.getText());
        if (edi.getCnpj() == null) {
            JOptionPane.showMessageDialog(this, "Editora não cadastrada!",
                    "Pesquisa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Object[] resp = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this, "Editora" + edi.getNmEditora() + "está correta?", "Pesquisa", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.WARNING_MESSAGE, 
                null, resp, resp[0]);

            if (resposta == 1) {
                jtfCNPJEditoraLivro.setText("");
                jtfCNPJEditoraLivro.requestFocus();
            }
        }
    }//GEN-LAST:event_jtfCNPJEditoraLivroFocusLost

    private void jb_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_DeletarActionPerformed
        // TODO add your handling code here:
        jb_Salvar.setText("Confirmar");
        jtfISBN.setEnabled(false);
        jb_Limpar.setText("Cancelar");
        jb_Deletar.setVisible(false);

        int linha;
        String isbn;
        linha = jtLivro.getSelectedRow();
        isbn = (String) jtLivro.getValueAt(linha, 0);
        EditoraServicos ediS = ServicosFactory.getEditoraServicos();
        Editora edi = ediS.buscarEditoraByCNPJ(isbn);
        Object[] resp = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(this,
                "Deseja realmente deletar este CNPJ?", "Deletar",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null, resp, resp[0]);
        if (resposta == 0) {
            ediS.deletarEditora(isbn);
            addRowToTable();
            JOptionPane.showMessageDialog(this,
                    "Chinelagem deletada com sucesso meu truta!");
        } else {
            JOptionPane.showMessageDialog(this,
                    "Ok, entendo sua decisão");
        }
        
    }//GEN-LAST:event_jb_DeletarActionPerformed

    private void jb_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_EditarActionPerformed
        // TODO add your handling code here:
        jb_Salvar.setText("Confirmar");
        jtfISBN.setEnabled(false);
        jb_Limpar.setText("Cancelar");
        jb_Deletar.setVisible(false);

        int linha;
        linha = jtLivro.getSelectedRow();
        String isbn = (String) jtLivro.getValueAt(linha, 0);
        LivroServicos livroS = ServicosFactory.getLivroServicos();
        Livro li = livroS.buscaLivroISBN(isbn);
        //carregar dados do form
        jtfISBN.setText(get);
        jtfCNPJ.setText(cnpj);
        jtfEnderecoEditora.setText(Endereco);
        jffTelefoneEditora.setText(Telefone);
        jtfNomeEditora.requestFocus();
    }//GEN-LAST:event_jb_EditarActionPerformed

    /**
         * @param args the command line arguments
         */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfLivro().setVisible(true);
            }
        });
    }

    public void addRowToTable() {
        DefaultTableModel model = (DefaultTableModel) jtLivro.getModel();
        model.getDataVector().removeAllElements();//remove todas as linhas
        model.fireTableDataChanged();
        Object rowData[] = new Object[7];
        LivroServicos livroS = ServicosFactory.getLivroServicos();
        for (Livro li : livroS.listarLivrosDAO()) {
            rowData[0] = li.getTitulo();
            rowData[1] = li.getAutor();
            rowData[2] = li.getAssunto();
            rowData[3] = li.getIsbn();
            rowData[4] = li.getEstoque();
            rowData[5] = li.getPreco();
            rowData[6] = li.getIdEditora().getNmEditora();
            model.addRow(rowData);
        }

    }

    public boolean validaInputs() {
        if (jtfTituloLivro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Título!");
            jtfTituloLivro.requestFocus();
            return false;
        } else if (jtfISBN.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher ISBN!");
            jtfISBN.requestFocus();
            return false;

        } else if (jtfAutorLivro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Autor!");
            jtfAutorLivro.requestFocus();
            return false;

        } else if (jtfEstoqueLivro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Estoque!!");
            jtfEstoqueLivro.requestFocus();
            return false;

        } else if (jtfAssuntoLivro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Assunto!");
            jtfAssuntoLivro.requestFocus();
            return false;
        } else if (jtfPrecoLivro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Preço!");
            jtfPrecoLivro.requestFocus();
            return false;
        } else if (jtfCNPJEditoraLivro.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencher Editora!");
            jtfCNPJEditoraLivro.requestFocus();
            return false;
        }
        return true;
    }

    public void limparCampos() {
        jtfTituloLivro.setText("");
        jtfISBN.setText("");
        jtfAutorLivro.setText("");
        jtfEstoqueLivro.setText("");
        jtfAssuntoLivro.setText("");
        jtfPrecoLivro.setText("");
        jtfCNPJEditoraLivro.setText("");
        jtfTituloLivro.requestFocus();
    }

    public void somenteNum(java.awt.event.KeyEvent evt) {
        String number = "0123456789";
        if (jtfISBN.getText().length() < 14) {
            if (!number.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_Cancelar;
    private javax.swing.JButton jb_Deletar;
    private javax.swing.JButton jb_Editar;
    private javax.swing.JButton jb_Limpar;
    private javax.swing.JButton jb_Salvar;
    private javax.swing.JLabel jlAssuntoLivro;
    private javax.swing.JLabel jlAutorLivro;
    private javax.swing.JLabel jlEstoqueLivro;
    private javax.swing.JLabel jlIsbnLivro;
    private javax.swing.JLabel jlPrecoLivro;
    private javax.swing.JLabel jlTituloLivro;
    private javax.swing.JTable jtLivro;
    private javax.swing.JTextField jtfAssuntoLivro;
    private javax.swing.JTextField jtfAutorLivro;
    private javax.swing.JTextField jtfCNPJEditoraLivro;
    private javax.swing.JTextField jtfEstoqueLivro;
    private javax.swing.JTextField jtfISBN;
    private javax.swing.JTextField jtfPrecoLivro;
    private javax.swing.JTextField jtfTituloLivro;
    // End of variables declaration//GEN-END:variables
}
