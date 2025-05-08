/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sem6_ejerciciosVideo;

import java.util.Arrays;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tapia
 */
public class ejercicio3_vista extends javax.swing.JFrame {

    private DefaultTableModel model = new DefaultTableModel();

    public ejercicio3_vista() {
        initComponents();
        String headers[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

        model.setColumnIdentifiers(headers);
        tb_temp.setModel(model);
    }

    private int x = 0, y = 0;
    private double temperaturas[][] = new double[4][7];

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_temp = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_res = new javax.swing.JTextArea();
        txt_temp = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lb_dia_sem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_temp.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        tb_temp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "lun", "mar", "mier", "juev", "vie", "sab", "dom"
            }
        ));
        tb_temp.setGridColor(new java.awt.Color(255, 102, 102));
        jScrollPane1.setViewportView(tb_temp);

        jButton1.setText("ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_res.setColumns(20);
        txt_res.setRows(5);
        jScrollPane2.setViewportView(txt_res);

        jButton2.setText("agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lb_dia_sem.setText("sem");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jButton1)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(lb_dia_sem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_temp, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton2)
                .addGap(62, 62, 62))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_temp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(lb_dia_sem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /*double[] promedios = new double[4];
        double mayor = temperaturas[0][0];
        String mayor_msj = "";
        for (int i = 0; i < temperaturas.length; i++) {
            double sum = 0;
            for (int j = 0; j < temperaturas[i].length; j++) {
                sum += temperaturas[i][j]; 
                if (temperaturas[i][j]>mayor) {
                    mayor=temperaturas[i][j];
                    mayor_msj = "Mayor temperatura: "+mayor+" en sem "+i+" dia "+j;
                }
            }

            double prom = sum / temperaturas[i].length;
            promedios[i] = prom;
        }

        double promgen = sum/28;
        txt_res.append("Promedios de cada semana: " + Arrays.toString(promedios) + "\n");
        txt_res.append(mayor_msj);*/

        double[] promedios = new double[4];
        double sumaTotal = 0;
        
        int cont15 = 0;

        double mayor = temperaturas[0][0];
        String mayor_msj = "", mayor_35="";

        for (int i = 0; i < temperaturas.length; i++) {//recorrer filas-semanas
            double sum = 0;

            for (int j = 0; j < temperaturas[i].length; j++) {//recorrer las columnas-dias de la sem actual
                if (temperaturas[i][j]<15) {
                    cont15++;
                }else if(temperaturas[i][j]>35){ mayor_35="si";}
                
                sum += temperaturas[i][j];
                sumaTotal += temperaturas[i][j];

                if (temperaturas[i][j] > mayor) {
                    mayor = temperaturas[i][j];
                    mayor_msj = "Mayor temperatura: " + mayor + " en semana " + (i+1) + " dia " + (j+1);
                }
            }

            double prom = sum / temperaturas[i].length;
            promedios[i] = prom; 
        }

        double promgen = sumaTotal / (temperaturas.length * temperaturas[0].length);

        txt_res.append("Promedios de cada semana: " + Arrays.toString(promedios) + "\n");
        txt_res.append("Promedio general: " + promgen + "\n");
        txt_res.append(mayor_msj + "\n");
        txt_res.append("Dias con temperaturas mayores a 35: "+mayor_35);
        txt_res.append("Dias con temperaturas menores a 15: "+cont15);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //agregar
        double temp = Double.parseDouble(txt_temp.getText());
        temperaturas[x][y] = temp;

        String[] ctemp = new String[7];
        for (int j = 0; j < temperaturas[x].length; j++) {
            ctemp[j] = String.valueOf(temperaturas[x][j]);
        }

        if (model.getRowCount() > x) {
            for (int j = 0; j < ctemp.length; j++) {
                model.setValueAt(ctemp[j], x, j);
            }
        } else {
            model.addRow(ctemp);
        }
        y++;
        if (y >= 7) {
            y = 0;
            x++;
        }

        if (x >= 4) {
            x = 0;
            txt_temp.setEnabled(false);
        }

        lb_dia_sem.setText("Temperatura semana " + (x + 1) + " día " + (y + 1));
        txt_temp.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ejercicio3_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ejercicio3_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ejercicio3_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ejercicio3_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ejercicio3_vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_dia_sem;
    private javax.swing.JTable tb_temp;
    private javax.swing.JTextArea txt_res;
    private javax.swing.JTextField txt_temp;
    // End of variables declaration//GEN-END:variables
}
