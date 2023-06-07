
public class RegInventarioPiezas extends javax.swing.JFrame {

    private String marca;
    private String nombreDePieza;
    private String estado;
    private String tDv = "Automovil";

    public RegInventarioPiezas() {
        initComponents();
        Guardar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Guardar = new javax.swing.JButton();
        SelectorTipo = new javax.swing.JComboBox<>();
        Marca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombrePieza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JButton();
        serialNo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        SelectorTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automovil", "Motocicleta" }));
        SelectorTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorTipoActionPerformed(evt);
            }
        });

        Marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MarcaKeyReleased(evt);
            }
        });

        jLabel6.setText("Pieza para:");

        jLabel1.setText("Marca");

        jLabel2.setText("Nombre de Pieza");

        nombrePieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePiezaActionPerformed(evt);
            }
        });
        nombrePieza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombrePiezaKeyReleased(evt);
            }
        });

        jLabel4.setText("Número de serie");

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        serialNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNoActionPerformed(evt);
            }
        });
        serialNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serialNoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(serialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nombrePieza, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(SelectorTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(Cerrar)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(nombrePieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(SelectorTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Cerrar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        String nombreArchivo = tDv + marca + nombreDePieza + estado +  ".ccv";
        String rutaArchivo = "C:\\archivos\\piezas\\" + nombreArchivo;

        Pieza pieza = new Pieza(marca, nombreDePieza, estado, tDv);
        Archivos.guardarArchivo(pieza, rutaArchivo);

        this.dispose();

    }//GEN-LAST:event_GuardarActionPerformed

    private void SelectorTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorTipoActionPerformed
        tDv = (String) SelectorTipo.getSelectedItem();
        Guardar.setEnabled(true);
    }//GEN-LAST:event_SelectorTipoActionPerformed

    private void MarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MarcaKeyReleased
        marca = Marca.getText();
    }//GEN-LAST:event_MarcaKeyReleased

    private void nombrePiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePiezaActionPerformed
        nombreDePieza = nombrePieza.getText();
    }//GEN-LAST:event_nombrePiezaActionPerformed

    private void nombrePiezaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrePiezaKeyReleased
        nombreDePieza = nombrePieza.getText();
    }//GEN-LAST:event_nombrePiezaKeyReleased

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void serialNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialNoActionPerformed

    private void serialNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serialNoKeyReleased
        this.estado = serialNo.getText();
    }//GEN-LAST:event_serialNoKeyReleased

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
            java.util.logging.Logger.getLogger(RegInventarioPiezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegInventarioPiezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegInventarioPiezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegInventarioPiezas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegInventarioPiezas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Marca;
    private javax.swing.JComboBox<String> SelectorTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombrePieza;
    private javax.swing.JTextField serialNo;
    // End of variables declaration//GEN-END:variables
}
