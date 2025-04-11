package sem2_tarea;

import javax.swing.JOptionPane;

public class Ejercicio3Registro extends javax.swing.JFrame {

    double [] notas = new double[10];
    int indice=0;
    public Ejercicio3Registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_nota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();
        btn_estadisticas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_resbuscar = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_estadisticas = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_mostrar = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txt_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 83, -1));

        jLabel1.setText("nota de estudiante");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        btn_agregar.setText("agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        btn_mostrar.setText("mostrar");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        btn_estadisticas.setText("Estadisticas");
        btn_estadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, -1));

        jLabel3.setText("buscar numero");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, 20));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 70, 30));

        btn_buscar.setText("buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, 20));

        txt_resbuscar.setColumns(20);
        txt_resbuscar.setRows(5);
        jScrollPane2.setViewportView(txt_resbuscar);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 320, 90));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 360, 10));

        txt_estadisticas.setColumns(20);
        txt_estadisticas.setRows(5);
        jScrollPane4.setViewportView(txt_estadisticas);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 260, 90));

        txt_mostrar.setColumns(20);
        txt_mostrar.setRows(5);
        jScrollPane1.setViewportView(txt_mostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        
        if (indice<notas.length) {
            double nota = Double.parseDouble(txt_nota.getText());
            if (nota<0 || nota>20) {
                JOptionPane.showMessageDialog(this, "nota inválida");
                txt_nota.setText("");
                return;
            }
            notas[indice]=Double.parseDouble(txt_nota.getText());
            indice++;
            txt_nota.setText("");
            JOptionPane.showMessageDialog(this, "numero agregado");
        }else{
            JOptionPane.showMessageDialog(this, "arreglo lleno");
            txt_nota.setText("");
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed
        
        for (double arr: notas) {
            txt_mostrar.append(arr+" ");
        }
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void btn_estadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estadisticasActionPerformed
        double sum=0.0, mayor=notas[0], menor=notas[0];
        int aprobados=0, desaprobados=0;
        for (int i = 0; i < notas.length; i++) {
            sum+=notas[i];
            if (notas[i]>=11) {
                aprobados++;
            }else{
                desaprobados++;
            }
            
            if (mayor<notas[i]) {
                mayor=notas[i];
            }
            if (menor>notas[i]) {
                menor=notas[i];
            }
        }
        double prom = sum/notas.length;
        txt_estadisticas.append("promedio general: "+prom+"\n");
        txt_estadisticas.append("aprobados: "+aprobados+" desaprobados: "+desaprobados+"\n");
        txt_estadisticas.append("mayor nota: "+mayor+" menor nota: "+menor+"\n");
    }//GEN-LAST:event_btn_estadisticasActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        double num_buscado = Double.parseDouble(txt_buscar.getText());
        txt_resbuscar.append("el numero se encuentra en el indice:\n");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i]==num_buscado) {
                txt_resbuscar.append(+i+"\n");
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio3Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio3Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_estadisticas;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextArea txt_estadisticas;
    private javax.swing.JTextArea txt_mostrar;
    private javax.swing.JTextField txt_nota;
    private javax.swing.JTextArea txt_resbuscar;
    // End of variables declaration//GEN-END:variables
}
