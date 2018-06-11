package Login;

import javax.swing.JOptionPane;

public class Ventana2 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana2
     */
    public Ventana2() {
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
        jcbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "**********", "TENIS", "ZAPATILLAS", "ZAPATOS" }));
        jcbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionesActionPerformed(evt);
            }
        });

        lblimagenes.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblOpcion))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblimagenes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jcbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblOpcion)
                .addGap(18, 18, 18)
                .addComponent(jcbOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblimagenes)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionesActionPerformed
            int op = jcbOpciones.getSelectedIndex();
        
        switch (op){
            case 0: JOptionPane.showMessageDialog(null, "No Hay Opción Seleccionada", "Opción Seleccionada" , JOptionPane.INFORMATION_MESSAGE);
                lblOpcion.setText("No Hay Opción Seleccionada");
                lblimagenes.setText("NO hay opción seleccionada");
            break;
            case 1: JOptionPane.showMessageDialog(null, "TENIS", "Opción Seleccionada" , JOptionPane.INFORMATION_MESSAGE);
                lblOpcion.setText("Selecciona TENIS");
                lblimagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TENIS.jpg")));
            break;
            case 2: JOptionPane.showMessageDialog(null, "ZAPATILLAS", "Opción Seleccionada" , JOptionPane.INFORMATION_MESSAGE); 
                lblOpcion.setText("Selecciona ZAPATILLAS");
                lblimagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ZAPATILLAS.jpg")));
            break;
            case 3: JOptionPane.showMessageDialog(null, "ZAPATOS", "Opción Seleccionada" , JOptionPane.INFORMATION_MESSAGE);
                lblOpcion.setText("Selecciona ZAPATOS");
                lblimagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ZAPATOS.jpg")));
            break;
        }
    }//GEN-LAST:event_jcbOpcionesActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbOpciones;
    private javax.swing.JLabel lblOpcion;
    private javax.swing.JLabel lblimagenes;
    // End of variables declaration//GEN-END:variables
}
