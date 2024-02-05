
package com.mycompany.peluqueria_caninafin.igu;
import com.mycompany.peluqueria_caninafin.logica.Cliente;
import com.mycompany.peluqueria_caninafin.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class modificarDatos extends javax.swing.JFrame {

  Controladora control = null;
  int num_duenio;
  Cliente masco;
    public modificarDatos(int num_duenio) {
        control = new Controladora();
        this.num_duenio = num_duenio;
        //control = new Controladora();
        initComponents();
        
        cargarDatos(num_duenio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtNum_tel = new javax.swing.JTextField();
        TxtRazaClien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxtNomClien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TxtColorClien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TxtNombHumano = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbAlergico = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbAtencionEspecial = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        Limpiarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtObservaciones = new javax.swing.JTextArea();
        btGuardarcambios1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificacion de Datos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Numero telefonico:");

        TxtNum_tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNum_telActionPerformed(evt);
            }
        });

        TxtRazaClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRazaClienActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre dueño:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Raza:");

        TxtNomClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomClienActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nombre Mascota:");

        TxtColorClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtColorClienActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Color:");

        TxtNombHumano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNombHumanoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Alergico:");

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Si", "No" }));
        cmbAlergico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlergicoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Atencion Especial");

        cmbAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Si", "No" }));
        cmbAtencionEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAtencionEspecialActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Observaciones");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        Limpiarbtn.setText("Limpiar");
        Limpiarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarbtnActionPerformed(evt);
            }
        });

        TxtObservaciones.setColumns(20);
        TxtObservaciones.setRows(5);
        jScrollPane1.setViewportView(TxtObservaciones);

        btGuardarcambios1.setText("Guardar Cambios");
        btGuardarcambios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarcambios1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(TxtNomClien, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                    .addComponent(TxtNum_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TxtRazaClien, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                        .addComponent(TxtColorClien, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                        .addComponent(cmbAtencionEspecial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbAlergico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Limpiarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TxtNombHumano, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3))))
                .addGap(95, 266, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304)
                .addComponent(btGuardarcambios1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNum_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtNomClien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtRazaClien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtColorClien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TxtNombHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(btGuardarcambios1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Limpiarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtNum_telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNum_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNum_telActionPerformed

    private void TxtRazaClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRazaClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRazaClienActionPerformed

    private void TxtNomClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomClienActionPerformed

    private void TxtColorClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtColorClienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtColorClienActionPerformed

    private void TxtNombHumanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNombHumanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNombHumanoActionPerformed

    private void cmbAlergicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlergicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAlergicoActionPerformed

    private void cmbAtencionEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAtencionEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAtencionEspecialActionPerformed

    private void LimpiarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarbtnActionPerformed
        //usando set.Text(""); deja los campos vacios
        TxtNum_tel.setText("");
        TxtColorClien.setText("");
        TxtNomClien.setText("");
        TxtNombHumano.setText("");
        TxtObservaciones.setText("");
        TxtRazaClien.setText("");
        //usando set.SelectedIndex(0); deja el campo en el indice 0
        cmbAlergico.setSelectedIndex(0);
        cmbAtencionEspecial.setSelectedIndex(0);
    }//GEN-LAST:event_LimpiarbtnActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       
       
       VerDatos pantallas= new VerDatos();
       pantallas.setVisible(true);
       pantallas.setLocationRelativeTo(null);
       
       this.dispose();
     
               
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btGuardarcambios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarcambios1ActionPerformed
       //Todos los datos de la mascota
        String nombreMasco = TxtNomClien.getText();
        String raza = TxtRazaClien.getText();
        String observaciones = TxtObservaciones.getText();
        String color = TxtColorClien.getText();
        String alergico = (String) cmbAlergico.getSelectedItem();
        String atenEsp = (String) cmbAtencionEspecial.getSelectedItem();
        
        //Todos los datos del dueño
        String num_tel = TxtNum_tel.getText();
        String nombDuenio = TxtNombHumano.getText();
        
        
        control.modificarMascota(masco, nombreMasco,raza,color,observaciones,alergico,atenEsp,num_tel,nombDuenio);
        
       //mensaje que salio bien
       mostrarMensaje("Edicion realizada correctamente","Info","Edicion correcta");
       
       VerDatos pantallas= new VerDatos();
       pantallas.setVisible(true);
       pantallas.setLocationRelativeTo(null);
       
       this.dispose();
    }//GEN-LAST:event_btGuardarcambios1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiarbtn;
    private javax.swing.JTextField TxtColorClien;
    private javax.swing.JTextField TxtNomClien;
    private javax.swing.JTextField TxtNombHumano;
    private javax.swing.JTextField TxtNum_tel;
    private javax.swing.JTextArea TxtObservaciones;
    private javax.swing.JTextField TxtRazaClien;
    private javax.swing.JButton btGuardarcambios1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencionEspecial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int num_duenio) {
        
        this.masco = control.traerMascota(num_duenio);
        
        
        TxtNomClien.setText(masco.getNombre_Perro());
        TxtColorClien.setText(masco.getColor());
        TxtObservaciones.setText(masco.getObservaciones());
        TxtRazaClien.setText(masco.getRaza());
        
        TxtNum_tel.setText(masco.getUnDuenio().getNum_tel());
        TxtNombHumano.setText(masco.getUnDuenio().getNombre());
        
        if(masco.getAlergico().equals("Si")){
            cmbAlergico.setSelectedIndex(1);
        }
        else{
            if(masco.getAlergico().equals("No")){
            cmbAlergico.setSelectedIndex(2);
            }
        }
        
        
        if(masco.getAtencion_Especial().equals("Si")){
            cmbAtencionEspecial.setSelectedIndex(1);
        }
        else{
            if(masco.getAtencion_Especial().equals("No")){
            cmbAtencionEspecial.setSelectedIndex(2);
            }
        }     
    }
    public void mostrarMensaje(String mensaje,String tipo,String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
