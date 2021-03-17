import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ReceteYaz extends javax.swing.JFrame {//javax.swing.JFrame sınıfından ReceteYaz adında bir KALITIM sınıfı oluşturulur...
    
    Connection conn = null; // conn adında bağlantı sınıfından nesnesi oluşturulur ve müteakip satırlarda kullanılacağından null atanır...
    PreparedStatement pst = null; //pst adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.
    ResultSet rs = null;//pst nesnesi ile yapılan sorguların tutulabilmesi için rs adında ResultSet sınıfından bir nesne oluşturulur ve null atanır...
    
    String gelenDoktorTC;
    
    public ReceteYaz() {
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
    }
    
    public ReceteYaz(String gelenDoktorTC){//overloading yapılır ve String parametresi alan ikinci constructor oluşturulur.
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
        this.gelenDoktorTC = gelenDoktorTC;//gelenDoktorTC gelenDoktorTC'ye aktarılır. bu değişken sorguda kullanılacaktır.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reçete Yaz");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reçete Yaz");
        jLabel1.setBounds(0, 10, 400, 30);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Reçete : ");
        jLabel2.setBounds(20, 180, 120, 20);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField1.setBounds(140, 70, 230, 20);
        jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Hasta T.C. Kimlik No : ");
        jLabel3.setBounds(20, 70, 120, 20);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Tarih : ");
        jLabel4.setBounds(20, 120, 120, 20);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane1.setBounds(140, 180, 230, 130);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("Yaz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(263, 360, 110, 23);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jDateChooser1.setBounds(140, 120, 230, 20);
        jLayeredPane1.add(jDateChooser1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setText("Ana Sayfaya Geri Dön");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(150, 400, 150, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //REÇETE YAZMA İŞLEMLERİ
        
        conn = MySQLConnect.ConnectDB();//bağlantı oluşturulur.
        String date= ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();//date değişkenine jDateChooser içinde seçilen tarih String olarak aktarılır...
        String Sql = "insert into recete(dr_id, hasta_id, dr_aciklama, recete_tarihi) values((Select distinct dr_id from doktorlar "
                + "where dr_tc = '"+gelenDoktorTC+"'),(Select distinct hasta_id from hastalar where hasta_tc = '"+jTextField1.getText()+"'),?,?)";
        try{//exception yakalamak ve programın çalışmaya temini için try catch bloklarını kullandık.Uygun hatanın ekrana yazdırılabilmesi için
            pst=conn.prepareStatement(Sql);//yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür. 
            pst.setString(2,date); //sorgunun içinde soru işareti ile belirtilen ikinci alan manüpile edilerek yerine date değişkeni gönderilir... 
            pst.setString(1,jTextArea1.getText());//sorgunun içinde soru işareti ile belirtilen ilk alan manüpile edilerek yerine jTextArea1 içindeki veri gönderilir...
            boolean donut = pst.execute();
            if(donut=true)
            {
                JOptionPane.showMessageDialog(null, "Reçete kaydI tamamlanmıştır.");
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
        new DoktorPaneli(gelenDoktorTC).setVisible(true);//DoktorPaneli gelenDoktorTC ile açılır.
        this.setVisible(false);//ReceteYaz kapatılır.
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
            java.util.logging.Logger.getLogger(ReceteYaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceteYaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceteYaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceteYaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceteYaz().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
