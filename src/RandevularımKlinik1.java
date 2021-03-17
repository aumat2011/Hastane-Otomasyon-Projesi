import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RandevularımKlinik1 extends javax.swing.JFrame {//javax.swing.JFrame sınıfından RandevularımKlinik1 adında bir KALITIM sınıfı oluşturulur...
    
    Connection conn = null; // conn adında bağlantı sınıfından nesnesi oluşturulur ve müteakip satırlarda kullanılacağından null atanır...
    PreparedStatement pst = null; //pst adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.
    ResultSet rs = null;//pst nesnesi ile yapılan sorguların tutulabilmesi için rs adında ResultSet sınıfından bir nesne oluşturulur ve null atanır...
    
    String hemsireTC;
    
    public RandevularımKlinik1() {
        initComponents(); //arayüz birleşenleri başlatılır(ekranda gösterilir)...
    }
    
    
    public RandevularımKlinik1(String hemsireTCKN){//İçine parametre olarak String değeri alan ikinci constructor oluşturulur.
       initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
       this.hemsireTC = hemsireTCKN;//conrtuctor ile gelen hemsireTCKN, hemsireTC'ye aktarılır. bu değişken sınıf içindeki fonksiyon ve sorgularda kullanılacaktır.
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Randevularım");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Klinik Randevularım");
        jLabel1.setBounds(0, 7, 520, 30);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hasta Ad", "Hasta Soyad", "Randevu Tarihi", "Randevu Saati"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(30, 50, 452, 180);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("Yenile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(200, 270, 110, 23);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setText("Ana Menüye Geri Dön");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(170, 310, 170, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     //İLGİLİ KLİNİĞE BAĞLI RANDEVULARI SORGULAMA İŞLEMLERİ
     try {//exception yakalamak ve programın çalışmaya temini için try catch bloklarını kullandık.Uygun hatanın ekrana yazdırılabilmesi için
        
        conn = MySQLConnect.ConnectDB();//bağlantı oluşturulur.
        PreparedStatement pst = conn.prepareStatement("Select distinct a.hasta_ad, a.hasta_soyad, r.randevu_tarihi, r.randevu_saati "
                + "From hastalar a, randevular r,hemsireler h\n" +
                  "where r.klinik_id in (Select distinct k.klinik_id From klinikler k, hemsireler h where h.hemsire_alan = k.klinik_ismi\n" +
                  "and  hemsire_tc= ?) and r.hasta_id = a.hasta_id ") ;//yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.  
        pst.setString(1, hemsireTC);//sorgunun içinde soru işareti ile belirtilen alan manüpile edilerek yerine hemsireTC değişkeni gönderilir...
        rs = pst.executeQuery();//sorgu sonucu rs değişkenine döndürülür.
        
        while (rs.next()){//veritabanında veri bulunduğu sürece çalışacak döngü oluşturduk...
            
            String hastaad = String.valueOf(rs.getString("hasta_ad"));//hasta_ad adlı kolonun değeri hastaad değişkenine aktarılır.
            String hastasoyad = String.valueOf(rs.getString("hasta_soyad"));//hasta_soyad adlı kolonun değeri hastasoyad değişkenine aktarılır.
            String randevutarihi = String.valueOf(rs.getString("randevu_tarihi"));//randevu_tarihi adlı kolonun değeri randevutarihi değişkenine aktarılır.
            String randevusaati = String.valueOf(rs.getString("randevu_saati"));//randevu_saati adlı kolonun değeri randevusaati değişkenine aktarılır. 
            
            String tbData[] = {hastaad, hastasoyad, randevutarihi, randevusaati};//oluşturduğumuz değişkenler tutulmak üzere tbData dizisine aktarılır.
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();//arayüzde jTable1 adında bir tablo modeli oluşturularak tblModel nesnesine aktarılır.
            tblModel.addRow(tbData);//tabloya değerler eklendi. 
       }
        
       }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
    }                                        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new HemsirePaneli(hemsireTC).setVisible(true);//HemsirePaneli hemsireTC değişkeni ile açılır.
        this.setVisible(false);//RandevularımKlinik1 değişkeni kapatılır.
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
            java.util.logging.Logger.getLogger(Randevularım.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Randevularım.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Randevularım.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Randevularım.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Randevularım().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
