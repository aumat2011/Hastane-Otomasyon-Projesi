
import javax.swing.JComboBox;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class KayitOl extends javax.swing.JFrame {//javax.swing.JFrame sınıfından DoktorEkle adında bir KALITIM sınıfı oluşturulur...

    Connection conn = null; // conn adında bağlantı sınıfından nesnesi oluşturulur ve müteakip satırlarda kullanılacağından null atanır...
    PreparedStatement pst = null; //pst adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.
    ResultSet rs = null;//pst nesnesi ile yapılan sorguların tutulabilmesi için rs adında ResultSet sınıfından bir nesne oluşturulur ve null atanır...
    
    public KayitOl() {
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kayıt");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Şifre");
        jLabel1.setBounds(20, 530, 110, 20);
        jLayeredPane2.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.setBounds(160, 290, 240, 110);
        jLayeredPane2.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("T.C. Kimlik No : ");
        jLabel2.setBounds(20, 20, 110, 20);
        jLayeredPane2.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.setBounds(160, 20, 240, 20);
        jLayeredPane2.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Ad:");
        jLabel3.setBounds(20, 50, 110, 20);
        jLayeredPane2.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Soyad : ");
        jLabel4.setBounds(20, 80, 110, 20);
        jLayeredPane2.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.setBounds(160, 50, 240, 19);
        jLayeredPane2.add(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.setBounds(160, 80, 240, 19);
        jLayeredPane2.add(jTextField4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Doğum Tarihi:");
        jLabel5.setBounds(20, 110, 110, 20);
        jLayeredPane2.add(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Doğum Yeri : ");
        jLabel6.setBounds(20, 140, 110, 20);
        jLayeredPane2.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.setBounds(160, 140, 240, 19);
        jLayeredPane2.add(jTextField6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Anne Adı :");
        jLabel7.setBounds(20, 170, 110, 20);
        jLayeredPane2.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.setBounds(160, 170, 240, 19);
        jLayeredPane2.add(jTextField7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Baba Adı :");
        jLabel8.setBounds(20, 200, 110, 20);
        jLayeredPane2.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.setBounds(160, 200, 240, 19);
        jLayeredPane2.add(jTextField8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("İl :");
        jLabel9.setBounds(20, 230, 110, 20);
        jLayeredPane2.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField9.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jTextField9.setBounds(160, 230, 240, 19);
        jLayeredPane2.add(jTextField9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("İlçe : ");
        jLabel10.setBounds(20, 260, 110, 20);
        jLayeredPane2.add(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Adres : ");
        jLabel11.setBounds(20, 290, 110, 20);
        jLayeredPane2.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.setBounds(160, 530, 240, 19);
        jLayeredPane2.add(jTextField11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sigorta Giriniz...", "Emekli Sandığı", "Bağkur", "SSK" }));
        jComboBox2.setToolTipText("Sigorta Giriniz...");
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jComboBox2.setBounds(160, 440, 240, 19);
        jLayeredPane2.add(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Cinsiyet : ");
        jLabel12.setBounds(20, 410, 110, 20);
        jLayeredPane2.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox3.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox3.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cinsiyet Seçiniz...", "Erkek", "Kadın" }));
        jComboBox3.setToolTipText("Cinsiyet Seçiniz");
        jComboBox3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jComboBox3.setBounds(160, 410, 240, 19);
        jLayeredPane2.add(jComboBox3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel13.setText("Sigorta :");
        jLabel13.setBounds(20, 440, 110, 20);
        jLayeredPane2.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField13.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        jTextField13.setBounds(160, 260, 240, 19);
        jLayeredPane2.add(jTextField13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel14.setText("Telefon : ");
        jLabel14.setBounds(20, 470, 110, 20);
        jLayeredPane2.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField14.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jTextField14.setBounds(160, 470, 240, 19);
        jLayeredPane2.add(jTextField14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("E-Posta :");
        jLabel15.setBounds(20, 500, 110, 20);
        jLayeredPane2.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField15.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        jTextField15.setBounds(160, 500, 240, 19);
        jLayeredPane2.add(jTextField15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(20, 590, 430, 10);
        jLayeredPane2.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("Kayıt Ol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(340, 610, 100, 23);
        jLayeredPane2.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setText("Ana Menüye Dön");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(20, 610, 140, 23);
        jLayeredPane2.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setBounds(160, 110, 240, 20);
        jLayeredPane2.add(jDateChooser1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        conn = MySQLConnect.ConnectDB(); //bağlantı oluşturulur.
        String date = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();//date değişkenine jDateChooser içinde seçilen tarih String olarak aktarılır...
        
        String Sql = "insert into hastalar(hasta_tc, hasta_ad, hasta_soyad, hasta_dogum, hasta_dyeri, hasta_adres, hasta_il, hasta_ilce,hasta_cins, hasta_tel, hasta_anne, hasta_baba, hasta_sgk, hasta_mail, hasta_sifre)"
                + "values ('"+jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+date+"',"
                + "'"+jTextField6.getText()+"','"+jTextField1.getText()+"','"+jTextField9.getText()+"','"+jTextField13.getText()+"',"
                + "'"+jComboBox3.getSelectedItem().toString()+"','"+jTextField14.getText()+"', '"+jTextField7.getText()+"', '"+jTextField8.getText()+"',"
                + "'"+jComboBox2.getSelectedItem().toString()+"','"+jTextField15.getText()+"','"+jTextField11.getText()+"')" ;
                
                
        
        try{//exception yakalamak ve programın çalışmaya temini için try catch bloklarını kullandık.Uygun hatanın ekrana yazdırılabilmesi için
            pst=conn.prepareStatement(Sql); //yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.          
            boolean donut = pst.execute();// veri tabanından dönüş(etkilenen satır) olursa donut değişkeni true değeri alır.
            if(donut = true){ 
                JOptionPane.showMessageDialog(null,"Yeni Hasta Kaydı Yapılmıştır.");
            }
            else{
                JOptionPane.showMessageDialog(null,"Tüm Alanları Eksiksiz Doldurunuz...");
            }
                
        }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new GirisEkrani().setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(KayitOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayitOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayitOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayitOl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayitOl().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
