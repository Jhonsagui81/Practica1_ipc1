package proyecto1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;

/**
 *
 * @author jhonatan
 */
public class VHistorial extends javax.swing.JInternalFrame {

    //tabla
    DefaultTableModel dtm = new DefaultTableModel();
    
    //arreglo clientes
    Clientes[] infoPersona = new Clientes[5];

    public VHistorial(Clientes[] persona) {
        this.infoPersona = persona;
        initComponents();

        // para tabla de informacion cliente
        String[] titulo = new String[]{"ID Transaccion", "Fecha", "Detalle", "Debito", "Credito", "Saldo Disponible"};
        dtm.setColumnIdentifiers(titulo);
        tb1Historial.setModel(dtm);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtIdCuenta = new javax.swing.JTextField();
        btmHistorial = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCui = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1Historial = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("Id Cuenta:");

        btmHistorial.setText("Mostrar Transacciones");
        btmHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmHistorialActionPerformed(evt);
            }
        });

        jLabel2.setText("CUI");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("APELLIDO");

        jLabel5.setText("DATOS DE LA CUENTA ASOCIADA");

        jLabel6.setText("HISTORIAL DE TRANSACCIONES DE LA CUENTA");

        tb1Historial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb1Historial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btmHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtIdCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(txtCui, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel2)
                                .addGap(251, 251, 251)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(141, 141, 141))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(274, 274, 274)
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(372, 372, 372))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btmHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmHistorialActionPerformed

        if (!txtIdCuenta.getText().isEmpty()) {  //Verificar que el campo no este vacio
            try {
                //para mostrar en la interfaz
                String nombre;
                int cui;
                String apellido;
                
                //limpiar tabla
                int filas = dtm.getRowCount();
                for (int i = 0; i < filas; i++) {
                    dtm.removeRow(0);
                }

                String id = txtIdCuenta.getText(); //obtener dato ingresado
                int idCuenta = Integer.parseInt(id); //convertirlo a entero
                
                File archivo  = new File("/home/jhonatan/Descargas/historial.html");
                
                FileWriter escribir; 
                
                PrintWriter nuevaLinea;

                if(!archivo.exists()){
                    try{
                        archivo.createNewFile();
                        
                        escribir = new FileWriter(archivo, true);
                        
                        nuevaLinea = new PrintWriter(escribir);
                        
                        nuevaLinea.print("<!DOCTYPE html>\n"
                        + "<html lang=\"en\">\n"
                                + "<head>\n"
                                + "\t<meta charset=\"UTF-8\">\n"
                                + "\t<title>HistorialReporte</title>\n"
                                + "</head>\n"
                                + "<body>\n"
                                + "\t<table style=\"background-color: gray; border: 2px solid black\">\n"
                                + "\t\t<caption>Historial de Transferencias</caption>\n"
                                + "\t\t<thead>\n"
                                //para titulo de la tabla 
                                + "\t\t\t<tr style=\"border: 2px solid black\">\n"
                                + "\t\t\t\t<th style=\"border: 2px solid black\">Id Tranferencia</th>\n"
                                + "\t\t\t\t<th style=\"border: 2px solid black\">Detalle</th>\n"
                                + "\t\t\t\t<th style=\"border: 2px solid black\">Debito</th>\n"
                                + "\t\t\t\t<th style=\"border: 2px solid black\">Credito</th>\n"
                                + "\t\t\t\t<th style=\"border: 2px solid black\">Saldo Disponible</th>\n"
                                + "\t\t\t</tr style=\"border: 2px solid black\">\n"
                                + "\t\t</thead>\n");


                        
                    
                for (int i = 0; i < infoPersona.length; i++) { // recorre arreglo de clientes
                    if (infoPersona[i].getNombre() != null) { // excepto los que no estan asignados = Null
                        //Este procedimiento es el segundo for del algoritmo    
                        for (int j = 0; j < 5; j++) {  // recorre arreglo de las cuentas del cliente al 
                            if (infoPersona[i].cuentaAsociada[j].getIdCuenta() == idCuenta) { //valida que un cliente tenga el id de la cuenta
                                //guardar los datos necesarios
                                apellido = infoPersona[i].getApellido();
                                cui = infoPersona[i].getDPI();
                                nombre = infoPersona[i].getNombre();
                                //hacer que sean visibles
                                txtApellido.setText(apellido);
                                txtCui.setText(Integer.toString(cui));
                                txtNombre.setText(nombre);
                                for (int k = 0; k < infoPersona[i].cuentaAsociada[j].ContadorTransacciones; k++) {
                                    dtm.addRow(new Object[]{
                                        infoPersona[i].cuentaAsociada[j].operacion[k].getIdHistorial(), //agrega primera columna, primera fila
                                        infoPersona[i].cuentaAsociada[j].operacion[k].getFechaHoraActuales(), //agrega segunda columna, primera fila
                                        infoPersona[i].cuentaAsociada[j].operacion[k].getDescripcion(), //agrega Tercera columna, primera fila
                                        infoPersona[i].cuentaAsociada[j].operacion[k].getMontoDebitado(), //agrega cuarta columna, primera fila
                                        infoPersona[i].cuentaAsociada[j].operacion[k].getMontoAcreditado(), //agrega quinta columna, primera fila
                                        infoPersona[i].cuentaAsociada[j].operacion[k].getSaldoActual() //agrega sexta columna, primera fila
                                    });
                                    nuevaLinea.println("\t\t\t<tr style=\"border: 2px solid black\">\n");
                                    nuevaLinea.println("\t\t\t\t<td style=\"border: 2px solid black\">" + String.valueOf(infoPersona[i].cuentaAsociada[j].operacion[k].getIdHistorial()) + "</td>\n");
                                    nuevaLinea.println("\t\t\t\t<td style=\"border: 2px solid black\">" + String.valueOf(infoPersona[i].cuentaAsociada[j].operacion[k].getDescripcion()) + "</td>\n");
                                    nuevaLinea.println("\t\t\t\t<td style=\"border: 2px solid black\">" + String.valueOf(infoPersona[i].cuentaAsociada[j].operacion[k].getMontoDebitado()) + "</td>\n");
                                    nuevaLinea.println("\t\t\t\t<td style=\"border: 2px solid black\">" + String.valueOf(infoPersona[i].cuentaAsociada[j].operacion[k].getMontoAcreditado()) + "</td>\n");
                                    nuevaLinea.println("\t\t\t\t<td style=\"border: 2px solid black\">" + String.valueOf(infoPersona[i].cuentaAsociada[j].operacion[k].getSaldoActual()) + "</td>\n");
                                    nuevaLinea.println("\t\t\t</tr style=\"border: 2px solid black\">\n");

                                }
                                //Se pasan las variables de los for para realizar el proximo procedimiento 
                            }
                        }
                    }
                }
                nuevaLinea.println("\t</table>\n");
                nuevaLinea.println("</body>\n");
                nuevaLinea.println("</html>\n");
                escribir.close();
                }catch (Exception ex){
                        ex.printStackTrace();
                    }
                }else {
                    BufferedWriter bw = new BufferedWriter(new FileWriter("/home/jhonatan/Descargas/historial.html"));
                    bw.write("");
                    
                    
                    //repetir codigo 
                    
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "¡Ingrese los datos como lo indica el manual de usuario!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡Debe rellenar todos los campos!");
        }


    }//GEN-LAST:event_btmHistorialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tb1Historial;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCui;
    private javax.swing.JTextField txtIdCuenta;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
