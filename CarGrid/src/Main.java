
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        jMenu3.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        RegistrarNuevoVehiculo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        VerAutoGuardado = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        NuevaPieza = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        RegPiezas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        VentaAuto = new javax.swing.JMenuItem();
        VentaMoto = new javax.swing.JMenuItem();
        VentaPieza = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        VentasGuardadas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        NuevoCliente = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        RegistoClientes = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Car Grid");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo copia.png"))); // NOI18N

        jMenu1.setText("Archivo");

        Salir.setText("Exit");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu1.add(Salir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Inventario");

        jMenu5.setText("Vehiculos");

        RegistrarNuevoVehiculo.setText("Registrar Nuevo Vehiculo");
        RegistrarNuevoVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarNuevoVehiculoActionPerformed(evt);
            }
        });
        jMenu5.add(RegistrarNuevoVehiculo);
        jMenu5.add(jSeparator1);

        VerAutoGuardado.setText("Vehiculos Registrados");
        VerAutoGuardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerAutoGuardadoActionPerformed(evt);
            }
        });
        jMenu5.add(VerAutoGuardado);

        jMenu2.add(jMenu5);

        jMenu7.setText("Piezas");

        NuevaPieza.setText("Nueva Pieza");
        NuevaPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevaPiezaActionPerformed(evt);
            }
        });
        jMenu7.add(NuevaPieza);
        jMenu7.add(jSeparator2);

        RegPiezas.setText("Piezas Registradas");
        RegPiezas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegPiezasActionPerformed(evt);
            }
        });
        jMenu7.add(RegPiezas);

        jMenu2.add(jMenu7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Venta");

        VentaAuto.setText("Autos");
        VentaAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaAutoActionPerformed(evt);
            }
        });
        jMenu3.add(VentaAuto);

        VentaMoto.setText("Motocicletas");
        VentaMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaMotoActionPerformed(evt);
            }
        });
        jMenu3.add(VentaMoto);

        VentaPieza.setText("Piezas");
        VentaPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaPiezaActionPerformed(evt);
            }
        });
        jMenu3.add(VentaPieza);
        jMenu3.add(jSeparator3);

        VentasGuardadas.setText("Ventas Registradas");
        VentasGuardadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasGuardadasActionPerformed(evt);
            }
        });
        jMenu3.add(VentasGuardadas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Clientes");

        NuevoCliente.setText("Nuevo Cliente");
        NuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoClienteActionPerformed(evt);
            }
        });
        jMenu4.add(NuevoCliente);
        jMenu4.add(jSeparator4);

        RegistoClientes.setText("Registro de Clientes");
        RegistoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistoClientesActionPerformed(evt);
            }
        });
        jMenu4.add(RegistoClientes);

        jMenuBar1.add(jMenu4);

        Ayuda.setText("Ayuda");
        Ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AyudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(Ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudaMouseClicked
        System.out.println("Propiedad del equipo Zuger");
    }//GEN-LAST:event_AyudaMouseClicked

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void RegistrarNuevoVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarNuevoVehiculoActionPerformed
        RegInventarioAutos ria = new RegInventarioAutos();
        ria.setVisible(true);
    }//GEN-LAST:event_RegistrarNuevoVehiculoActionPerformed

    private void VerAutoGuardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerAutoGuardadoActionPerformed
        JFileChooser fileChooser = new JFileChooser("C:\\Archivos\\Vehiculos\\");

        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();
            Vehiculo vehiculo = Archivos.leerVehiculoCCV(rutaArchivo);
            vehiculoRegistrado vr = new vehiculoRegistrado(vehiculo);
            vr.setVisible(true);

        }
    }//GEN-LAST:event_VerAutoGuardadoActionPerformed

    private void NuevaPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevaPiezaActionPerformed
        RegInventarioPiezas RIP = new RegInventarioPiezas();
        RIP.setVisible(true);
    }//GEN-LAST:event_NuevaPiezaActionPerformed

    private void RegPiezasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegPiezasActionPerformed
        JFileChooser fileChooser = new JFileChooser("C:\\Archivos\\piezas\\");

        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();
            Pieza pieza = Archivos.leerArchivoPieza(rutaArchivo);
            piezaRegistrada pR = new piezaRegistrada(pieza);
            pR.setVisible(true);

        }
    }//GEN-LAST:event_RegPiezasActionPerformed

    private void NuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoClienteActionPerformed
        registrarCliente rC = new registrarCliente();
        rC.setVisible(true);
    }//GEN-LAST:event_NuevoClienteActionPerformed

    private void RegistoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistoClientesActionPerformed
        JFileChooser fileChooser = new JFileChooser("C:\\Archivos\\clientes\\");

        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();
            Clientes cliente = Archivos.leerCliente(rutaArchivo);
            clienteRegistrado cR = new clienteRegistrado(cliente);
            cR.setVisible(true);

        }
    }//GEN-LAST:event_RegistoClientesActionPerformed

    private void VentaMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaMotoActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        // Establecer la carpeta inicial del file chooser
        String rutaClientes = "C:\\Archivos\\clientes\\";
        String rutaVehiculos = "C:\\Archivos\\vehiculos\\";
        File carpetaClientes = new File(rutaClientes);
        File carpetaVehiculos = new File(rutaVehiculos);
        fileChooser.setCurrentDirectory(carpetaClientes);

        // Seleccionar archivo del cliente
        int resultadoCliente = fileChooser.showOpenDialog(this);
        if (resultadoCliente == JFileChooser.APPROVE_OPTION) {
            File archivoCliente = fileChooser.getSelectedFile();
            rutaClientes = archivoCliente.getAbsolutePath();
        } else {
            System.out.println("No se seleccionó ningún archivo del cliente.");
            return;
        }

        // Cambiar a la carpeta de vehículos
        fileChooser.setCurrentDirectory(carpetaVehiculos);

        // Seleccionar archivo del vehículo
        int resultadoVehiculo = fileChooser.showOpenDialog(this);
        if (resultadoVehiculo == JFileChooser.APPROVE_OPTION) {
            File archivoVehiculo = fileChooser.getSelectedFile();
            rutaVehiculos = archivoVehiculo.getAbsolutePath();
        } else {
            System.out.println("No se seleccionó ningún archivo del vehículo.");
            return;
        }

        Clientes cliente = Archivos.leerCliente(rutaClientes);
        Vehiculo vehiculoVenta =  Archivos.leerVehiculoCCV(rutaVehiculos);

        if (cliente != null && vehiculoVenta != null) {
            NuevaVenta nV = new NuevaVenta(cliente, vehiculoVenta);
            nV.setVisible(true);
        } else {
            System.out.println("Error al leer los archivos .ccv.");
        }
    }//GEN-LAST:event_VentaMotoActionPerformed

    private void VentaPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaPiezaActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        // Establecer la carpeta inicial del file chooser
        String rutaClientes = "C:\\Archivos\\clientes\\";
        String rutaPiezas = "C:\\Archivos\\piezas\\";
        File carpetaClientes = new File(rutaClientes);
        File carpetaVehiculos = new File(rutaPiezas);
        fileChooser.setCurrentDirectory(carpetaClientes);

        // Seleccionar archivo del cliente
        int resultadoCliente = fileChooser.showOpenDialog(this);
        if (resultadoCliente == JFileChooser.APPROVE_OPTION) {
            File archivoCliente = fileChooser.getSelectedFile();
            rutaClientes = archivoCliente.getAbsolutePath();
        } else {
            System.out.println("No se seleccionó ningún archivo del cliente.");
            return;
        }

        // Cambiar a la carpeta de vehículos
        fileChooser.setCurrentDirectory(carpetaVehiculos);

        // Seleccionar archivo del vehículo
        int resultadoVehiculo = fileChooser.showOpenDialog(this);
        if (resultadoVehiculo == JFileChooser.APPROVE_OPTION) {
            File archivoVehiculo = fileChooser.getSelectedFile();
            rutaPiezas = archivoVehiculo.getAbsolutePath();
        } else {
            System.out.println("No se seleccionó ningún archivo del vehículo.");
            return;
        }

        Clientes cliente = Archivos.leerCliente(rutaClientes);
        Pieza pieza  = Archivos.leerArchivoPieza(rutaPiezas);

        if (cliente != null && pieza != null) {
            NuevaVenta nV = new NuevaVenta(cliente, pieza);
            nV.setVisible(true);
        } else {
            System.out.println("Error al leer los archivos .ccv.");
        }
    }//GEN-LAST:event_VentaPiezaActionPerformed

    private void VentaAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaAutoActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        // Establecer la carpeta inicial del file chooser
        String rutaClientes = "C:\\Archivos\\clientes\\";
        String rutaVehiculos = "C:\\Archivos\\vehiculos\\";
        File carpetaClientes = new File(rutaClientes);
        File carpetaVehiculos = new File(rutaVehiculos);
        fileChooser.setCurrentDirectory(carpetaClientes);

        // Seleccionar archivo del cliente
        int resultadoCliente = fileChooser.showOpenDialog(this);
        if (resultadoCliente == JFileChooser.APPROVE_OPTION) {
            File archivoCliente = fileChooser.getSelectedFile();
            rutaClientes = archivoCliente.getAbsolutePath();
        } else {
            System.out.println("No se seleccionó ningún archivo del cliente.");
            return;
        }

        // Cambiar a la carpeta de vehículos
        fileChooser.setCurrentDirectory(carpetaVehiculos);

        // Seleccionar archivo del vehículo
        int resultadoVehiculo = fileChooser.showOpenDialog(this);
        if (resultadoVehiculo == JFileChooser.APPROVE_OPTION) {
            File archivoVehiculo = fileChooser.getSelectedFile();
            rutaVehiculos = archivoVehiculo.getAbsolutePath();
        } else {
            System.out.println("No se seleccionó ningún archivo del vehículo.");
            return;
        }

        Clientes cliente = Archivos.leerCliente(rutaClientes);
        Vehiculo vehiculoVenta = Archivos.leerVehiculoCCV(rutaVehiculos);

        if (cliente != null && vehiculoVenta != null) {
            NuevaVenta nV = new NuevaVenta(cliente, vehiculoVenta);
            nV.setVisible(true);
        } else {
            System.out.println("Error al leer los archivos .ccv.");
        }
    }//GEN-LAST:event_VentaAutoActionPerformed

    private void VentasGuardadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasGuardadasActionPerformed
        
    }//GEN-LAST:event_VentasGuardadasActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuItem NuevaPieza;
    private javax.swing.JMenuItem NuevoCliente;
    private javax.swing.JMenuItem RegPiezas;
    private javax.swing.JMenuItem RegistoClientes;
    private javax.swing.JMenuItem RegistrarNuevoVehiculo;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenuItem VentaAuto;
    private javax.swing.JMenuItem VentaMoto;
    private javax.swing.JMenuItem VentaPieza;
    private javax.swing.JMenuItem VentasGuardadas;
    private javax.swing.JMenuItem VerAutoGuardado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
