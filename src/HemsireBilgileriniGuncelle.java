
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class HemsireBilgileriniGuncelle extends javax.swing.JFrame {

    Connection conn = null; // conn adında bağlantı sınıfından nesnesi oluşturulur ve müteakip satırlarda kullanılacağından null atanır...
    PreparedStatement pst = null; //pst adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.
    ResultSet rs = null;//pst nesnesi ile yapılan sorguların tutulabilmesi için rs adında ResultSet sınıfından bir nesne oluşturulur ve null atanır...

    String hemsireTC ;
     
    public HemsireBilgileriniGuncelle() {
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
        jTextField2.setText(hemsireTC);//Metin alanına hemşirenin TCKN'si aktarılır.
    }

    public HemsireBilgileriniGuncelle(String hemsireTCKN) {//yönetici/tıbbi sekreter id'si ile bir nesne oluşturmak maksadıyla overloading yapılır ve ikinci constructor oluşturulur.
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
        this.hemsireTC = hemsireTCKN;//costructor'a gelen hemsireTCKN'si hemsireTC değişkenine aktarılır.
        jTextField2.setText(hemsireTC); //Metin alanına hemşirenin TCKN'si aktarılır.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doktor Bilgilerimi Güncelle ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Ad : ");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(20, 80, 120, 20);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField1);
        jTextField1.setBounds(140, 80, 190, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("T.C. Kimlik No : ");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(20, 50, 120, 20);

        jTextField2.setEditable(false);
        jTextField2.setBackground(java.awt.SystemColor.control);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField2);
        jTextField2.setBounds(140, 50, 190, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Soyad : ");
        jLayeredPane1.add(jLabel4);
        jLabel4.setBounds(20, 110, 120, 20);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField3);
        jTextField3.setBounds(140, 110, 190, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Doğum Tarihi :");
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(20, 140, 120, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Hemşire Bölüm : ");
        jLayeredPane1.add(jLabel6);
        jLabel6.setBounds(20, 170, 120, 20);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField5);
        jTextField5.setBounds(140, 170, 190, 20);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("İl :");
        jLayeredPane1.add(jLabel7);
        jLabel7.setBounds(20, 200, 120, 20);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField6);
        jTextField6.setBounds(140, 200, 190, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Cinsiyet  : ");
        jLayeredPane1.add(jLabel8);
        jLabel8.setBounds(20, 260, 120, 20);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField7);
        jTextField7.setBounds(140, 230, 190, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("İlçe  :");
        jLayeredPane1.add(jLabel9);
        jLabel9.setBounds(20, 230, 120, 20);

        jComboBox1.setBackground(new java.awt.Color(153, 204, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cinsiyet Seçiniz ...", "Erkek", "Kadın" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jComboBox1);
        jComboBox1.setBounds(140, 260, 190, 20);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Telefon :");
        jLayeredPane1.add(jLabel10);
        jLabel10.setBounds(20, 290, 120, 20);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField8.setText("(05..)");
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField8);
        jTextField8.setBounds(140, 290, 190, 20);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("E-mail :");
        jLayeredPane1.add(jLabel11);
        jLabel11.setBounds(20, 320, 120, 20);

        jTextField9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField9);
        jTextField9.setBounds(140, 320, 190, 20);

        jButton1.setText("Güncelle ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(150, 410, 90, 23);

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jLayeredPane1.add(jDateChooser1);
        jDateChooser1.setBounds(140, 140, 190, 22);

        jButton2.setText("Hemşire Paneline Dön");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(130, 440, 140, 23);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("Şifre :");
        jLayeredPane1.add(jLabel12);
        jLabel12.setBounds(20, 350, 120, 20);

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jTextField10);
        jTextField10.setBounds(140, 350, 190, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       conn = MySQLConnect.ConnectDB();//bağlantı kurulur.
       
       String date= ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText(); //date değişkenine jDateChooser içinde seçilen tarih String olarak aktarılır...
       String sql = "update hemsireler set hemsire_ad = '"+jTextField1.getText()+"', hemsire_soyad = '"+jTextField3.getText()+"', "
               + "hemsire_dogum = '"+date+"',hemsire_alan = '"+jTextField5.getText()+"',hemsire_il = '"+jTextField6.getText()+"',"
               + "hemsire_ilçe = '"+jTextField7.getText()+"', hemsire_cins = '"+jComboBox1.getSelectedItem().toString()+"', hemsire_tel = '"+jTextField8.getText()+"', "
               + "email='"+jTextField9.getText()+"',hemsire_sifre ='"+jTextField10.getText()+"' where hemsire_tc ='"+hemsireTC+"' "; 
       
       try{ //exception yakalamak ve programın çalışmaya temini için try catch bloklarını kullandık.Uygun hatanın ekrana yazdırılabilmesi için
            pst=conn.prepareStatement(sql);//yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            boolean donut = pst.execute(); //veri tabanından dönüş(etkilenen satır) olursa donut değişkeni true değeri alır.
            
            
            if(donut=true)
            {
                JOptionPane.showMessageDialog(null, "Güncelleme tamamlanmıştır.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Bilgileri Tekrar Giriniz");
            }
       }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
        } 
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new HemsirePaneli(hemsireTC).setVisible(true);//hemsireTC'si ile HemsirePaneli açılır.
        this.setVisible(false);//HemsireBilgileriniGuncelle kapatılır.
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

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
            java.util.logging.Logger.getLogger(HemsireBilgileriniGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HemsireBilgileriniGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HemsireBilgileriniGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HemsireBilgileriniGuncelle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HemsireBilgileriniGuncelle().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
