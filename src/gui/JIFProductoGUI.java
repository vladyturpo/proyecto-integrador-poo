/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import entities.Client;
import entities.Producto;
import implement.ImplProducto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import resources.Resources;

/**
 *
 * @author LAB REDES
 */
public class JIFProductoGUI extends javax.swing.JInternalFrame {
    ImplProducto ip = new ImplProducto();  
    DefaultTableModel modelo;
   
    
    public JIFProductoGUI() {
        initComponents();
        ReporteDataDB();
        jTextField_id_Producto.setVisible(false);
        jButton_Actualizar.setVisible(false);
        jButton_eliminar.setVisible(false);
    }
    
    public void ReporteDataDB(){
        System.out.println("Reporte de desde db");
                
            modelo = new DefaultTableModel();
            modelo.addColumn("Producto id");
            modelo.addColumn("Nombre");
            modelo.addColumn("Stock");
            modelo.addColumn("Precio Venta");
            modelo.addColumn("Precio Compra");



                for (Producto pr : ip.reporteProductos()) {
                    Object[] fila = new Object[5];
                    fila[0] = pr.getProd_id();
                    fila[1] = pr.getProd_nombre();
                    fila[2] = pr.getProd_stock();
                    fila[3] = pr.getProd_precioveta();
                    fila[4] = pr.getProd_preciocompra();
                                


                    modelo.addRow(fila);
                }
            jTable1_Producto.setModel(modelo); 
        
           
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFormulario = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_paterno = new javax.swing.JLabel();
        jLabel_materno = new javax.swing.JLabel();
        jLabel_nro = new javax.swing.JLabel();
        jTextField_nombreProducto = new javax.swing.JTextField();
        jTextField_prec_venta = new javax.swing.JTextField();
        jTextField_stock = new javax.swing.JTextField();
        jTextField_precio_compra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_Producto = new javax.swing.JTable();
        jTextField_id_Producto = new javax.swing.JTextField();
        jButton_Actualizar = new javax.swing.JButton();
        jButton_grabar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jButton_Limpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario Producto");

        jPanelFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_titulo.setText("Formulario Producto");
        jLabel_titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelFormulario.add(jLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 28));

        jLabel_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nombre.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nombre.setText("Nombre:");
        jPanelFormulario.add(jLabel_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel_paterno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_paterno.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_paterno.setText("Stock:");
        jPanelFormulario.add(jLabel_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 102, -1, -1));

