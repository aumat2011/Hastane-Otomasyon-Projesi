import java.awt.Desktop;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.awt.DesktopBrowse;
import java.text.MessageFormat;
import java.awt.print.*;
import javax.swing.JTable;
import net.sf.jasperreports.engine.JRBand;
import net.sf.jasperreports.engine.JRField;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class EczaciPaneli extends javax.swing.JFrame { //javax.swing.JFrame sınıfından DoktorEkle adında bir KALITIM sınıfı oluşturulur...
    
    Connection conn = null; // conn adında bağlantı sınıfından nesnesi oluşturulur ve müteakip satırlarda kullanılacağından null atanır...
    PreparedStatement pst = null; //pst adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.
    ResultSet rs = null;//pst nesnesi ile yapılan sorguların tutulabilmesi için rs adında ResultSet sınıfından bir nesne oluşturulur ve null atanır...
    
    String eczaci_id ;
    String hasta_TC;
    String hasta_id;
    
public EczaciPaneli() {
    initComponents(); //arayüz birleşenleri başlatılır(ekranda gösterilir)...
}

public EczaciPaneli(String eczaci_ID) {//eczacı id'si ile bir nesne oluşturmak maksadıyla overloading yapılır ve ikinci constructor oluşturulur.
      
    initComponents(); //arayüz birleşenleri başlatılır(ekranda gösterilir)...
    this.eczaci_id = eczaci_ID; //costructor'a gelen yönetici/tıbbi sekreter id'si ID değişkenine aktarılır.
      
    conn = MySQLConnect.ConnectDB(); //bağlantı oluşturulur.     
    
    String sql = "select eczaci_ad, eczaci_soyad from eczacilar where eczaci_id =?" ;
      
    try 
    {         
        pst=conn.prepareStatement(sql); //yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür. 
        pst.setString(1, eczaci_id); //sorgunun içinde soru işareti ile belirtilen alan manüpile edilerek yerine doktorTCKN değişkeni gönderilir... 
        rs=pst.executeQuery(); //sorgu sonucu rs değişkenine döndürülür.
              
        if(rs.next()) //eğer döngü sonucunda dönen varsa ekrana doktorun adı ve soyadı yazdırılır.
        {
            jLabel2.setText("Hoşgeldiniz Sayın Ecz. " + rs.getString("eczaci_ad") + " " + rs.getString("eczaci_soyad"));
        }
        else {
            JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Soyadınız Kayıtlı Değildir.");
        }     
              
    }catch(Exception e){ //hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
        JOptionPane.showMessageDialog(null, e);
    } 
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eczacı Paneli");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("T.C. Kimlik No Giriniz :");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("Reçete Görüntüle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setText("Recete Yazdır");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hasta Ad ", "Hasta Soyad", "Doktor Ad", "Doktor Soyad", "Reçete Tarihi", "Reçete"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setText("Giriş Ekranına Dön");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(384, 384, 384)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        conn = MySQLConnect.ConnectDB(); //bağlantı oluşturulur.  
        
        String sql = "select distinct h.hasta_ad,h.hasta_soyad,d.dr_ad,d.dr_soyad,r.recete_tarihi,r.dr_aciklama from hastalar h, recete r, doktorlar d \n" +
                       "where h.hasta_tc = ? and h.hasta_id = r.hasta_id and r.dr_id = d.dr_id" ;
        
         try 
         {
              hasta_TC = jTextField1.getText();
              
              String sql2 = "Select * from recete r where r.hasta_id in (Select h.hasta_id from hastalar h where h.hasta_tc = ?) ";
              pst = conn.prepareStatement(sql2);
              pst.setString(1, hasta_TC);
              rs=pst.executeQuery();
              
              while (rs.next()) //sorgu veri tabanından veri okuduğu sürece döngü çalışmaya devam eder...
              {
                hasta_id = String.valueOf(rs.getString("hasta_id"));
              }
              
              pst=conn.prepareStatement(sql);//yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür. 
              pst.setString(1, jTextField1.getText()); //sorgunun içinde soru işareti ile belirtilen alan manüpile edilerek yerine doktorTCKN değişkeni gönderilir... 
              rs=pst.executeQuery(); //sorgu sonucu rs değişkenine döndürülür.
              
              while (rs.next()) //sorgu veri tabanından veri okuduğu sürece döngü çalışmaya devam eder...
              {
                  String hastaad = String.valueOf(rs.getString("hasta_ad")); //hasta_ad kolonundaki değer result set vasıtasıyla hastaad değişkenine aktarılır...
                  String hastasoyad = String.valueOf(rs.getString("hasta_soyad"));//hasta_soyad kolonundaki değer result set vasıtasıyla hastasoyad değişkenine aktarılır...
                  String drad = String.valueOf(rs.getString("dr_ad"));//dr_ad kolonundaki değer result set vasıtasıyla drad değişkenine aktarılır...
                  String drsoyad = String.valueOf(rs.getString("dr_soyad"));//dr_soyad kolonundaki değer result set vasıtasıyla drsoyad değişkenine aktarılır...
                  String recetetarihi = String.valueOf(rs.getString("recete_tarihi"));//recete_tarihi kolonundaki değer result set vasıtasıyla recetetarihi değişkenine aktarılır...
                  String receteaciklama = String.valueOf(rs.getString("dr_aciklama"));//dr_aciklama kolonundaki değer result set vasıtasıyla receteaciklama değişkenine aktarılır...
                  
                  String tbData[] = {hastaad, hastasoyad, drad, drsoyad, recetetarihi, receteaciklama}; // değişkenler tbData adlı bir diziye aktarılır.
                  DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel(); // TableModel sınıfından tblModel nesnesi oluşturulur. 
                  tblModel.addRow(tbData); //tblModel nesnesine tbData dizisi gönderilir.
              }
              
         }
         catch(Exception e)//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
         {
             JOptionPane.showMessageDialog(null, e);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new GirisEkrani().setVisible(true);//GirisEkrani açılır...
        this.setVisible(false);//EczaciPaneli kapatılır...               
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //YAZICIDAN ÇIKTI ALMA İŞLEMLERİ
        conn = MySQLConnect.ConnectDB();//bağlantı oluşturulur.
        
        try{ //exception yakalamak ve programın çalışmaya temini için try catch bloklarını kullandık.Uygun hatanın ekrana yazdırılabilmesi için 
            
            JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\aumat\\Documents\\NetBeansProjects\\Hto\\src\\report2.jrxml");
            String queryString = "SELECT r.recete_id as ReceteNo,concat(d.dr_ad,' ',d.dr_soyad) As DoktorAdi,concat(h.hasta_ad,' ',h.hasta_soyad) as HastaAdi,r.recete_tarihi as Tarih,r.dr_aciklama as Aciklama FROM recete r inner join hastalar h on h.hasta_id=r.hasta_id inner join doktorlar d on d.dr_id=r.dr_id where r.hasta_id = '"+hasta_id+"'";        
            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(queryString);
            jdesign.setQuery(updateQuery);
            
            JasperReport jreport = JasperCompileManager.compileReport(jdesign);
            JasperPrint jprint = JasperFillManager.fillReport(jreport, null, conn);        
            JasperViewer.viewReport(jprint);    
            
        }catch(Exception e){ //hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.       
    }     


        /*MessageFormat header = new MessageFormat("REÇETE");//Başlık ve alt başlık oluşturulur.
        MessageFormat footer = new MessageFormat("Bilgiler");

        try{
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex);
        }   
        YAKINDA BULUNAN ECZANELERİ GÖSTERME İŞLEMİ
 * Desktop d = Desktop.getDesktop();
        
        try {
            d.browse(new URI("www.google.com/search?rlz=1C1GCEU_trTR918TR918&tbs=lf:1,lf_ui:3&tbm=lcl&sxsrf=ALeKk03SmP_5KofMtHNJE7y8dTNDwv7vhg:1614948223321&q=en+yak%C4%B1n+eczane+nerede&rflfq=1&num=10&ved=2ahUKEwiWlrn5lpnvAhWB3eAKHYIiDMAQtgN6BAgEEAc#rlfi=hd:;si:;mv:[[39.9067851,32.8544651],[39.8917013,32.8331482]];tbs:lrf:!1m4!1u3!2m2!3m1!1e1!2m1!1e3,lf:1,lf_ui:3"));
        } catch (IOException ex) {
            Logger.getLogger(EczaciPaneli.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(EczaciPaneli.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    private static class jTable { //Çıktı alınabilmesi maksadıyla jTable sınıfı oluşturulmuştur.

        public jTable() {
        }
          
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
            java.util.logging.Logger.getLogger(EczaciPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EczaciPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EczaciPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EczaciPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EczaciPaneli().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
