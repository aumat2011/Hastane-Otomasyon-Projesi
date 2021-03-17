
public class Supervisor extends javax.swing.JFrame {//javax.swing.JFrame sınıfından Supervisor adında bir KALITIM sınıfı oluşturulur...

    String superVisorId;
    
    public Supervisor() {
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
    }
    
     public Supervisor(String gelenVeri) {//gelen verinin tutulabilmesi maksadıyla overloading yapılır ve ikinci constructor oluşturulur.
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
        this.superVisorId = gelenVeri;
        jLabel3.setText("Hoşgeldiniz admin ID numaranız : " + superVisorId );//Gelen veriye ekrana yazdırılır.
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yönetici Paneli");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hastane Yönetim Paneli");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);
        jLabel1.setBounds(0, 100, 590, 80);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Yapmak istediğiniz işlemi yukarıdaki menüler aracılığıyla yapabilirsiniz");
        jLabel2.setBounds(0, 270, 590, 40);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBounds(0, 200, 600, 40);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(600, 35));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/hasta icon.png"))); // NOI18N
        jMenu1.setText("Hasta");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu1.setPreferredSize(new java.awt.Dimension(100, 19));

        jMenuItem1.setText("Bilgileri Öğren(TCKN)");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Bilgiler Öğen(İsim)");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Oda Bilgisi Gir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Oda Bilgisi Öğren(TCKN)");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Oda Bilgisi Öğren(İsim)");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/doktor icon.jpg"))); // NOI18N
        jMenu2.setText("Doktor");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(100, 19));

        jMenuItem6.setText("Doktor Ekle");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/clinic icon.png"))); // NOI18N
        jMenu3.setText("Klinik");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(100, 19));

        jMenuItem7.setText("Klinik Ekle");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/randevu icon.png"))); // NOI18N
        jMenu4.setText("Randevu");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(100, 19));

        jMenuItem9.setText("Randevu Sorgula");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem11.setText("İki Tarih Arası Randevular");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem11);

        jMenuItem10.setText("Doktor Randevu Sayısı(Toplam)");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem8.setText("Doktor Randevu Sayısı(İki Tarih Arası)");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/lab icon.png"))); // NOI18N
        jMenu5.setText("Laboratuvar");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(100, 19));

        jMenuItem12.setText("Laboratuvar Sonuç Sorgula");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/çıkış icon.jpg"))); // NOI18N
        jMenu6.setText("Çıkış");
        jMenu6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(100, 19));
        jMenu6.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu6MenuSelected(evt);
            }
        });
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new HastaBilgileriniOgrenIsmeGore(superVisorId).setVisible(true);//HastaBilgileriniOgrenIsmeGore superVisorId değeri ile açılır.
        this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       new DoktorRandevuSayisi(superVisorId).setVisible(true);//DoktorRandevuSayisi superVisorId değeri ile açılır.
       this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new DoktorRandevuSorgulaTariheGore(superVisorId).setVisible(true);//DoktorRandevuSorgulaTariheGore superVisorId değeri ile açılır.
        this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new HastaBilgileriniOgren(superVisorId).setVisible(true);//HastaBilgileriniOgren superVisorId değeri ile açılır.
        this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
       
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenu6MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu6MenuSelected
       new GirisEkrani().setVisible(true);//GirisEkrani açılır.
       this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenu6MenuSelected

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new DoktorEkle(superVisorId).setVisible(true);//DoktorEkle superVisorId değeri ile açılır.
        this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new HastaOdaKayıt(superVisorId).setVisible(true);//HastaOdaKayıt superVisorId değeri ile açılır.
        this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new odaNoOgrenTC(superVisorId).setVisible(true);//OdaNoOgrenTC superVisorId değeri ile açılır.
        this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new IsimeGoreOdaSorgula(superVisorId).setVisible(true);//IsimeGoreOdaSorgula superVisorId değeri ile açılır.
        this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       new KlinikEkle_1(superVisorId).setVisible(true);//KlinikEkle_1 superVisorId değeri ile açılır.
       this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new RandevuSorgulaYonetici(superVisorId).setVisible(true);//RandevuSorgulaYonetici superVisorId değeri ile açılır.
        this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        new TarihlerArasiRandevu(superVisorId).setVisible(true);//TarihlerArasiRandevu superVisorId değeri ile açılır.
        this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        new LaboratuvarSonucSorgulamaYonetici(superVisorId).setVisible(true);//LaboratuvarSonucSorgulamaYonetici superVisorId değeri ile açılır.
        this.setVisible(false);//Supervisor kapatılır.
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supervisor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
