package sem1_tarea;

import javax.swing.JOptionPane;

public class tarea_arreglo1 extends javax.swing.JFrame {

    int i = 0;
    int[] arreglo = new int[5];

    public tarea_arreglo1() {
        initComponents();
        lb_num.setText("" + 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lb_num = new javax.swing.JLabel();
        txt_num = new javax.swing.JTextField();
        btn_ingresarNumeros = new javax.swing.JButton();
        btn_mostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_mostrar = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        txt_numbuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lb_resultadobusqueda = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ingrese número ");

        lb_num.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_num.setText("n");

        txt_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numActionPerformed(evt);
            }
        });

        btn_ingresarNumeros.setText("ingresar numero");
        btn_ingresarNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarNumerosActionPerformed(evt);
            }
        });

        btn_mostrar.setText("mostrar numeros");
        btn_mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarActionPerformed(evt);
            }
        });

        txt_mostrar.setColumns(20);
        txt_mostrar.setRows(5);
        jScrollPane1.setViewportView(txt_mostrar);

        txt_numbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_numbuscarMouseEntered(evt);
            }
        });
        txt_numbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numbuscarActionPerformed(evt);
            }
        });
        txt_numbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numbuscarKeyTyped(evt);
            }
        });

        jLabel2.setText("número a buscar:");

        lb_resultadobusqueda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_resultadobusqueda.setText("???");

        jLabel4.setText("número encontado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_ingresarNumeros)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_numbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_resultadobusqueda))
                        .addGap(129, 129, 129))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_num)
                        .addGap(37, 37, 37)
                        .addComponent(txt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btn_mostrar)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lb_num)
                    .addComponent(txt_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btn_ingresarNumeros)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_mostrar)
                        .addGap(34, 34, 34)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_numbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_resultadobusqueda)
                    .addComponent(jLabel4))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txt_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numActionPerformed

    private void btn_ingresarNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarNumerosActionPerformed

        arreglo[i] = Integer.parseInt(txt_num.getText());
        i++;
        lb_num.setText("" + (i + 1) + ":");
        txt_num.setText("");

        if (i == arreglo.length) {
            JOptionPane.showMessageDialog(null, "El arreglo esta lleno!");
            lb_num.setText("" + 5);
            txt_num.setEnabled(false);
            btn_ingresarNumeros.setEnabled(false);
        }

    }//GEN-LAST:event_btn_ingresarNumerosActionPerformed

    private void btn_mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarActionPerformed

        for (int arr : arreglo) {
            txt_mostrar.append(arr + " ");
        }
    }//GEN-LAST:event_btn_mostrarActionPerformed

    private void txt_numbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numbuscarActionPerformed

        buscarNum();
    }//GEN-LAST:event_txt_numbuscarActionPerformed

    private void txt_numbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numbuscarKeyTyped

    }//GEN-LAST:event_txt_numbuscarKeyTyped

    private void txt_numbuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_numbuscarMouseEntered
        // TODO add your handling code here:
        //buscarNum();
    }//GEN-LAST:event_txt_numbuscarMouseEntered

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
            java.util.logging.Logger.getLogger(tarea_arreglo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tarea_arreglo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tarea_arreglo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tarea_arreglo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tarea_arreglo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresarNumeros;
    private javax.swing.JButton btn_mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_num;
    private javax.swing.JLabel lb_resultadobusqueda;
    private javax.swing.JTextArea txt_mostrar;
    private javax.swing.JTextField txt_num;
    private javax.swing.JTextField txt_numbuscar;
    // End of variables declaration//GEN-END:variables

    public void buscarNum() {
        if (arreglo == null) {
            JOptionPane.showMessageDialog(null, "Completar arreglo");
            return;
        }

        int clave = Integer.parseInt(txt_numbuscar.getText());
        for (int j = 0; j < arreglo.length; j++) {
            if (arreglo[j] == clave) {
                lb_resultadobusqueda.setText("numero encontrado - " + clave);
                return;
            }
        }
        lb_resultadobusqueda.setText("numero no encontrado");
        txt_numbuscar.setText("");
    }

}
