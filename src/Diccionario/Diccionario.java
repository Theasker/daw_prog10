package Diccionario;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Diccionario extends javax.swing.JFrame {
  ArrayList <Palabra> listaPalabras;
  PanelNuevaPalabra nuevaPalabra;
  JPanel panelPorDefecto;
  ObjectContainer baseDatos;
  
  public Diccionario() {
    initComponents();
    listaPalabras = new ArrayList<>();
    nuevaPalabra = new PanelNuevaPalabra(this);
    panelPorDefecto = (JPanel) getContentPane(); // Panel principal
    baseDatos = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"DBDiccionario.db4o");
    actualizarTablaPalabras();
  }
  
  
  private void actualizarTablaPalabras() {
    // Realizamos una consulta con todos los registros
    Palabra pal;
    Query consulta = baseDatos.query();
    consulta.constrain(Palabra.class);
    ObjectSet resultado = consulta.execute();
    // Actualizamos la tabla
    DefaultTableModel modelo = new DefaultTableModel();
    tablaPalabras.setModel(modelo);
    modelo.addColumn("Palabra");
    modelo.addColumn("cont");
    while(resultado.hasNext()){
      Object [] ob = new Object[2];
      pal = (Palabra) resultado.next();
      ob[0] = pal.getPalabra();
      ob[1] = pal.getContador();
      modelo.addRow(ob);
      ob=null;
    }
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    tablaPalabras = new javax.swing.JTable();
    btnActualizarPalabras = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    tablaTraducciones = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane3 = new javax.swing.JScrollPane();
    txtSalida = new javax.swing.JTextArea();
    menuBar = new javax.swing.JMenuBar();
    fileMenu = new javax.swing.JMenu();
    openMenuItem = new javax.swing.JMenuItem();
    saveMenuItem = new javax.swing.JMenuItem();
    saveAsMenuItem = new javax.swing.JMenuItem();
    exitMenuItem = new javax.swing.JMenuItem();
    editMenu = new javax.swing.JMenu();
    cutMenuItem = new javax.swing.JMenuItem();
    copyMenuItem = new javax.swing.JMenuItem();
    pasteMenuItem = new javax.swing.JMenuItem();
    deleteMenuItem = new javax.swing.JMenuItem();
    helpMenu = new javax.swing.JMenu();
    contentsMenuItem = new javax.swing.JMenuItem();
    aboutMenuItem = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    tablaPalabras.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
    tablaPalabras.setModel(new javax.swing.table.DefaultTableModel(
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
    tablaPalabras.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tablaPalabrasMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(tablaPalabras);

    btnActualizarPalabras.setText("Actualizar");
    btnActualizarPalabras.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnActualizarPalabrasActionPerformed(evt);
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
    jScrollPane2.setViewportView(tablaTraducciones);

    jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    jLabel1.setText("Traducciones");

    txtSalida.setColumns(20);
    txtSalida.setRows(5);
    jScrollPane3.setViewportView(txtSalida);

    fileMenu.setMnemonic('f');
    fileMenu.setText("Movimientos");

    openMenuItem.setMnemonic('o');
    openMenuItem.setText("Añadir palabra");
    openMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        openMenuItemActionPerformed(evt);
      }
    });
    fileMenu.add(openMenuItem);

    saveMenuItem.setMnemonic('s');
    saveMenuItem.setText("Borrar palabra");
    fileMenu.add(saveMenuItem);

    saveAsMenuItem.setMnemonic('a');
    saveAsMenuItem.setText("Mostrar todo");
    fileMenu.add(saveAsMenuItem);

    exitMenuItem.setMnemonic('x');
    exitMenuItem.setText("Exit");
    exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitMenuItemActionPerformed(evt);
      }
    });
    fileMenu.add(exitMenuItem);

    menuBar.add(fileMenu);

    editMenu.setMnemonic('e');
    editMenu.setText("Edit");

    cutMenuItem.setMnemonic('t');
    cutMenuItem.setText("Cut");
    editMenu.add(cutMenuItem);

    copyMenuItem.setMnemonic('y');
    copyMenuItem.setText("Copy");
    editMenu.add(copyMenuItem);

    pasteMenuItem.setMnemonic('p');
    pasteMenuItem.setText("Paste");
    editMenu.add(pasteMenuItem);

    deleteMenuItem.setMnemonic('d');
    deleteMenuItem.setText("Delete");
    editMenu.add(deleteMenuItem);

    menuBar.add(editMenu);

    helpMenu.setMnemonic('h');
    helpMenu.setText("Help");

    contentsMenuItem.setMnemonic('c');
    contentsMenuItem.setText("Contents");
    helpMenu.add(contentsMenuItem);

    aboutMenuItem.setMnemonic('a');
    aboutMenuItem.setText("About");
    helpMenu.add(aboutMenuItem);

    menuBar.add(helpMenu);

    setJMenuBar(menuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnActualizarPalabras))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel1)
          .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        .addGap(4, 4, 4))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnActualizarPalabras))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 15, Short.MAX_VALUE)))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
      System.exit(0);
      baseDatos.close();
    }//GEN-LAST:event_exitMenuItemActionPerformed

  private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
    setContentPane(nuevaPalabra);
    pack();
  }//GEN-LAST:event_openMenuItemActionPerformed

  private void btnActualizarPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPalabrasActionPerformed
    actualizarTablaPalabras();
  }//GEN-LAST:event_btnActualizarPalabrasActionPerformed

  private void tablaPalabrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPalabrasMouseClicked
    HashMap<String,String> traducciones = new HashMap<>();
    // buscamos la fila y palabra seleccionadas
    int row = tablaPalabras.rowAtPoint(evt.getPoint());
    String palabra = tablaPalabras.getValueAt(row, 0).toString();
    txtSalida.setText(palabra);
    // Buscamos la palabra seleccionada en la base de datos
    Palabra pal;
    Query consulta = baseDatos.query();
    consulta.constrain(Palabra.class);
    consulta.descend("palabra").constrain(palabra);
    ObjectSet resultado = consulta.execute();
    resultado.hasNext();
    pal = (Palabra) resultado.next();
    traducciones = pal.getTraducciones();
    // Actualizamos la tabla de traducciones
    DefaultTableModel modelo = new DefaultTableModel();
    tablaTraducciones.setModel(modelo);
    modelo.addColumn("Idioma");
    modelo.addColumn("Traducción");
    try{
      Iterator it = traducciones.entrySet().iterator();
      while(it.hasNext()){
        Map.Entry e = (Map.Entry)it.next();
        Object []ob = new Object[2];
        txtSalida.setText(txtSalida.getText()+e.getKey()+"-"+e.getValue());
        ob[0] = e.getKey();
        ob[1] = e.getValue();
        modelo.addRow(ob);
        ob=null;
      }
    }catch(Exception ex){
      System.err.append(ex.getMessage());
    }
    
  }//GEN-LAST:event_tablaPalabrasMouseClicked

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
      java.util.logging.Logger.getLogger(Diccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Diccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Diccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Diccionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>


    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Diccionario().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuItem aboutMenuItem;
  private javax.swing.JButton btnActualizarPalabras;
  private javax.swing.JMenuItem contentsMenuItem;
  private javax.swing.JMenuItem copyMenuItem;
  private javax.swing.JMenuItem cutMenuItem;
  private javax.swing.JMenuItem deleteMenuItem;
  private javax.swing.JMenu editMenu;
  private javax.swing.JMenuItem exitMenuItem;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JMenu helpMenu;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenuItem openMenuItem;
  private javax.swing.JMenuItem pasteMenuItem;
  private javax.swing.JMenuItem saveAsMenuItem;
  private javax.swing.JMenuItem saveMenuItem;
  private javax.swing.JTable tablaPalabras;
  private javax.swing.JTable tablaTraducciones;
  private javax.swing.JTextArea txtSalida;
  // End of variables declaration//GEN-END:variables

}
