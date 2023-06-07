
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public class NuevaVenta extends javax.swing.JFrame {

    private String rutaArchivo1;
    private String rutaArchivo2;
    private Clientes cliente;
    private Vehiculo vehiculo;
    private Pieza pieza;
    private String Precio;
    private String textoVehiculo;
    private String textoCliente;
    private String textoPrecio;

    public NuevaVenta(Clientes cliente, Vehiculo vehiculo) {
        initComponents();
        this.cliente = cliente;
        this.vehiculo = vehiculo;

        if (vehiculo.gettDv().equals("Motocileta")) {
            UsoMultiple.setText("Motocicleta");
        } else if (vehiculo.gettDv().equals("Automovil")) {
            UsoMultiple.setText("Automovil");
        }

        VehiculoTxt.setText(vehiculo.getMarca() + " " + vehiculo.getModelo() + " " + vehiculo.getAno());
        ClienteTxt.setText(cliente.getRFC());

        VehiculoTxt.setEnabled(false);
        ClienteTxt.setEnabled(false);

    }

    public NuevaVenta(Clientes cliente, Pieza pieza) {
        initComponents();
        this.cliente = cliente;
        this.pieza = pieza;

        UsoMultiple.setText("Pieza:");
        VehiculoTxt.setText(pieza.getMarca() + " " + pieza.getNombrePieza());
        ClienteTxt.setText(cliente.getRFC());

        VehiculoTxt.setEnabled(false);
        ClienteTxt.setEnabled(false);

    }

    public NuevaVenta() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsoMultiple = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VehiculoTxt = new javax.swing.JTextField();
        ClienteTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PrecioReg = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        UsoMultiple.setText("Vehiculo");

        jLabel2.setText("Cliente");

        jLabel3.setText("Precio");

        PrecioReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PrecioRegKeyReleased(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Cerrar.setText("Cancelar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(UsoMultiple)
                    .addComponent(ClienteTxt)
                    .addComponent(VehiculoTxt)
                    .addComponent(PrecioReg)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(UsoMultiple)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VehiculoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrecioReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Cerrar))
                .addGap(81, 81, 81))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // Obtener los valores de los JTextField
        textoVehiculo = VehiculoTxt.getText();
        textoCliente = ClienteTxt.getText();
        textoPrecio = PrecioReg.getText();

        // Generar sello de aprobación (hash aleatorio)
        String selloAprobacion = generarSelloAprobacion();

        // Crear el contenido del archivo .CCV
        String contenidoArchivo = textoVehiculo + "," + textoCliente + "," + textoPrecio + "," + selloAprobacion;

        // Guardar en el archivo .CCV
        guardarArchivoCCV(contenidoArchivo);
    }//GEN-LAST:event_GuardarActionPerformed

    private String generarSelloAprobacion() {
        try {
            // Generar un hash aleatorio utilizando SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update((textoVehiculo + textoCliente + textoPrecio).getBytes());
            byte[] digest = md.digest();

            // Convertir el hash en una cadena hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private void guardarArchivoCCV(String contenido) {
        // Ruta donde se guardará el archivo
        String rutaArchivo = "C:\\archivos\\ventas\\archivo.ccv";

        try (FileWriter fw = new FileWriter(rutaArchivo)) {
            fw.write(contenido);
            JOptionPane.showMessageDialog(this, "Datos guardados exitosamente en " + rutaArchivo);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al guardar los datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void PrecioRegKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrecioRegKeyReleased
        Precio = PrecioReg.getText();
    }//GEN-LAST:event_PrecioRegKeyReleased

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
            java.util.logging.Logger.getLogger(NuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JTextField ClienteTxt;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField PrecioReg;
    private javax.swing.JLabel UsoMultiple;
    private javax.swing.JTextField VehiculoTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
