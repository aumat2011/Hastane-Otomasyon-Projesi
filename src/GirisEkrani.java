
import com.mysql.jdbc.MySQLConnection;
import java.awt.Cursor;
import java.sql.*;
import javax.swing.*;


public class GirisEkrani extends javax.swing.JFrame {//javax.swing.JFrame sınıfından GirisEkrani adında bir KALITIM sınıfı oluşturulur...
   
    Connection conn = null; // conn adında bağlantı sınıfından nesnesi oluşturulur ve müteakip satırlarda kullanılacağından null atanır...
    PreparedStatement pst = null; //pst adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.
    ResultSet rs = null;//pst nesnesi ile yapılan sorguların tutulabilmesi için rs adında ResultSet sınıfından bir nesne oluşturulur ve null atanır...

    public GirisEkrani() {
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        hastaGirisiKulAd = new javax.swing.JTextField();
        Password5 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        UserName3 = new javax.swing.JTextField();
        Password3 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        UserName2 = new javax.swing.JTextField();
        Password2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        UserName6 = new javax.swing.JTextField();
        Password6 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jButton11 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLayeredPane9 = new javax.swing.JLayeredPane();
        UserName7 = new javax.swing.JTextField();
        Password7 = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Anasayfa-Giriş");

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 204));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 204, 204)));
        jLayeredPane1.setOpaque(true);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLayeredPane7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        hastaGirisiKulAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastaGirisiKulAdActionPerformed(evt);
            }
        });
        hastaGirisiKulAd.setBounds(190, 30, 110, 30);
        jLayeredPane7.add(hastaGirisiKulAd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Password5.setBounds(190, 80, 110, 30);
        jLayeredPane7.add(Password5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("Parola");
        jLabel12.setBounds(70, 80, 90, 20);
        jLayeredPane7.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setText("Kullanıcı Adı");
        jLabel13.setBounds(70, 30, 90, 20);
        jLayeredPane7.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jCheckBox6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCheckBox6.setText("Parola Göster");
        jCheckBox6.setOpaque(false);
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        jCheckBox6.setBounds(330, 80, 100, 23);
        jLayeredPane7.add(jCheckBox6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton4.setText("Yeni Kayıt");
        jButton4.setPreferredSize(new java.awt.Dimension(125, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(70, 130, 140, 30);
        jLayeredPane7.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton9.setText("Giriş");
        jButton9.setPreferredSize(new java.awt.Dimension(125, 30));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.setBounds(260, 130, 150, 30);
        jLayeredPane7.add(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton10.setText("Parolayı Unuttum");
        jButton10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton10MouseMoved(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jButton10.setBounds(170, 170, 130, 30);
        jLayeredPane7.add(jButton10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Hasta Girişi", jPanel1);

        jLayeredPane5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        UserName3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        UserName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserName3ActionPerformed(evt);
            }
        });
        UserName3.setBounds(190, 30, 110, 30);
        jLayeredPane5.add(UserName3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Password3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Password3.setBounds(190, 70, 110, 30);
        jLayeredPane5.add(Password3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Parola");
        jLabel8.setBounds(90, 70, 60, 30);
        jLayeredPane5.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Kullanıcı Adı");
        jLabel9.setBounds(90, 30, 70, 30);
        jLayeredPane5.add(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jCheckBox4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCheckBox4.setText("Parola Göster");
        jCheckBox4.setOpaque(false);
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jCheckBox4.setBounds(330, 80, 100, 23);
        jLayeredPane5.add(jCheckBox4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton7.setText("Giriş");
        jButton7.setPreferredSize(new java.awt.Dimension(125, 30));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton7KeyPressed(evt);
            }
        });
        jButton7.setBounds(170, 130, 150, 30);
        jLayeredPane5.add(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Doktor Girişi", jPanel3);

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        UserName2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        UserName2.setBounds(190, 30, 110, 30);
        jLayeredPane4.add(UserName2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Password2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Password2.setBounds(190, 70, 110, 30);
        jLayeredPane4.add(Password2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Parola");
        jLabel6.setBounds(90, 70, 90, 30);
        jLayeredPane4.add(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Kullanıcı Adı");
        jLabel7.setBounds(90, 30, 90, 30);
        jLayeredPane4.add(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jCheckBox3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCheckBox3.setText("Parola Göster");
        jCheckBox3.setOpaque(false);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jCheckBox3.setBounds(330, 80, 100, 23);
        jLayeredPane4.add(jCheckBox3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton6.setText("Giriş");
        jButton6.setPreferredSize(new java.awt.Dimension(125, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(170, 130, 150, 30);
        jLayeredPane4.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hemşire Girişi", jPanel2);

        jLayeredPane8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        UserName6.setBounds(190, 30, 110, 30);
        jLayeredPane8.add(UserName6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Password6.setBounds(190, 70, 110, 30);
        jLayeredPane8.add(Password6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setText("Parola");
        jLabel14.setBounds(90, 70, 90, 30);
        jLayeredPane8.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel15.setText("Kullanıcı Adı");
        jLabel15.setBounds(90, 30, 90, 30);
        jLayeredPane8.add(jLabel15, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jCheckBox7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCheckBox7.setText("Parola Göster");
        jCheckBox7.setOpaque(false);
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        jCheckBox7.setBounds(330, 80, 100, 23);
        jLayeredPane8.add(jCheckBox7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton11.setText("Giriş");
        jButton11.setPreferredSize(new java.awt.Dimension(125, 30));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jButton11.setBounds(170, 130, 150, 30);
        jLayeredPane8.add(jButton11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eczacı Girişi", jPanel5);

        jLayeredPane9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        UserName7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        UserName7.setBounds(190, 30, 110, 30);
        jLayeredPane9.add(UserName7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Password7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Password7.setBounds(190, 70, 110, 30);
        jLayeredPane9.add(Password7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel16.setText("Parola");
        jLabel16.setBounds(90, 70, 90, 30);
        jLayeredPane9.add(jLabel16, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel17.setText("Kullanıcı Adı");
        jLabel17.setBounds(90, 30, 90, 30);
        jLayeredPane9.add(jLabel17, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jCheckBox8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jCheckBox8.setText("Parola Göster");
        jCheckBox8.setOpaque(false);
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        jCheckBox8.setBounds(330, 80, 100, 23);
        jLayeredPane9.add(jCheckBox8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton12.setText("Giriş");
        jButton12.setPreferredSize(new java.awt.Dimension(125, 30));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jButton12.setBounds(170, 130, 150, 30);
        jLayeredPane9.add(jButton12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Yönetici Girişi", jPanel4);

        jTabbedPane1.setBounds(190, 300, 520, 320);
        jLayeredPane1.add(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/secure/HastaneLogosu.png"))); // NOI18N
        jLabel1.setBounds(190, 10, 520, 290);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLayeredPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        conn = MySQLConnect.ConnectDB();// bağlantı oluşturulur...
        String Sql = "Select * from admin where admin_id =? and admin_sifre =?";

        try{
            pst=conn.prepareStatement(Sql);//yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            pst.setString(1,UserName7.getText());//sorgunun içinde soru işareti ile belirtilen ilk alan manüpile edilerek yerine UserName7 alanında bulunan değer gönderilir...
            pst.setString(2,Password7.getText());//sorgunun içinde soru işareti ile belirtilen ikinci alan manüpile edilerek yerine Password7 alanında bulunan değer gönderilir...
            rs=pst.executeQuery(); //veri tabanından dönüş(etkilenen satır) olursa rs nesnesine değeri aktarılır.

            if(rs.next()){//eğer döngü sonucunda dönen varsa sisteme giriş yapılır...
                JOptionPane.showMessageDialog(null,"Giriş Yapılıyor.Sisteme Hoşgeldiniz...");
                String gonderilenVeri = UserName7.getText();
                new Supervisor(gonderilenVeri).setVisible(true);//Supervisor paneline UserName7 de bulunan TCKN ile giriş yapılır.
                this.setVisible(false);//GirisEkranindan çıkış yapılır

            }
            else {//eğer döngü sonucunda dönen yoksa(kullanıcı adı veya parola hatalıysa) ekrana uyarı çıkar.
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Parola Hatalı. Tekrar Deneyiniz.");
            }

        }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        //PAROLA GİZLEME/GÖSTERME BUTONU İŞLEMLERİ
        if (jCheckBox8.isSelected()){
            Password7.setEchoChar((char)0);
        }
        else{
            Password7.setEchoChar('*');
        }   // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        conn = MySQLConnect.ConnectDB();// bağlantı oluşturulur...
        String Sql = "Select * from eczacilar where eczaci_id =? and eczaci_sifre =?";

        try{
            pst=conn.prepareStatement(Sql);//yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            pst.setString(1,UserName6.getText());//sorgunun içinde soru işareti ile belirtilen ilk alan manüpile edilerek yerine UserName6 alanında bulunan değer gönderilir...
            pst.setString(2,Password6.getText());//sorgunun içinde soru işareti ile belirtilen ikinci alan manüpile edilerek yerine Password6 alanında bulunan değer gönderilir...
            rs=pst.executeQuery(); //veri tabanından dönüş(etkilenen satır) olursa rs nesnesine değeri aktarılır.

            if(rs.next()){//eğer döngü sonucunda dönen varsa sisteme giriş yapılır...
                JOptionPane.showMessageDialog(null,"Giriş Yapılıyor.Sisteme Hoşgeldiniz...");
                String gonderilenVeri = UserName6.getText();
                new EczaciPaneli(gonderilenVeri).setVisible(true);//EczaiPaneline UserName6'da bulunan değerle gidilir...
                this.setVisible(false); //GirisEkranından çıkılır...

            }
            else {//eğer döngü sonucunda dönen yoksa(kullanıcı adı veya parola hatalıysa) ekrana uyarı çıkar.
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Parola Hatalı. Tekrar Deneyiniz.");
            }

        }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        //PAROLA GİZLEME/GÖSTERME BUTONU İŞLEMLERİ
        if (jCheckBox7.isSelected()){
            Password6.setEchoChar((char)0);
        }
        else{
            Password6.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        conn = MySQLConnect.ConnectDB();// bağlantı oluşturulur...
        String Sql = "Select * from hemsireler where hemsire_tc =? and hemsire_sifre =?";

        try{
            pst=conn.prepareStatement(Sql);//yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            pst.setString(1,UserName2.getText());//sorgunun içinde soru işareti ile belirtilen ilk alan manüpile edilerek yerine UserName2 alanında bulunan değer gönderilir...
            pst.setString(2,Password2.getText());//sorgunun içinde soru işareti ile belirtilen ikinci alan manüpile edilerek yerine Password2 alanında bulunan değer gönderilir...
            rs=pst.executeQuery();//veri tabanından dönüş(etkilenen satır) olursa rs nesnesine değeri aktarılır.

            if(rs.next()){//eğer döngü sonucunda dönen varsa sisteme giriş yapılır...
                JOptionPane.showMessageDialog(null,"Giriş Yapılıyor.Sisteme Hoşgeldiniz...");
                String gonderilenVeri = UserName2.getText();
                new HemsirePaneli(gonderilenVeri).setVisible(true);
                this.setVisible(false);

            }
            else {//eğer döngü sonucunda dönen yoksa(kullanıcı adı veya parola hatalıysa) ekrana uyarı çıkar.
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Parola Hatalı. Tekrar Deneyiniz.");
            }

        }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        //PAROLA GİZLEME/GÖSTERME BUTONU İŞLEMLERİ
        if (jCheckBox3.isSelected()){
            Password2.setEchoChar((char)0);
        }
        else{
            Password2.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton7KeyPressed

    }//GEN-LAST:event_jButton7KeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        conn = MySQLConnect.ConnectDB();// bağlantı oluşturulur...
        String Sql = "Select * from doktorlar where dr_tc =? and dr_sifre =?";

        try{
            pst=conn.prepareStatement(Sql); //yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            pst.setString(1,UserName3.getText()); //sorgunun içinde soru işareti ile belirtilen ilk alan manüpile edilerek yerine UserName3 alanında bulunan değer gönderilir...
            pst.setString(2,Password3.getText()); //sorgunun içinde soru işareti ile belirtilen ikinci alan manüpile edilerek yerine Password2 alanında bulunan değer gönderilir...
            rs=pst.executeQuery(); //veri tabanından dönüş(etkilenen satır) olursa rs nesnesine değeri aktarılır.

            if(rs.next()){//eğer döngü sonucunda dönen varsa sisteme giriş yapılır...
                JOptionPane.showMessageDialog(null,"Giriş Yapılıyor.Sisteme Hoşgeldiniz...");
                String gonderilenVeri = UserName3.getText();
                new DoktorPaneli(gonderilenVeri).setVisible(true);
                this.setVisible(false);

            }
            else {//eğer döngü sonucunda dönen yoksa(kullanıcı adı veya parola hatalıysa) ekrana uyarı çıkar.
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Parola Hatalı. Tekrar Deneyiniz.");
            }

        }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        //PAROLA GİZLEME/GÖSTERME BUTONU İŞLEMLERİ
        if (jCheckBox4.isSelected()){
            Password3.setEchoChar((char)0);
        }
        else{
            Password3.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void UserName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserName3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserName3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //PAROLA SIFIRLAMA İŞLEMİ
        JOptionPane.showMessageDialog(null,"Parola Sıfırlama için Yönlendiriliyorsunuz...");
        Sendcode s = new Sendcode();
        s.setVisible(true); //sendcode açılır...
        this.setVisible(false); //GirisEkrani kapatılır...
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseMoved

    }//GEN-LAST:event_jButton10MouseMoved

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        conn = MySQLConnect.ConnectDB();//bağlantı oluşturulur...
        String Sql = "Select * from hastalar where hasta_tc =? and hasta_sifre =?";

        try{
            pst=conn.prepareStatement(Sql); //yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            pst.setString(1,hastaGirisiKulAd.getText()); //sorgunun içinde soru işareti ile belirtilen ilk alan manüpile edilerek yerine hastaGirisiKulAd alanında bulunan değer gönderilir...
            pst.setString(2,Password5.getText()); //sorgunun içinde soru işareti ile belirtilen ikinci alan manüpile edilerek yerine Password5 alanında bulunan değer gönderilir...
            rs=pst.executeQuery(); //veri tabanından dönüş(etkilenen satır) olursa rs nesnesine değeri aktarılır.

            if(rs.next()){//eğer döngü sonucunda dönen varsa sisteme giriş yapılır...
                JOptionPane.showMessageDialog(null,"Giriş Yapılıyor.Sisteme Hoşgeldiniz...");
                String gonderilenVeri = hastaGirisiKulAd.getText();
                new HastaKontrolPaneli(gonderilenVeri).setVisible(true);//HastaKontrolPaneli gonderilenVeri ile açılır.
                this.setVisible(false);//GirisEkranından çıkılır...

            }
            else {//eğer döngü sonucunda dönen yoksa(kullanıcı adı veya parola hatalıysa) ekrana uyarı çıkar.
                JOptionPane.showMessageDialog(null, "Kullanıcı Adı veya Parola Hatalı. Tekrar Deneyiniz.");
            }

        }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        JOptionPane.showMessageDialog(null,"Yeni Kayıt İçin Yönlendiriliyorsunuz...");
        KayitOl k = new KayitOl();
        k.setVisible(true);//KayitOl açılır...
        this.setVisible(false);//GirisEkranı kapatılır...
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        //PAROLA SIFIRLAMA İŞLEMİ
        if (jCheckBox6.isSelected()){
            Password5.setEchoChar((char)0);
        }
        else{
            Password5.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void hastaGirisiKulAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastaGirisiKulAdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hastaGirisiKulAdActionPerformed

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password2;
    private javax.swing.JPasswordField Password3;
    private javax.swing.JPasswordField Password5;
    private javax.swing.JPasswordField Password6;
    private javax.swing.JPasswordField Password7;
    private javax.swing.JTextField UserName2;
    private javax.swing.JTextField UserName3;
    private javax.swing.JTextField UserName6;
    private javax.swing.JTextField UserName7;
    private javax.swing.JTextField hastaGirisiKulAd;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JLayeredPane jLayeredPane9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
