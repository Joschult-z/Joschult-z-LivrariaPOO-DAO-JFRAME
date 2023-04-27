/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author 182120023
 */
public class jfMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public jfMenu() {
        initComponents();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMI_Cliente = new javax.swing.JMenuItem();
        JMI_Editora = new javax.swing.JMenuItem();
        JMI_Livro = new javax.swing.JMenuItem();
        JM_VendaLivro = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Livraria");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 230, 104));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.setToolTipText("");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/livraria256px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        jMenuBar1.setForeground(new java.awt.Color(240, 240, 240));

        jMenu1.setMnemonic('G');
        jMenu1.setText("Gerenciar");

        JMI_Cliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        JMI_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon/flash-drive.png"))); // NOI18N
        JMI_Cliente.setMnemonic('C');
        JMI_Cliente.setText("Cliente");
        JMI_Cliente.setToolTipText("Cadastrar, Editar, Atualizar e Deletar Cliente");
        JMI_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_ClienteActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_Cliente);

        JMI_Editora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        JMI_Editora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon/companhia.png"))); // NOI18N
        JMI_Editora.setMnemonic('E');
        JMI_Editora.setText("Editora");
        JMI_Editora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_EditoraActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_Editora);

        JMI_Livro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        JMI_Livro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon/pilha-de-livros.png"))); // NOI18N
        JMI_Livro.setMnemonic('L');
        JMI_Livro.setText("Livro");
        JMI_Livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_LivroActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_Livro);

        jMenuBar1.add(jMenu1);

        JM_VendaLivro.setText("VendaLivro");
        jMenuBar1.add(JM_VendaLivro);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JMI_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_ClienteActionPerformed
        jfCliente janelaCliente = new jfCliente();
        janelaCliente.setVisible(true);
    }//GEN-LAST:event_JMI_ClienteActionPerformed

    private void JMI_EditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_EditoraActionPerformed
       jfEditora janelaEditora = new jfEditora();
       janelaEditora.setVisible(true);

    }//GEN-LAST:event_JMI_EditoraActionPerformed

    private void JMI_LivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_LivroActionPerformed
        jfLivro janelaLivro = new jfLivro();
        janelaLivro.setVisible(true);

    }//GEN-LAST:event_JMI_LivroActionPerformed

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
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMI_Cliente;
    private javax.swing.JMenuItem JMI_Editora;
    private javax.swing.JMenuItem JMI_Livro;
    private javax.swing.JMenu JM_VendaLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
