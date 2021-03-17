

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TarihlerArasiRandevu extends javax.swing.JFrame {//javax.swing.JFrame sınıfından TarihlerArasiRandevu adında bir KALITIM sınıfı oluşturulur...
    
    Connection conn = null; // conn adında bağlantı sınıfından nesnesi oluşturulur ve müteakip satırlarda kullanılacağından null atanır...
    ResultSet rs = null;//pst nesnesi ile yapılan sorguların tutulabilmesi için rs adında ResultSet sınıfından bir nesne oluşturulur ve null atanır...
    PreparedStatement pst = null; //pst adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.
    PreparedStatement pst1 = null;//pst1 adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.

    String ID;
  
    public TarihlerArasiRandevu() {
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
    }
    
    public TarihlerArasiRandevu(String gelenVeri) {//gelenVerinin tutulması maksadıyla overloading yapılır ve ikinci constructor oluşturulur.
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
        this.ID = gelenVeri;//gelenVeri ID'ye aktarılır. bu değişken doktorun adını ve soyadını bulmak için sorguda kullanılacaktır.
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        SORGULAMA = new javax.swing.JButton();
        BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Hasta Adı", "Hasta Soyadı", "Doktor Adı", "Doktor Soyadı", "Randevu Tarihi", "Randevu Saati"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Başlangıç Tarihi : ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Bitiş Tarihi: ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tarihler Arası Randevu Sorgulama Ekranı");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Toplam Alınan Randevu Sayısı: ");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SORGULAMA.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SORGULAMA.setText("Sorgula");
        SORGULAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SORGULAMAActionPerformed(evt);
            }
        });

        BACK.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BACK.setText("Yönetici Paneline Geri Dön");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(SORGULAMA)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BACK)
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SORGULAMA, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(BACK)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
       new Supervisor(ID).setVisible(true);//Supervisor ID ile açılır.
       this.setVisible(false);//TarihlerArasiRandevu kapatılır
    }//GEN-LAST:event_BACKActionPerformed

    private void SORGULAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SORGULAMAActionPerformed
        //RANDEVU SORGULAMA İŞLEMLERİ
        String date1=null;
        
        try {   //exception yakalamak ve programın çalışmaya temini için try catch bloklarını kullandık.Uygun hatanın ekrana yazdırılabilmesi için     
         conn = MySQLConnect.ConnectDB();//bağlantı oluşturulur
         date1= ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
         String date2= ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
         PreparedStatement pst = conn.prepareStatement("select h.hasta_ad, h.hasta_soyad, d.dr_ad, d.dr_soyad, r.randevu_tarihi, r.randevu_saati from doktorlar d, "
                                 + "hastalar h, randevular r where r.hasta_id = h.hasta_id and r.dr_id = d.dr_id and (r.randevu_tarihi between '"+date1+"' and '"+date2+"')");//yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
         rs = pst.executeQuery();//yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
         DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();//arayüzde jTable1 adında bir tablo modeli oluşturularak tblModel nesnesine aktarılır.
         tblModel.setRowCount(0);//tblModel tablosunun satır sayısı ayarlanır.
         while (rs.next()){//veritabanında veri bulunduğu sürece çalışacak döngü oluşturduk...
            Object o[]={rs.getString("hasta_ad"), rs.getString("hasta_soyad"),rs.getString("dr_ad"), rs.getString("dr_soyad"), rs.getString("randevu_tarihi"), rs.getString("randevu_saati")};//o nesnesine tablodaki değerler atandı...
            tblModel.addRow(o); //tabloya değerler eklendi.          
           
         }    
         
         pst1 = conn.prepareStatement("select count(randevu_tarihi) from randevular where randevu_tarihi  >= '"+date1+"' and randevu_tarihi <='"+date2+"'");
         rs = pst1.executeQuery();
        if(rs.next()){
            jLabel5.setText(rs.getString("count(randevu_tarihi)"));
        }
         }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
    }                      
      
        
       
    }//GEN-LAST:event_SORGULAMAActionPerformed

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
            java.util.logging.Logger.getLogger(TarihlerArasiRandevu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TarihlerArasiRandevu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TarihlerArasiRandevu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TarihlerArasiRandevu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TarihlerArasiRandevu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton SORGULAMA;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
