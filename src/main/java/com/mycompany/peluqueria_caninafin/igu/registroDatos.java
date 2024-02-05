
package com.mycompany.peluqueria_caninafin.igu;

import com.mycompany.peluqueria_caninafin.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class registroDatos extends javax.swing.JFrame {

  Controladora control = new Controladora();
    public registroDatos() {
        //control = new Controladora();
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
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
        Guardarbtn = new javax.swing.JButton();
        Limpiarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtObservaciones = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Numero telefonico:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Perros");

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
        jLabel5.setText("Nombre:");

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

        Guardarbtn.setText("Guardar registros");
        Guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarbtnActionPerformed(evt);
            }
        });

        Limpiarbtn.setText("Limpiar registros");
        Limpiarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarbtnActionPerformed(evt);
            }
        });

        TxtObservaciones.setColumns(20);
        TxtObservaciones.setRows(5);
        jScrollPane1.setViewportView(TxtObservaciones);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\manri\\Downloads\\kisspng-dog-grooming-cat-clip-art-a-puppy-sprawled-on-a-bathtub-5a83d6678d4882.0689651715185895435787.jpg")); // NOI18N
        jLabel11.setText("Numero telefonico:");

        btnRegresar.setText("Regresar al menu");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(74, 74, 74)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtNum_tel)
                                    .addComponent(TxtRazaClien)
                                    .addComponent(TxtNomClien)
                                    .addComponent(TxtColorClien)
                                    .addComponent(cmbAtencionEspecial, 0, 230, Short.MAX_VALUE)
                                    .addComponent(cmbAlergico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtNombHumano))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Limpiarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Guardarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtNum_tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(TxtNomClien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtRazaClien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtColorClien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbAtencionEspecial)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtNombHumano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Limpiarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guardarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void GuardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarbtnActionPerformed
       //mascota(Cliente)
        String nombreMasco = TxtNomClien.getText();
        String raza = TxtRazaClien.getText();
        String observaciones = TxtObservaciones.getText();
        String color = TxtColorClien.getText();
        String alergico = (String) cmbAlergico.getSelectedItem();
        String atenEsp = (String) cmbAtencionEspecial.getSelectedItem();
        
        //Dueno(Humano)
        String num_tel = TxtNum_tel.getText();
        String nombDuenio = TxtNombHumano.getText();
        
        control.guardar(nombreMasco,raza,observaciones,color,alergico,atenEsp,
                num_tel,nombDuenio);
        
        JOptionPane optionPane = new JOptionPane("Se guardo correctamente");
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Guardado exitoso");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }//GEN-LAST:event_GuardarbtnActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        Principal volver = new Principal();
        volver.setVisible(true);
        volver.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Guardarbtn;
    private javax.swing.JButton Limpiarbtn;
    private javax.swing.JTextField TxtColorClien;
    private javax.swing.JTextField TxtNomClien;
    private javax.swing.JTextField TxtNombHumano;
    private javax.swing.JTextField TxtNum_tel;
    private javax.swing.JTextArea TxtObservaciones;
    private javax.swing.JTextField TxtRazaClien;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencionEspecial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
}
