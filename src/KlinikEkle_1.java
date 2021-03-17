

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class KlinikEkle_1 extends javax.swing.JFrame {//javax.swing.JFrame sınıfından KlinikEkle_1 adında bir KALITIM sınıfı oluşturulur...
    
    Connection conn = null; // conn adında bağlantı sınıfından nesnesi oluşturulur ve müteakip satırlarda kullanılacağından null atanır...
    PreparedStatement pst = null; //pst adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.
    ResultSet rs = null;//pst nesnesi ile yapılan sorguların tutulabilmesi için rs adında ResultSet sınıfından bir nesne oluşturulur ve null atanır...

    String ID;

    public KlinikEkle_1() {
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
    }
    
    public KlinikEkle_1(String gelenVeri) {//yönetici/tıbbi sekreter id'si ile bir nesne oluşturmak maksadıyla overloading yapılır ve ikinci constructor oluşturulur.
        initComponents(); //arayüz birleşenleri başlatılır(ekranda gösterilir)...
        ID = gelenVeri; //costructor'a gelen yönetici/tıbbi sekreter id'si ID değişkenine aktarılır.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        YENILE = new javax.swing.JButton();
        EKLE = new javax.swing.JButton();
        BACK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Klinik ID", "Klinik Adı"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        YENILE.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        YENILE.setText("Yenile");
        YENILE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YENILEActionPerformed(evt);
            }
        });

        EKLE.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        EKLE.setText("Ekle");
        EKLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EKLEActionPerformed(evt);
            }
        });

        BACK.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BACK.setText("Yönetici Paneline Geri Dön");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Klinik Ekle");

        jTextField1.setBackground(new java.awt.Color(240, 240, 240));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField1.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Eklenecek Klinik İsmi: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BACK))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(YENILE)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EKLE)
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(YENILE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EKLE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(BACK)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        new Supervisor(ID).setVisible(true); //Supervisor'u ID değeri ile açılır.
        this.setVisible(false);//KlinikEkle1 kapatılır.
    }//GEN-LAST:event_BACKActionPerformed

    private void EKLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EKLEActionPerformed
        conn = MySQLConnect.ConnectDB(); //bağlantı oluşturulur.
        
        String Sql = "insert into klinikler(klinik_ismi) values( '"+jTextField1.getText()+"')";
        
        try{//exception yakalamak ve programın çalışmaya temini için try catch bloklarını kullandık.Uygun hatanın ekrana yazdırılabilmesi için
            pst=conn.prepareStatement(Sql);  //yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.           
            boolean donut = pst.execute(); // veri tabanından dönüş(etkilenen satır) olursa donut değişkeni true değeri alır.
            
            if(donut = true){ 
                JOptionPane.showMessageDialog(null,"Yeni Klinik Kaydı Yapılmıştır.");
            }
            else{
                JOptionPane.showMessageDialog(null,"Tüm Alanları Eksiksiz Doldurunuz...");
            }
                
        }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_EKLEActionPerformed

    private void YENILEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YENILEActionPerformed
        //YENİLEME VE KLİNİK LİSTELEME İŞLEMLERİ YAPILIR.
        try {//exception yakalamak ve programın çalışmaya temini için try catch bloklarını kullandık.Uygun hatanın ekrana yazdırılabilmesi için
            conn = MySQLConnect.ConnectDB(); //bağlantı oluşturulur.
            String sql = "select klinik_id, klinik_ismi from klinikler";
            pst=conn.prepareStatement(sql);//yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            rs = pst.executeQuery(); //yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            
            DefaultTableModel tblModel = (DefaultTableModel)jTable.getModel();//arayüzde jTable1 adında bir tablo modeli oluşturularak tblModel nesnesine aktarılır.
            tblModel.setRowCount(0);//tblModel tablosunun satır sayısı ayarlanır.
            
            while (rs.next()){//veritabanında veri bulunduğu sürece çalışacak döngü oluşturduk...
                Object o[]={rs.getString("klinik_id"), rs.getString("klinik_ismi")};//o nesnesine tablodaki değerler atandı...
                tblModel.addRow(o);  //tabloya değerler eklendi.         
            }
        }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
        }        
    }//GEN-LAST:event_YENILEActionPerformed

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
            java.util.logging.Logger.getLogger(KlinikEkle_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KlinikEkle_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KlinikEkle_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KlinikEkle_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KlinikEkle_1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton EKLE;
    private javax.swing.JButton YENILE;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
