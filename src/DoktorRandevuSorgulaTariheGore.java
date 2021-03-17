
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class DoktorRandevuSorgulaTariheGore extends javax.swing.JFrame { //javax.swing.JFrame sınıfından DoktorEkle adında bir KALITIM sınıfı oluşturulur...
    
    Connection conn = null; // conn adında bağlantı sınıfından nesnesi oluşturulur ve müteakip satırlarda kullanılacağından null atanır...
    PreparedStatement pst = null; //pst adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.
    ResultSet rs = null;//pst nesnesi ile yapılan sorguların tutulabilmesi için rs adında ResultSet sınıfından bir nesne oluşturulur ve null atanır...
    
    String ID;

    public DoktorRandevuSorgulaTariheGore() {
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
    }
    
    public DoktorRandevuSorgulaTariheGore(String gelenVeri) { //yönetici/tıbbi sekreter id'si ile bir nesne oluşturmak maksadıyla overloading yapılır ve ikinci constructor oluşturulur.
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
        this.ID = gelenVeri; //costructor'a gelen yönetici/tıbbi sekreter id'si ID değişkenine aktarılır.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        SORGULA = new javax.swing.JButton();
        BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doktor Adı", "Doktor Soyadı", "Randevu Sayısı"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("Başlangıç Tarihi :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Bitiş Tarihi : ");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tarihler Arasında Doktor Randevuları");

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        SORGULA.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SORGULA.setText("Sorgula");
        SORGULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SORGULAActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BACK)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(78, 78, 78)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(271, 271, 271)
                            .addComponent(SORGULA))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(SORGULA)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(BACK)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        new Supervisor(ID).setVisible(true); //Supervisor ID değişkeni ile açılır...
        this.setVisible(false); //DoktorRandevuSorgulaTariheGore kapatılır...
    }//GEN-LAST:event_BACKActionPerformed

    private void SORGULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SORGULAActionPerformed
        //SORGULA İŞLEMLERİ
        try {        
            conn = MySQLConnect.ConnectDB(); //bağlantı oluşturulur.
            String date1= ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();//sorgulanacak küçük tarih alınır...
            String date2= ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();//sorgulanacak büyük tarih alınır...
            
            pst = conn.prepareStatement("SELECT d.dr_ad, d.dr_soyad, COUNT( r.dr_id) as sayı FROM randevular r, doktorlar d  where "
                    + "r.randevu_tarihi  >= '"+date1+"' and r.randevu_tarihi <='"+date2+"' and d.dr_id = r.dr_id GROUP BY r.dr_id "
                    + "HAVING COUNT( r.dr_id ) > 0 "); //yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            rs = pst.executeQuery();//veri tabanından dönüş(etkilenen satır) olursa rs nesnesine değeri aktarılır.
         
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel(); //arayüzde jTable1 adında bir tablo modeli oluşturularak tblModel nesnesine aktarılır.
            tblModel.setRowCount(0); //tblModel tablosunun satır sayısı ayarlanır.
         
            while (rs.next()){ //veritabanında veri bulunduğu sürece çalışacak döngü oluşturduk...
            Object o[]={rs.getString("dr_ad"), rs.getString("dr_soyad"),rs.getString("sayı")};//o nesnesine tablodaki değerler atandı...
            tblModel.addRow(o); //tabloya değerler eklendi.        
            } 
            
         }catch(Exception e){ //hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
         }                 
    }//GEN-LAST:event_SORGULAActionPerformed

    
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
            java.util.logging.Logger.getLogger(DoktorRandevuSorgulaTariheGore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoktorRandevuSorgulaTariheGore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoktorRandevuSorgulaTariheGore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoktorRandevuSorgulaTariheGore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorRandevuSorgulaTariheGore().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton SORGULA;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
