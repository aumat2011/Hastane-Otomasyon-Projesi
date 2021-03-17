
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class DoktorPaneli extends javax.swing.JFrame { //javax.swing.JFrame sınıfından DoktorEkle adında bir KALITIM sınıfı oluşturulur...
    
    Connection conn = null; // conn adında bağlantı sınıfından nesnesi oluşturulur ve müteakip satırlarda kullanılacağından null atanır...
    PreparedStatement pst = null; //pst adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.
    ResultSet rs = null;//pst nesnesi ile yapılan sorguların tutulabilmesi için rs adında ResultSet sınıfından bir nesne oluşturulur ve null atanır...

     String doktorTCKN ;
    
    public DoktorPaneli() {
        initComponents(); //arayüz birleşenleri başlatılır(ekranda gösterilir)...
    }
    
    public DoktorPaneli(String gelenTCKN){ //doktorun adını ekrana yazdırabilmek maksadıyla overloading yapılır ve ikinci constructor oluşturulur.
        initComponents(); //arayüz birleşenleri başlatılır(ekranda gösterilir)...
        this.doktorTCKN = gelenTCKN; //gelenTCKN doktorTCKN'ye aktarılır. bu değişken doktorun adını ve soyadını bulmak için sorguda kullanılacaktır.
        
        conn = MySQLConnect.ConnectDB();//bağlantı oluşturulur.
        String Sql = "Select dr_ad, dr_soyad from doktorlar where dr_tc =?";
        
        try{ //exception yakalamak ve programın çalışmaya temini için try catch bloklarını kullandık.Uygun hatanın ekrana yazdırılabilmesi için
            pst=conn.prepareStatement(Sql); //yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.  
            pst.setString(1,doktorTCKN); //sorgunun içinde soru işareti ile belirtilen alan manüpile edilerek yerine doktorTCKN değişkeni gönderilir...                    
            rs=pst.executeQuery();//sorgu sonucu rs değişkenine döndürülür.
            
            if(rs.next()){ //eğer döngü sonucunda dönen varsa ekrana doktorun adı ve soyadı yazdırılır.
                jLabel1.setText("Hoşgeldiniz Sayın Dr. " + rs.getString("dr_ad") + " " + rs.getString("dr_soyad") );
            }
            else {
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Soyadınız Kayıtlı Değildir.");
            }            
            
        }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
        }
    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doktor Paneli");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("Ana Menüye Geri Dön");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenuBar2.setPreferredSize(new java.awt.Dimension(459, 30));

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/hasta icon.png"))); // NOI18N
        jMenu3.setText("Hasta");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenu3.setIconTextGap(6);
        jMenu3.setPreferredSize(new java.awt.Dimension(83, 19));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu3MenuSelected(evt);
            }
        });
        jMenu3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMenu3MouseMoved(evt);
            }
        });

        jMenuItem1.setText("Reçete Görüntüle");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseMoved(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuItem1.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenuItem1MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem3.setText("Reçete Yaz");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar2.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/randevu icon.png"))); // NOI18N
        jMenu4.setText("Randevu");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(83, 19));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu4);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/lab icon.png"))); // NOI18N
        jMenu1.setText("Laboratuvar");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu1.setPreferredSize(new java.awt.Dimension(110, 19));
        jMenu1.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu1MenuSelected(evt);
            }
        });

        jMenuItem2.setText("Laboratuvar Sonuç Girişi");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Laboratuvar Sonuç Göster");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar2.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/bilgi icon.jpg"))); // NOI18N
        jMenu2.setText("Bilgilerim");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu2.setPreferredSize(new java.awt.Dimension(100, 19));
        jMenu2.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu2MenuSelected(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/çıkış icon.jpg"))); // NOI18N
        jMenu5.setText("Çıkış");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenu5.setIconTextGap(5);
        jMenu5.setPreferredSize(new java.awt.Dimension(100, 20));
        jMenu5.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu5MenuSelected(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(103, 103, 103))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected
        new Randevularım(doktorTCKN).setVisible(true); //Randevularım açılır...
        this.setVisible(false); //DoktorPaneli kapatılır...
    }//GEN-LAST:event_jMenu4MenuSelected

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new ReceteGoruntule(doktorTCKN).setVisible(true); //ReceteGoruntule açılır...
        this.setVisible(false); //DoktorPaneli kapatılır...
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
       
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseMoved
       
    }//GEN-LAST:event_jMenu3MouseMoved

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
       
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jMenuItem1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseMoved
       
    }//GEN-LAST:event_jMenuItem1MouseMoved

    private void jMenuItem1MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenuItem1MenuKeyPressed
      
    }//GEN-LAST:event_jMenuItem1MenuKeyPressed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
        
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuSelected
        new GirisEkrani().setVisible(true); //GirisEkrani açılır...
        this.setVisible(false); //DoktorPaneli kapatılır...
    }//GEN-LAST:event_jMenu5MenuSelected

    private void jMenu3MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu3MenuSelected
       
    }//GEN-LAST:event_jMenu3MenuSelected

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
        
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        String gonderDoktorTc = doktorTCKN; //gonderDoktorTc ile doktorTCKN eşitlenir..
        new ReceteYaz(doktorTCKN).setVisible(true); //ReceteYaz doktorTCKN ile açılır...
        this.setVisible(false); //DoktorPaneli kapatılır...
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu2MenuSelected
        String gonderDoktorTc = doktorTCKN; //gonderDoktorTc ile doktorTCKN eşitlenir..
        new DoktorBilgileriniGuncelle(doktorTCKN).setVisible(true); //DoktorBilgileriniGuncelle doktorTCKN ile açılır...
        this.setVisible(false); //DoktorPaneli kapatılır...
    }//GEN-LAST:event_jMenu2MenuSelected

    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu1MenuSelected
    
    }//GEN-LAST:event_jMenu1MenuSelected

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new LaboratuvarSonucGirisi(doktorTCKN).setVisible(true); //LaboratuvarSonucGirisi doktorTCKN ile açılır...
        this.setVisible(false); //DoktorPaneli kapatılır...
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new LaboratuvarSonucSorgula(doktorTCKN).setVisible(true); //LaboratuvarSonucSorgula doktorTCKN ile açılır...
        this.setVisible(false); //DoktorPaneli kapatılır...
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new GirisEkrani().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DoktorPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoktorPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoktorPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoktorPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorPaneli().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