        jLabel_materno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_materno.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_materno.setText("Precio Venta:");
        jPanelFormulario.add(jLabel_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 154, -1, -1));

        jLabel_nro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel_nro.setForeground(new java.awt.Color(204, 102, 0));
        jLabel_nro.setText("Precio Compra:");
        jPanelFormulario.add(jLabel_nro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));
        jPanelFormulario.add(jTextField_nombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 142, 32));
        jPanelFormulario.add(jTextField_prec_venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 142, 32));
        jPanelFormulario.add(jTextField_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 142, 32));
        jPanelFormulario.add(jTextField_precio_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 142, 32));

        jTable1_Producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto id", "Nombre", "Stock", "Precio Venta", "Precio Compra"
            }
        ));
        jTable1_Producto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_ProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_Producto);

        jButton_Actualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Actualizar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_Actualizar.setText("Actualizar");
        jButton_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ActualizarActionPerformed(evt);
            }
        });

        jButton_grabar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_grabar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_grabar.setText("Grabar");
        jButton_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_grabarActionPerformed(evt);
            }
        });

        jButton_eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_eliminar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_eliminar.setText("Eliminar");
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });

        jButton_Limpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Limpiar.setForeground(new java.awt.Color(204, 102, 0));
        jButton_Limpiar.setText("Limpiar");
        jButton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_grabar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_id_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Limpiar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton_Limpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_grabar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Actualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jTextField_id_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_grabarActionPerformed
     Resources re= new Resources();
        if(jTextField_nombreProducto.getText().equals("")||
           jTextField_stock.getText().equals("")||
           jTextField_prec_venta.getText().equals("")||
           jTextField_precio_compra.getText().equals(""))
        {
            
           JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
        
        }else{
            Producto pr = new Producto();
       pr.setProd_id("PR"+re.generaID());
       pr.setProd_nombre(jTextField_nombreProducto.getText());
       pr.setProd_stock(jTextField_stock.getText());
       pr.setProd_precioveta(Double.parseDouble(jTextField_prec_venta.getText()));
       pr.setProd_preciocompra(Double.parseDouble(jTextField_precio_compra.getText()));
       
       ip.AddProducto(pr);
       ReporteDataDB();
       JOptionPane.showMessageDialog(null, "Se registro de manera satisfactoria");
       limpiarJTextField();
            
        }
       
    }//GEN-LAST:event_jButton_grabarActionPerformed

    private void jButton_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ActualizarActionPerformed
      if(jTextField_id_Producto.getText().equals("")||
         jTextField_nombreProducto.getText().equals("")||
         jTextField_stock.getText().equals("")||
         jTextField_prec_venta.getText().equals("")||
         jTextField_precio_compra.getText().equals(""))
      {
          
      JOptionPane.showMessageDialog(null, "Ingrese los datos completos");
      
      }else{
      Producto pr = new Producto();
       pr.setProd_id(jTextField_id_Producto.getText());
       pr.setProd_nombre(jTextField_nombreProducto.getText());
       pr.setProd_stock(jTextField_stock.getText());
       pr.setProd_precioveta(Double.parseDouble(jTextField_prec_venta.getText()));
       pr.setProd_preciocompra(Double.parseDouble(jTextField_precio_compra.getText()));
       
       ip.ActualizarProducto(pr);
       ReporteDataDB();
       JOptionPane.showMessageDialog(null, "Se Actualizo de manera satisfactoria");
       limpiarJTextField();
      
      }
        
       
    }//GEN-LAST:event_jButton_ActualizarActionPerformed

    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        if(jTextField_id_Producto.equals("")){
        
            JOptionPane.showMessageDialog(null, "Id vacio!, ingrese el id o seleccione la fila a eliminar ");
        
        }else{
            
        Producto pr = new Producto();
        pr.setProd_id(jTextField_id_Producto.getText());
        ip.EliminarProducto(pr);
        Clear_Table1();
        ReporteDataDB();
        JOptionPane.showMessageDialog(null, "Se Elimino de manera satisfactoria");
        limpiarJTextField();
        
        }
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    
     public void Clear_Table1(){         
        modelo.removeTableModelListener(jTable1_Producto);
        jTable1_Producto.removeAll();
    }
     
    private void jTable1_ProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_ProductoMouseClicked
          int row = 0;
        row=jTable1_Producto.getSelectedRow();
        
        jTextField_id_Producto.setText(jTable1_Producto.getValueAt(row, 0).toString());
        jTextField_nombreProducto.setText( jTable1_Producto.getValueAt(row, 1).toString());
        jTextField_stock.setText( jTable1_Producto.getValueAt(row, 2).toString());
        jTextField_prec_venta.setText( jTable1_Producto.getValueAt(row, 3).toString());
        jTextField_precio_compra.setText( jTable1_Producto.getValueAt(row, 4).toString());
        
        jButton_grabar.setVisible(false);
        jButton_Actualizar.setVisible(true);
        jButton_eliminar.setVisible(true);
        
        
    }//GEN-LAST:event_jTable1_ProductoMouseClicked

    private void jButton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimpiarActionPerformed
        limpiarJTextField();
    }//GEN-LAST:event_jButton_LimpiarActionPerformed

    
    
     public void limpiarJTextField(){
            jTextField_id_Producto.setText("");
            jTextField_nombreProducto.setText("");
            jTextField_stock.setText("");
            jTextField_prec_venta.setText("");
            jTextField_precio_compra.setText("");
            jButton_grabar.setVisible(true);
            jButton_Actualizar.setVisible(false);
            jButton_eliminar.setVisible(false);
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Actualizar;
    private javax.swing.JButton jButton_Limpiar;
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_grabar;
    private javax.swing.JLabel jLabel_materno;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_nro;
    private javax.swing.JLabel jLabel_paterno;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_Producto;
    private javax.swing.JTextField jTextField_id_Producto;
    private javax.swing.JTextField jTextField_nombreProducto;
    private javax.swing.JTextField jTextField_prec_venta;
    private javax.swing.JTextField jTextField_precio_compra;
    private javax.swing.JTextField jTextField_stock;
    // End of variables declaration//GEN-END:variables
}