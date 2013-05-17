package Diccionario;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.lang.String;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelNuevaPalabra extends javax.swing.JPanel {

  Diccionario padre;
  HashMap<String,String> traducciones;
  
  
  public PanelNuevaPalabra(Diccionario pad) {
    this.padre = pad;
    traducciones = new HashMap<>();
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    txtPalabra = new javax.swing.JTextField();
    panelTraducciones = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txtIdioma = new javax.swing.JTextField();
    txtTraduccion = new javax.swing.JTextField();
    btnGuardar = new javax.swing.JButton();
    btnPalabraNueva = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaTraducciones = new javax.swing.JTable();
    jButton1 = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    txtSalida = new javax.swing.JTextArea();

    jLabel1.setText("Introduce una palabra nueva:");

    panelTraducciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
    jLabel2.setText("Traducciones");

    jLabel3.setText("Idioma");

    jLabel4.setText("Traducción");

    btnGuardar.setText("Guardar");
    btnGuardar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnGuardarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelTraduccionesLayout = new javax.swing.GroupLayout(panelTraducciones);
    panelTraducciones.setLayout(panelTraduccionesLayout);
    panelTraduccionesLayout.setHorizontalGroup(
      panelTraduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelTraduccionesLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelTraduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtTraduccion)
          .addGroup(panelTraduccionesLayout.createSequentialGroup()
            .addGroup(panelTraduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel3)
              .addComponent(jLabel4)
              .addComponent(txtIdioma))
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTraduccionesLayout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(btnGuardar)))
        .addContainerGap())
    );
    panelTraduccionesLayout.setVerticalGroup(
      panelTraduccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelTraduccionesLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtTraduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
        .addComponent(btnGuardar)
        .addContainerGap())
    );

    btnPalabraNueva.setText("Añadir palabra");
    btnPalabraNueva.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnPalabraNuevaActionPerformed(evt);
      }
    });

    tablaTraducciones.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane1.setViewportView(tablaTraducciones);

    jButton1.setText("Volver");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    txtSalida.setColumns(20);
    txtSalida.setRows(5);
    jScrollPane2.setViewportView(txtSalida);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(panelTraducciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(txtPalabra, javax.swing.GroupLayout.Alignment.LEADING))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
              .addComponent(jScrollPane2)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jButton1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPalabraNueva)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(panelTraducciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnPalabraNueva)
          .addComponent(jButton1))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    if (txtIdioma.getText().equals("")||txtTraduccion.getText().equals("")){
      JOptionPane.showMessageDialog
              (this,"Hay que introducir datos","ERROR",JOptionPane.ERROR_MESSAGE);
    }else{
      traducciones.put(txtIdioma.getText().toLowerCase(),txtTraduccion.getText().toLowerCase());
      txtIdioma.setText("");
      txtTraduccion.setText("");
    }
    this.actualizarTabla();
  }//GEN-LAST:event_btnGuardarActionPerformed

  private void actualizarTabla() {
    DefaultTableModel modelo = new DefaultTableModel();
    tablaTraducciones.setModel(modelo);
    try{
      modelo.addColumn("Idioma");
      modelo.addColumn("Traducción");
      Iterator it = traducciones.entrySet().iterator();
      while(it.hasNext()){
        Map.Entry e = (Map.Entry)it.next();
        Object []ob = new Object[2];
        ob[0] = e.getKey();
        ob[1] = e.getValue();
        modelo.addRow(ob);
        ob=null;
      }
    }catch(Exception ex){
      System.err.append(ex.getMessage());
    }
  }
  
  private void btnPalabraNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalabraNuevaActionPerformed
    if (txtPalabra.getText().equals("")||traducciones.isEmpty()){
      JOptionPane.showMessageDialog(this,"Hay que introducir datos","ERROR",JOptionPane.ERROR_MESSAGE);
    }else{
      if (comprobarRepetido(txtPalabra.getText().toLowerCase())){
        padre.baseDatos.store(new Palabra(txtPalabra.getText().toLowerCase(), traducciones, 0));
        txtPalabra.setText("");
        visualizarTraducciones(traducciones);
        traducciones.clear();
        actualizarTabla();
      }else{
        JOptionPane.showMessageDialog(this,"La palabra está repetida","ERROR",JOptionPane.ERROR_MESSAGE);
        txtPalabra.setText("");
      }      
    }    
  }//GEN-LAST:event_btnPalabraNuevaActionPerformed

  
  private void visualizarTraducciones(HashMap<String, String> traducciones) {
    txtSalida.setText("");
    try{
      Iterator it = traducciones.entrySet().iterator();
      while(it.hasNext()){
        Map.Entry e = (Map.Entry)it.next();
        txtSalida.setText(txtSalida.getText()+"<"+e.getKey()+" "+e.getValue()+">\n");
      }
    }catch(Exception ex){
      System.err.append(ex.getMessage());
    }
  }
  
  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    padre.setContentPane(padre.panelPorDefecto);
    padre.pack();
  }//GEN-LAST:event_jButton1ActionPerformed

  /**
   * Consultamos la base de datos para saber si la palabra que queremos agregar ya está
   * @param palabra
   * @return 
   */
  private boolean comprobarRepetido(String palabra) {
    boolean comprobado=false;
    Palabra pal;
    Query consulta = padre.baseDatos.query();
    consulta.constrain(Palabra.class);
    consulta.descend("palabra").constrain(palabra);
    ObjectSet resultado = consulta.execute();
    if (resultado.isEmpty()){
      return true;
    }else return false;
  }
    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnGuardar;
  private javax.swing.JButton btnPalabraNueva;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JPanel panelTraducciones;
  private javax.swing.JTable tablaTraducciones;
  private javax.swing.JTextField txtIdioma;
  private javax.swing.JTextField txtPalabra;
  private javax.swing.JTextArea txtSalida;
  private javax.swing.JTextField txtTraduccion;
  // End of variables declaration//GEN-END:variables

}
