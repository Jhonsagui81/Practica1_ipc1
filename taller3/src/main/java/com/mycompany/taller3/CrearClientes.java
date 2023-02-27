
package com.mycompany.taller3;

import javax.swing.JOptionPane;

public class CrearClientes extends javax.swing.JInternalFrame {
   
    //metodo constructor 
    Clientes[] personas = new Clientes[5];
    
    public CrearClientes(Clientes[] personas) {
        initComponents();
       
        this.personas = personas;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCui = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        btmCrearClientes = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crear Clientes");

        jLabel2.setText("CUI:");

        jLabel3.setText("NOMBRE:");

        jLabel4.setText("APELLIDO");

        btmCrearClientes.setBackground(new java.awt.Color(0, 255, 51));
        btmCrearClientes.setText("Crear Cliente");
        btmCrearClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmCrearClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(txtCui)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btmCrearClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCui, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btmCrearClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmCrearClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmCrearClientesActionPerformed
        try{
            String dpi = txtCui.getText();
            String name = txtNombre.getText();
            String apellido = txtApellido.getText();
            
            int sdpi = Integer.parseInt(dpi);
            boolean DpiDuplicado = false;
            
            if(Taller3.ContadorClientes == 0){
                personas[0].setApellido(apellido);
                personas[0].setNombre(name);
                personas[0].setDPI(sdpi);
                JOptionPane.showMessageDialog(null,"Cliente Registrado :)");
                Taller3.ContadorClientes++;
                txtCui.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
            }else{
                for (int i = 0; i < 5; i++) {
                    if (personas[i].getDPI() == sdpi) {
                        JOptionPane.showMessageDialog(null, "No es posible, dpi rreppretido");
                        txtCui.setText("");
                        txtNombre.setText("");
                        txtApellido.setText("");
                        DpiDuplicado = true;
                        break;
                    }
                }
                
                if(DpiDuplicado == false){
                    try{
                        personas[Taller3.ContadorClientes].setApellido(apellido);
                        personas[Taller3.ContadorClientes].setNombre(name);
                        personas[Taller3.ContadorClientes].setDPI(sdpi);
                        txtCui.setText("");
                        txtNombre.setText("");
                        txtApellido.setText("");
                        Taller3.ContadorClientes++;
                        
                    }catch(Exception ex){
                        txtCui.setText("");
                        txtNombre.setText("");
                        txtApellido.setText("");
                        JOptionPane.showMessageDialog(null,"Ya no es posible almacenar mas personas");
                    }
                }
            }
            
            
            
        }catch (Exception es){
            txtCui.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
            JOptionPane.showMessageDialog(null, "Debe ingresar los datos correctamente ");
        }
       
    }//GEN-LAST:event_btmCrearClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmCrearClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCui;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
