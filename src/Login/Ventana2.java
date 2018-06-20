package Login;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ventana2 extends javax.swing.JFrame {
  URL url = null;
       ImageIcon icon = null;
    /**
     * Creates new form Ventana2
     */
    public Ventana2 (){
      initComponents();
      this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblOpcion = new javax.swing.JLabel();
        jcbOpciones = new javax.swing.JComboBox<>();
        lblimagenes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstListado = new javax.swing.JList<>();
        MostrarLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("freVentana2"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOpcion.setBackground(new java.awt.Color(255, 255, 204));
        lblOpcion.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblOpcion.setForeground(new java.awt.Color(51, 51, 255));
        lblOpcion.setText("Selecciona Una Opción:");
        lblOpcion.setName(""); // NOI18N

        jcbOpciones.setBackground(new java.awt.Color(102, 255, 204));
        jcbOpciones.setForeground(new java.awt.Color(153, 0, 51));
        jcbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "*********", "BOB", "HOMERO", "JERRY" }));
        jcbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionesActionPerformed(evt);
            }
        });

        lblimagenes.setText("jLabel1");

        lstListado.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Opción 1", "Opción 2", "Opción 3", "Opción 4", "Opción 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstListado);

        MostrarLista.setText("OPCIÓN");
        MostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(MostrarLista)
                        .addGap(67, 67, 67))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(lblOpcion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jcbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOpcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblimagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(MostrarLista)
                        .addGap(57, 57, 57))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionesActionPerformed
            int op = jcbOpciones.getSelectedIndex();
        String cadena =jcbOpciones.getSelectedItem().toString();
        switch (op){
            case 1: mostrarImagen("/Imagenes/bob.jpg", op,cadena);
            break;
            case 2: mostrarImagen("/Imagenes/homero.jpg",op,cadena);
            break;
            case 3: mostrarImagen("/Imagenes/jerry.jpg", op,cadena);
            break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jcbOpcionesActionPerformed

    private void MostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarListaActionPerformed
        // TODO add your handling code here:
        int opc = lstListado.getSelectedIndex();
        switch (opc){
            case -1:JOptionPane.showMessageDialog(null,"no ha seleccionado",
                    "mesaje",JOptionPane.WARNING_MESSAGE);
               break;
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: mostrarCuadro(opc+1);
            break;
            }     
    }//GEN-LAST:event_MostrarListaActionPerformed
public void mostrarCuadro(int op){
    JOptionPane.showMessageDialog(null, "opcion No:" + op,
            "opcion seleccionada",
            JOptionPane.INFORMATION_MESSAGE);
}
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana2().setVisible(true);
            }
        });
    }
public void mostrarImagen(String urlImagen,int opcion,String cad){
    //ruta = urlImagen;
    url = this.getClass().getResource(urlImagen);
    icon = new ImageIcon(url);
    lblOpcion.setIcon(icon);
    lblOpcion.setText("Opcion:" + opcion + "Texto:" + cad);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MostrarLista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbOpciones;
    private javax.swing.JLabel lblOpcion;
    private javax.swing.JLabel lblimagenes;
    private javax.swing.JList<String> lstListado;
    // End of variables declaration//GEN-END:variables
}
