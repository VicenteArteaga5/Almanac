/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vergel;

/**
 *
 * @author vicente
 */
public class JF_Empleado extends javax.swing.JFrame {

    JF_Login jf_login;
    JF_Orden jf_orden;
    
    /**
     * Creates new form JF_Empleado
     */
    public JF_Empleado() {
        initComponents();
        this.setLocationRelativeTo(null);
        jf_orden = new JF_Orden(this);
    }
     
    public JF_Empleado(JF_Login jf_login) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jf_login = jf_login;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JP_cuerpo = new javax.swing.JPanel();
        jb_mesa1 = new javax.swing.JButton();
        jb_mesa2 = new javax.swing.JButton();
        jb_mesa4 = new javax.swing.JButton();
        jb_mesa3 = new javax.swing.JButton();
        jb_mesa7 = new javax.swing.JButton();
        jb_mesa8 = new javax.swing.JButton();
        jb_mesa5 = new javax.swing.JButton();
        jb_mesa6 = new javax.swing.JButton();
        jb_mesa9 = new javax.swing.JButton();
        jb_mesa10 = new javax.swing.JButton();
        jb_mesa11 = new javax.swing.JButton();
        jb_mesa12 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jb_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jb_mesa1.setText("1");
        jb_mesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mesa1ActionPerformed(evt);
            }
        });

        jb_mesa2.setText("2");
        jb_mesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mesa2ActionPerformed(evt);
            }
        });

        jb_mesa4.setText("4");
        jb_mesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mesa4ActionPerformed(evt);
            }
        });

        jb_mesa3.setText("3");
        jb_mesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mesa3ActionPerformed(evt);
            }
        });

        jb_mesa7.setText("7");
        jb_mesa7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mesa7ActionPerformed(evt);
            }
        });

        jb_mesa8.setText("8");
        jb_mesa8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mesa8ActionPerformed(evt);
            }
        });

        jb_mesa5.setText("5");
        jb_mesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mesa5ActionPerformed(evt);
            }
        });

        jb_mesa6.setText("6");
        jb_mesa6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mesa6ActionPerformed(evt);
            }
        });

        jb_mesa9.setText("9");
        jb_mesa9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mesa9ActionPerformed(evt);
            }
        });

        jb_mesa10.setText("10");
        jb_mesa10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mesa10ActionPerformed(evt);
            }
        });

        jb_mesa11.setText("11");
        jb_mesa11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mesa11ActionPerformed(evt);
            }
        });

        jb_mesa12.setText("12");
        jb_mesa12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_mesa12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_cuerpoLayout = new javax.swing.GroupLayout(JP_cuerpo);
        JP_cuerpo.setLayout(JP_cuerpoLayout);
        JP_cuerpoLayout.setHorizontalGroup(
            JP_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JP_cuerpoLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(JP_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JP_cuerpoLayout.createSequentialGroup()
                        .addComponent(jb_mesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_mesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_mesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_mesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP_cuerpoLayout.createSequentialGroup()
                        .addComponent(jb_mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JP_cuerpoLayout.createSequentialGroup()
                        .addComponent(jb_mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123))
        );
        JP_cuerpoLayout.setVerticalGroup(
            JP_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JP_cuerpoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(JP_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_mesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_mesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JP_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_mesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_mesa6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_mesa7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_mesa8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JP_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_mesa9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_mesa10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_mesa11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_mesa12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(231, 231, 231))
        );

        jPanel1.setBackground(java.awt.Color.cyan);
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 3, 24)); // NOI18N
        jLabel1.setText("Mesas");

        jb_salir.setText("Salir");
        jb_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_salir)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_salir)
                    .addComponent(jLabel1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JP_cuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JP_cuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_mesa12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mesa12ActionPerformed
        jf_orden.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_mesa12ActionPerformed

    private void jb_mesa11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mesa11ActionPerformed
        jf_orden.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_mesa11ActionPerformed

    private void jb_mesa10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mesa10ActionPerformed
        jf_orden.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_mesa10ActionPerformed

    private void jb_mesa9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mesa9ActionPerformed
        jf_orden.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_mesa9ActionPerformed

    private void jb_mesa6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mesa6ActionPerformed
        jf_orden.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_mesa6ActionPerformed

    private void jb_mesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mesa5ActionPerformed
        jf_orden.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_mesa5ActionPerformed

    private void jb_mesa8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mesa8ActionPerformed
        jf_orden.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_mesa8ActionPerformed

    private void jb_mesa7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mesa7ActionPerformed
        jf_orden.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_mesa7ActionPerformed

    private void jb_mesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mesa3ActionPerformed
        jf_orden.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_mesa3ActionPerformed

    private void jb_mesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mesa4ActionPerformed
        jf_orden.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_mesa4ActionPerformed

    private void jb_mesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mesa2ActionPerformed
        jf_orden.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_mesa2ActionPerformed

    private void jb_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salirActionPerformed
        jf_login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_salirActionPerformed

    private void jb_mesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_mesa1ActionPerformed
        jf_orden.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_mesa1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(JF_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JP_cuerpo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_mesa1;
    private javax.swing.JButton jb_mesa10;
    private javax.swing.JButton jb_mesa11;
    private javax.swing.JButton jb_mesa12;
    private javax.swing.JButton jb_mesa2;
    private javax.swing.JButton jb_mesa3;
    private javax.swing.JButton jb_mesa4;
    private javax.swing.JButton jb_mesa5;
    private javax.swing.JButton jb_mesa6;
    private javax.swing.JButton jb_mesa7;
    private javax.swing.JButton jb_mesa8;
    private javax.swing.JButton jb_mesa9;
    private javax.swing.JButton jb_salir;
    // End of variables declaration//GEN-END:variables
}
