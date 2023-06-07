
public class RegInventarioAutos extends javax.swing.JFrame {

    private String marca;
    private String modelo;
    private String ano;
    private String estado = "Nuevo";
    private String color;
    private String tDv = "Automovil";
    private String tCC;
    private String tDc = "Gasolina";

    public RegInventarioAutos() {
        initComponents();
        MultiUsos.setVisible(false);
        SelectorCombus.setVisible(false);
        TamanoCilindraje.setVisible(false);
        Guardar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cerrar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Marca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Modelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Anno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TamanoCilindraje = new javax.swing.JTextField();
        Color = new javax.swing.JTextField();
        SelectorTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        SelectorEstado = new javax.swing.JComboBox<>();
        MultiUsos = new javax.swing.JLabel();
        SelectorCombus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Nuevo Vehiculo");
        setMaximumSize(new java.awt.Dimension(426, 443));
        setMinimumSize(new java.awt.Dimension(426, 443));
        setResizable(false);
        setSize(new java.awt.Dimension(426, 443));

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MarcaKeyReleased(evt);
            }
        });

        jLabel1.setText("Marca");

        jLabel2.setText("Modelo");

        Modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModeloActionPerformed(evt);
            }
        });
        Modelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ModeloKeyReleased(evt);
            }
        });

        jLabel3.setText("Anio");

        Anno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AnnoKeyReleased(evt);
            }
        });

        jLabel4.setText("Estado");

        jLabel5.setText("Numero de Serie");

        TamanoCilindraje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TamanoCilindrajeKeyReleased(evt);
            }
        });

        Color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ColorKeyReleased(evt);
            }
        });

        SelectorTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automovil", "Motocicleta" }));
        SelectorTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorTipoActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de Vehiculo");

        SelectorEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nuevo", "Usado" }));
        SelectorEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorEstadoActionPerformed(evt);
            }
        });

        MultiUsos.setText("jLabel7");

        SelectorCombus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasolina", "Diesel", "Electrico" }));
        SelectorCombus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectorCombusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Anno, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(SelectorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(SelectorTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MultiUsos)
                    .addComponent(SelectorCombus, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TamanoCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(Cerrar)))
                .addContainerGap(59, Short.MAX_VALUE))
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
                .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(Anno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(SelectorEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addComponent(SelectorTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(MultiUsos)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectorCombus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(TamanoCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Cerrar))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void ModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModeloActionPerformed
        modelo = Modelo.getText();
    }//GEN-LAST:event_ModeloActionPerformed

    private void SelectorTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorTipoActionPerformed
        tDv = (String) SelectorTipo.getSelectedItem();
        if (tDv == "Automovil") {
            MultiUsos.setVisible(true);
            MultiUsos.setText("Tipo de combustible");
            SelectorCombus.setVisible(true);
            TamanoCilindraje.setVisible(false);
        } else {
            MultiUsos.setVisible(true);
            MultiUsos.setText("Cilindraje");
            TamanoCilindraje.setVisible(true);
            SelectorCombus.setVisible(false);
        }

    }//GEN-LAST:event_SelectorTipoActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        if (tDv == "Automovil") {
            String nombreArchivo = marca + modelo + ano + color + ".ccv";
            String rutaArchivo = "C:\\archivos\\vehiculos\\" + nombreArchivo;

            Automovil auto = new Automovil(marca, modelo, ano, estado, color, tDv, tDc);
            Archivos.guardarArchivo(auto, rutaArchivo);

            this.dispose();
        }
        if (tDv == "Motocicleta") {
            String nombreArchivo = marca + modelo + ano + color + ".ccv";
            String rutaArchivo = "C:\\archivos\\vehiculos\\" + nombreArchivo;

            Motocicleta auto = new Motocicleta(marca, modelo, ano, estado, color, tDv, tCC);
            Archivos.guardarArchivo(auto, rutaArchivo);

            this.dispose();
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void MarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MarcaKeyReleased
        marca = Marca.getText();
    }//GEN-LAST:event_MarcaKeyReleased

    private void ModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ModeloKeyReleased
        modelo = Modelo.getText();
    }//GEN-LAST:event_ModeloKeyReleased

    private void AnnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AnnoKeyReleased
        ano = Anno.getText();
    }//GEN-LAST:event_AnnoKeyReleased

    private void ColorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ColorKeyReleased
        color = Color.getText();
    }//GEN-LAST:event_ColorKeyReleased

    private void SelectorEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorEstadoActionPerformed
        estado = (String) SelectorEstado.getSelectedItem();
    }//GEN-LAST:event_SelectorEstadoActionPerformed

    private void SelectorCombusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectorCombusActionPerformed
        tDc = (String) SelectorCombus.getSelectedItem();
        Guardar.setEnabled(true);
    }//GEN-LAST:event_SelectorCombusActionPerformed

    private void TamanoCilindrajeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TamanoCilindrajeKeyReleased
        tCC = TamanoCilindraje.getText();
        Guardar.setEnabled(true);
    }//GEN-LAST:event_TamanoCilindrajeKeyReleased

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
            java.util.logging.Logger.getLogger(RegInventarioAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegInventarioAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegInventarioAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegInventarioAutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegInventarioAutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Anno;
    private javax.swing.JButton Cerrar;
    private javax.swing.JTextField Color;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Marca;
    private javax.swing.JTextField Modelo;
    private javax.swing.JLabel MultiUsos;
    private javax.swing.JComboBox<String> SelectorCombus;
    private javax.swing.JComboBox<String> SelectorEstado;
    private javax.swing.JComboBox<String> SelectorTipo;
    private javax.swing.JTextField TamanoCilindraje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
