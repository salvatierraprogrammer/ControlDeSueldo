
package Vista;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;

public class elaces extends javax.swing.JFrame {

    public elaces() {
        initComponents();
  

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnPagarAfip = new javax.swing.JButton();
        btnPagarAGIP = new javax.swing.JButton();
        btnPagarCELULAR = new javax.swing.JButton();
        btnPagarSUBE = new javax.swing.JButton();
        btnPagarCIUDAD = new javax.swing.JButton();
        btnPagarNARANJA = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusableWindowState(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Servicios a pagar: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 1, 12))); // NOI18N

        btnPagarAfip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/afip.PNG"))); // NOI18N
        btnPagarAfip.setBorder(null);
        btnPagarAfip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarAfipActionPerformed(evt);
            }
        });

        btnPagarAGIP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agip.PNG"))); // NOI18N
        btnPagarAGIP.setBorder(null);
        btnPagarAGIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarAGIPActionPerformed(evt);
            }
        });

        btnPagarCELULAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/movistar.PNG"))); // NOI18N
        btnPagarCELULAR.setBorder(null);
        btnPagarCELULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarCELULARActionPerformed(evt);
            }
        });

        btnPagarSUBE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sube.PNG"))); // NOI18N
        btnPagarSUBE.setBorder(null);
        btnPagarSUBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarSUBEActionPerformed(evt);
            }
        });

        btnPagarCIUDAD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ciudad.PNG"))); // NOI18N
        btnPagarCIUDAD.setBorder(null);
        btnPagarCIUDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarCIUDADActionPerformed(evt);
            }
        });

        btnPagarNARANJA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/naranja.PNG"))); // NOI18N
        btnPagarNARANJA.setBorder(null);
        btnPagarNARANJA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarNARANJAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnPagarSUBE, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnPagarCELULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnPagarAGIP, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnPagarAfip, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(btnPagarNARANJA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPagarCIUDAD)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnPagarSUBE, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPagarCELULAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPagarNARANJA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPagarCIUDAD, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPagarAfip, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagarAGIP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPagarAGIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarAGIPActionPerformed
     
           if(java.awt.Desktop.isDesktopSupported()){
          java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
     
      if(desktop.isSupported(Desktop.Action.BROWSE)){
          try {
              java.net.URI url =new java.net.URI("https://clusterapw.agip.gob.ar/claveciudad/");
              desktop.browse(url);
          } catch (URISyntaxException | IOException ex) {
          }
      }
          
          }
        
        
        
        
    }//GEN-LAST:event_btnPagarAGIPActionPerformed

    private void btnPagarCELULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarCELULARActionPerformed
  
         if(java.awt.Desktop.isDesktopSupported()){
          java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
     
      if(desktop.isSupported(Desktop.Action.BROWSE)){
          try {
              java.net.URI url =new java.net.URI("https://idp.movistar.com.ar/convergencia/login_C2.html");
              desktop.browse(url);
          } catch (URISyntaxException | IOException ex) {
          }
      }
      
      }
        
        
    }//GEN-LAST:event_btnPagarCELULARActionPerformed

    private void btnPagarSUBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarSUBEActionPerformed
        
          if(java.awt.Desktop.isDesktopSupported()){
          java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
     
      if(desktop.isSupported(Desktop.Action.BROWSE)){
          try {
              java.net.URI url =new java.net.URI("https://www.argentina.gob.ar/sube/carga");
              desktop.browse(url);
          } catch (URISyntaxException | IOException ex) {
          }
      }
      
      }  
    }//GEN-LAST:event_btnPagarSUBEActionPerformed

    private void btnPagarCIUDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarCIUDADActionPerformed
      
            
          if(java.awt.Desktop.isDesktopSupported()){
          java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
     
      if(desktop.isSupported(Desktop.Action.BROWSE)){
          try {
              java.net.URI url =new java.net.URI("https://hb.redlink.com.ar/ciudad/login.htm");
              desktop.browse(url);
          } catch (URISyntaxException | IOException ex) {
          }
      }
      
      }
    }//GEN-LAST:event_btnPagarCIUDADActionPerformed

    private void btnPagarNARANJAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarNARANJAActionPerformed
     
               if(java.awt.Desktop.isDesktopSupported()){
          java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
     
      if(desktop.isSupported(Desktop.Action.BROWSE)){
          try {
              java.net.URI url =new java.net.URI("https://naranja-users.auth0.com/login?state=g6Fo2SBRYlNXSDREYTMzdjRCTy1rZDNPVF82QzR0Ml9fbDlQUqN0aWTZIElBTFhhQk1sQjBnR3lBdXI1cTh6NVpPZW5QQ0FDVERyo2NpZNkgZXJDaEtOdzB5T2JLdER6c05naDNycWZYbWJKczJtU3o&client=erChKNw0yObKtDzsNgh3rqfXmbJs2mSz&protocol=oauth2&redirect_uri=https%3A%2F%2Fnaranjaonline.naranja.com%2Fcallback&response_mode=form_post&response_type=code%20id_token%20token&scope=write%3Abff-mobile%20write%3Abff-payments%20write%3Abff-loans-mobile%20openid%20profile%20email%20write.self&nonce=637171360967320490.OWQ3NDVhODYtZmU5OS00NTk0LWE5ZTMtMTFjMzdiMzczMTQ3NDE3ODgyZjgtNjIyYi00MjI3LTg3NzAtNmMwOGU0NDdlZjA4&audience=https%3A%2F%2Fnaranja.com%2Fnonline%2Fapi&x-client-SKU=ID_NET451&x-client-ver=5.3.0.0");
              desktop.browse(url);
          } catch (URISyntaxException | IOException ex) {
       
       }
  
    }
}
    }//GEN-LAST:event_btnPagarNARANJAActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnPagarAfipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarAfipActionPerformed
        
             if(java.awt.Desktop.isDesktopSupported()){
          java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
     
      if(desktop.isSupported(Desktop.Action.BROWSE)){
          try {
              java.net.URI url =new java.net.URI("https://www.afip.gob.ar/sitio/externos/default.asp");
              desktop.browse(url);
          } catch (URISyntaxException | IOException ex) {
          }
      
      }
      } 
    }//GEN-LAST:event_btnPagarAfipActionPerformed

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
            java.util.logging.Logger.getLogger(elaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(elaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(elaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(elaces.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new elaces().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnPagarAGIP;
    public javax.swing.JButton btnPagarAfip;
    public javax.swing.JButton btnPagarCELULAR;
    public javax.swing.JButton btnPagarCIUDAD;
    public javax.swing.JButton btnPagarNARANJA;
    public javax.swing.JButton btnPagarSUBE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel11;
    // End of variables declaration//GEN-END:variables

}
