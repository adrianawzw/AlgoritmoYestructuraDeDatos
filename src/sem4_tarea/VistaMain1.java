package sem4_tarea;

import java.awt.GridLayout;
import javax.swing.JButton;

public class VistaMain1 extends javax.swing.JFrame {

    public VistaMain1() {
        initComponents();
    }

    private JButton[][] matriz;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelmatriz = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_numfilas = new javax.swing.JTextField();
        txt_numcolumnas = new javax.swing.JTextField();
        btn_grabar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ingrese numeros de filas");

        jLabel2.setText("ingrese numeros de columnas");

        txt_numfilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numfilasActionPerformed(evt);
            }
        });

        btn_grabar.setText("grabar");
        btn_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelmatrizLayout = new javax.swing.GroupLayout(panelmatriz);
        panelmatriz.setLayout(panelmatrizLayout);
        panelmatrizLayout.setHorizontalGroup(
            panelmatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmatrizLayout.createSequentialGroup()
                .addGroup(panelmatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelmatrizLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(panelmatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelmatrizLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(31, 31, 31)
                                .addComponent(txt_numcolumnas))
                            .addGroup(panelmatrizLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(62, 62, 62)
                                .addComponent(txt_numfilas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelmatrizLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(btn_grabar)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        panelmatrizLayout.setVerticalGroup(
            panelmatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmatrizLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelmatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_numfilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelmatrizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_numcolumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btn_grabar)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmatriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_numfilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numfilasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numfilasActionPerformed

    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed
        int num_filas = Integer.parseInt(txt_numfilas.getText());
        int num_col = Integer.parseInt(txt_numcolumnas.getText());

        matriz = new JButton[num_filas][num_col];
        panelmatriz.removeAll();
        panelmatriz.setLayout(new GridLayout(num_filas, num_col));
        for (int i = 0; i< num_filas; i++) {
            for (int j = 0; j < num_col; j++) {
                int fila = i;
                int col = j;
                JButton boton = new JButton("vacio");
                boton.addActionListener(e -> abrirDialogo(fila, col, boton));
                matriz[i][j] = boton;
                panelmatriz.add(boton);
            }
        }
        
        
        panelmatriz.revalidate();
        panelmatriz.repaint();
    }//GEN-LAST:event_btn_grabarActionPerformed

    private void abrirDialogo(int fila, int columna, JButton boton) {
        Detalles1 men = new Detalles1(this, true);
        men.setVisible(true);
        String datos1 = men.getdatos1();
        int datos2 = men.getdatos2();
        if (datos1 != null && !datos1.isEmpty()) {
            boton.setText("Producto : " + datos1 + " - Stock : " + datos2);
        }
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
            java.util.logging.Logger.getLogger(VistaMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMain1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_grabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelmatriz;
    private javax.swing.JTextField txt_numcolumnas;
    private javax.swing.JTextField txt_numfilas;
    // End of variables declaration//GEN-END:variables
}
