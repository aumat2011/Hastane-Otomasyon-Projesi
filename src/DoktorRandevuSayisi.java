import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DoktorRandevuSayisi extends javax.swing.JFrame { //javax.swing.JFrame sınıfından DoktorRandevuSayisi adında bir KALITIM sınıfı oluşturulur...
    
    Connection conn = null; // conn adında bağlantı sınıfından nesnesi oluşturulur ve müteakip satırlarda kullanılacağından null atanır...
    PreparedStatement pst = null; //pst adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.
    ResultSet rs = null;//pst nesnesi ile yapılan sorguların tutulabilmesi için rs adında ResultSet sınıfından bir nesne oluşturulur ve null atanır...

    String ID;
    
    public DoktorRandevuSayisi() {
        initComponents(); //arayüz birleşenleri başlatılır(ekranda gösterilir)...
    }
    
    public DoktorRandevuSayisi(String gelenVeri) {//yönetici/tıbbi sekreter id'si ile bir nesne oluşturmak maksadıyla overloading yapılır ve ikinci constructor oluşturulur.
        initComponents(); //arayüz birleşenleri başlatılır(ekranda gösterilir)...
        this.ID = gelenVeri; //costructor'a gelen yönetici/tıbbi sekreter id'si ID değişkenine aktarılır.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        SORGULA = new javax.swing.JButton();
        BACK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Doktor Adı", "Doktor Soyadı", "Toplam Randevu Sayısı"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doktorların Toplam Randevu Sayısı");
        jLabel1.setOpaque(true);

        SORGULA.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SORGULA.setText("Sorgula");
        SORGULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SORGULAActionPerformed(evt);
            }
        });

        BACK.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BACK.setText("Yönetici Ana Ekranına Dön");
        BACK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BACKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BACK)
                .addGap(24, 24, 24))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(SORGULA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SORGULA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(BACK)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SORGULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SORGULAActionPerformed
        
        try {        
            conn = MySQLConnect.ConnectDB(); //bağlantı oluşturulur.
            PreparedStatement pst = conn.prepareStatement("select d.dr_ad, d.dr_soyad,count(1) from doktorlar d, randevular r where r.dr_id = d.dr_id "
                    + "group by d.dr_id having count(1)>0"); //yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            rs = pst.executeQuery(); //sorgu sonucu rs değişkenine döndürülür.
         
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();//arayüzde jTable1 adında bir tablo modeli oluşturularak tblModel nesnesine aktarılır.
            tblModel.setRowCount(0); //tblModel tablosunun satır sayısı ayarlanır.
         
            while (rs.next()){ //veritabanında veri bulunduğu sürece çalışacak döngü oluşturduk...
                Object o[]={rs.getString("dr_ad"), rs.getString("dr_soyad"), rs.getString("count(1)")};//o nesnesine tablodaki değerler atandı...
                tblModel.addRow(o);//tabloya değerler eklendi. 
            }
            
         }catch(Exception e){ //hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
    }          
    }//GEN-LAST:event_SORGULAActionPerformed

    private void BACKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BACKActionPerformed
        new Supervisor(ID).setVisible(true); //Supervisor ID değişkeni ile açılır...
        this.setVisible(false); //DoktorRandevuSayisi kapatılır.
    }//GEN-LAST:event_BACKActionPerformed

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
            java.util.logging.Logger.getLogger(DoktorRandevuSayisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoktorRandevuSayisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoktorRandevuSayisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoktorRandevuSayisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoktorRandevuSayisi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BACK;
    private javax.swing.JButton SORGULA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
