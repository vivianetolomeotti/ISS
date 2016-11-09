/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import org.hibernate.Session;
import plasnedo.util.HibernateUtil;

/**
 *
 * @author viviane
 */
public class PrincipalFrame extends javax.swing.JFrame {

    /**
     * Creates new form PessoaFisicaFrame
     */
    public PrincipalFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField14 = new javax.swing.JTextField();
        plasnedoMenuBar = new javax.swing.JMenuBar();
        pessoaMenu = new javax.swing.JMenu();
        produtoMenu = new javax.swing.JMenu();
        pedido = new javax.swing.JMenu();
        financeiro = new javax.swing.JMenu();
        usuario = new javax.swing.JMenu();

        jTextField14.setText("jTextField14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pessoaMenu.setText("Pessoa");
        pessoaMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pessoaMenuMouseClicked(evt);
            }
        });
        pessoaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoaMenuActionPerformed(evt);
            }
        });
        plasnedoMenuBar.add(pessoaMenu);

        produtoMenu.setText("Produto");
        produtoMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produtoMenuMouseClicked(evt);
            }
        });
        produtoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoMenuActionPerformed(evt);
            }
        });
        plasnedoMenuBar.add(produtoMenu);

        pedido.setText("Pedido");
        pedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pedidoMouseClicked(evt);
            }
        });
        plasnedoMenuBar.add(pedido);

        financeiro.setText("Financeiro");
        financeiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                financeiroMouseClicked(evt);
            }
        });
        financeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financeiroActionPerformed(evt);
            }
        });
        plasnedoMenuBar.add(financeiro);

        usuario.setText("Usuário");
        plasnedoMenuBar.add(usuario);

        setJMenuBar(plasnedoMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pessoaMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pessoaMenuMouseClicked
        dispose(); 
        new PessoaFrame().setVisible(true);
                // TODO add your handling code here:
    }//GEN-LAST:event_pessoaMenuMouseClicked

    private void produtoMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produtoMenuMouseClicked
        dispose(); 
        new ProdutoFrame().setVisible(true);             // TODO add your handling code here:
    }//GEN-LAST:event_produtoMenuMouseClicked

    private void pessoaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoaMenuActionPerformed
        new PessoaFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_pessoaMenuActionPerformed

    private void produtoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoMenuActionPerformed
        new ProdutoFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_produtoMenuActionPerformed

    private void financeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financeiroActionPerformed
        //new FinanceiroFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_financeiroActionPerformed

    private void financeiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_financeiroMouseClicked
      // new FinanceiroFrame().setVisible(true);
       dispose();
    }//GEN-LAST:event_financeiroMouseClicked

    private void pedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pedidoMouseClicked
        new PedidoFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_pedidoMouseClicked

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
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
                Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu financeiro;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JMenu pedido;
    private javax.swing.JMenu pessoaMenu;
    private javax.swing.JMenuBar plasnedoMenuBar;
    private javax.swing.JMenu produtoMenu;
    private javax.swing.JMenu usuario;
    // End of variables declaration//GEN-END:variables
}
