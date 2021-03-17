
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class HastaKontrolPaneli extends javax.swing.JFrame { //javax.swing.JFrame sınıfından DoktorEkle adında bir KALITIM sınıfı oluşturulur...

    Connection conn = null; // conn adında bağlantı sınıfından nesnesi oluşturulur ve müteakip satırlarda kullanılacağından null atanır...
    PreparedStatement pst = null; //pst adında PreparedStatement sınıfından bir nesne oluşturulur, null atanır, veri tabanı işlemlerinde pst nesnesi kullanılmıştır.
    ResultSet rs = null;//pst nesnesi ile yapılan sorguların tutulabilmesi için rs adında ResultSet sınıfından bir nesne oluşturulur ve null atanır...
    Color renk = new Color(100, 1, 100);
        
    String hastaTCKN ;
    
    public HastaKontrolPaneli() {
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
    }
    
    public HastaKontrolPaneli(String gelenVeri) //yönetici/tıbbi sekreter id'si ile bir nesne oluşturmak maksadıyla overloading yapılır ve ikinci constructor oluşturulur.
    {
        initComponents();//arayüz birleşenleri başlatılır(ekranda gösterilir)...
        this.hastaTCKN = gelenVeri;//constructor'a gelenVeri ile hastaTCKN sınıf içerisinde kullanılmak için eşitlenir
        jTextField1.setText(gelenVeri);//jTextField1 alanına hastanın TC kimlik Numarası yazdırılır...

        conn = MySQLConnect.ConnectDB();//bağlantı oluşturulur.
        
        //çekilecek verilerin sql sorguları oluşturulur.
        String sql = "Select hasta_ad from hastalar where hasta_tc = '"+gelenVeri+"'";
        String sql1 = "Select hasta_soyad from hastalar where hasta_tc = '"+gelenVeri+"'";
        String sql2 = "Select hasta_dogum from hastalar where hasta_tc = '"+gelenVeri+"'";
        String sql3 = "Select hasta_dyeri from hastalar where hasta_tc = '"+gelenVeri+"'";
        String sql4 = "Select hasta_cins from hastalar where hasta_tc = '"+gelenVeri+"'";
        String sql5 = "Select hasta_tel from hastalar where hasta_tc = '"+gelenVeri+"'";
        String sql6 = "Select hasta_oda from hastalar where hasta_tc = '"+gelenVeri+"'";
        String sql7 = "Select hasta_yatak from hastalar where hasta_tc = '"+gelenVeri+"'";

        try{//exception yakalamak ve programın çalışmaya temini için try catch bloklarını kullandık.Uygun hatanın ekrana yazdırılabilmesi için
            
            pst=conn.prepareStatement(sql); //yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            rs=pst.executeQuery(); //veri tabanından dönüş(etkilenen satır) olursa rs nesnesine değeri aktarılır.
            
            if(rs.next()){//veri tabanında sorgunun karşılığı varsa metin alanını doldurur.
                jTextField2.setText(rs.getString("hasta_ad"));
            }
            
            pst=conn.prepareStatement(sql1);
            rs=pst.executeQuery();

            if(rs.next()){//veri tabanında sorgunun karşılığı varsa metin alanını doldurur.
                jTextField12.setText(rs.getString("hasta_soyad"));
            }     
            pst=conn.prepareStatement(sql2);
            rs=pst.executeQuery();
            
            if(rs.next()){//veri tabanında sorgunun karşılığı varsa metin alanını doldurur.
                jTextField13.setText(rs.getString("hasta_dogum"));
            }
            pst=conn.prepareStatement(sql3);
            rs=pst.executeQuery();
            
            if(rs.next()){//veri tabanında sorgunun karşılığı varsa metin alanını doldurur.
                jTextField3.setText(rs.getString("hasta_dyeri"));
            }
            pst=conn.prepareStatement(sql4);
            rs=pst.executeQuery();
            
            if(rs.next()){//veri tabanında sorgunun karşılığı varsa metin alanını doldurur.
                jTextField4.setText(rs.getString("hasta_cins"));
            }
            pst=conn.prepareStatement(sql5);
            rs=pst.executeQuery();

            if(rs.next()){//veri tabanında sorgunun karşılığı varsa metin alanını doldurur.
                jTextField5.setText(rs.getString("hasta_tel"));
            }
            pst=conn.prepareStatement(sql6);
            rs=pst.executeQuery();

            if(rs.next()){//veri tabanında sorgunun karşılığı varsa metin alanını doldurur.
                jTextField6.setText(rs.getString("hasta_oda"));
            }
            pst=conn.prepareStatement(sql7);
            rs=pst.executeQuery();

            if(rs.next()){//veri tabanında sorgunun karşılığı varsa metin alanını doldurur.
                jTextField7.setText(rs.getString("hasta_yatak"));
            }
            
        }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
        } 

    } 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();

        jTextField14.setText("jTextField14");

        jTextField15.setText("jTextField15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hasta Kontrol Paneli");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("T.C.Kimlik No : ");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jTextField1.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        jTextField1.setSelectionColor(new java.awt.Color(240, 240, 240));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Ad Soyad : ");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Doğum Yeri / Tarihi : ");

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField3.setBorder(null);
        jTextField3.setOpaque(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Cinsiyet :");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField4.setBorder(null);
        jTextField4.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Telefon No :");

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField5.setBorder(null);
        jTextField5.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Oda No : ");

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField6.setBorder(null);
        jTextField6.setOpaque(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Yatak No : ");

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField7.setBorder(null);
        jTextField7.setOpaque(false);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField12.setBorder(null);
        jTextField12.setOpaque(false);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField13.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addComponent(jSeparator5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jTextField13)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.setBounds(30, 40, 280, 230);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton2.setText("Giriş Ekranına Dön");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(210, 340, 120, 70);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton3.setText("Randevu \nGeçmişi");
        jButton3.setOpaque(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(20, 340, 80, 70);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel8.setText("Çıkış");
        jLabel8.setBounds(250, 420, 30, 20);
        jLayeredPane1.add(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton4.setText("Bilgilerimi Güncelle");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(120, 340, 80, 70);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("Klinik : ");
        jLabel11.setBounds(420, 50, 70, 20);
        jLayeredPane1.add(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Klinik Seçiniz", "Üroloji", "Göz", "Dahiliye", "Cildiye", "Kbb", "İntaniye", "Radyoloji", "Kardiyoloji" }));
        jComboBox1.setOpaque(false);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1İtemStateChanged(evt);
            }
        });
        jComboBox1.setBounds(520, 50, 160, 20);
        jLayeredPane1.add(jComboBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("Randevu Saati : ");
        jLabel12.setBounds(420, 170, 90, 20);
        jLayeredPane1.add(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doktor Seçiniz...", "Raciye Tutlu", "Safiyet Gemici", "Sabahattin Coşanay", "Rümeysa Kızıldağ", "Pekal Karadoğan", "Ayanoğlu Çakan", "Berzali Özer", "Ünan Türkmen", "Balamir Kölük", "Kutlar Çetinkaya ", "Ecer Hacıevliyagil", "Bengü Erkon", "Nemika Filiz", "Bayer Gözübüyük", "Yaltır Kaynarca", " " }));
        jComboBox2.setOpaque(false);
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2İtemStateChanged(evt);
            }
        });
        jComboBox2.setBounds(520, 90, 160, 20);
        jLayeredPane1.add(jComboBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setText("Doktor  :");
        jLabel13.setBounds(420, 90, 70, 20);
        jLayeredPane1.add(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jDateChooser1.setOpaque(false);
        jDateChooser1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jDateChooser1İnputMethodTextChanged(evt);
            }
        });
        jDateChooser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser1KeyPressed(evt);
            }
        });
        jDateChooser1.setBounds(520, 120, 180, 30);
        jLayeredPane1.add(jDateChooser1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel14.setText("Randevu Tarihi : ");
        jLabel14.setBounds(420, 130, 90, 20);
        jLayeredPane1.add(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton5.setText("Uygun Saatleri Göster / Yenile");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(520, 160, 190, 40);
        jLayeredPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator6.setBounds(390, 380, 370, 10);
        jLayeredPane1.add(jSeparator6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel3.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 255));
        jLabel15.setText("Seçilen Saat :");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 255));
        jLabel16.setText("Seçilen Klinik :");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 255));
        jLabel17.setText("Seçilen Doktor :");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 255));
        jLabel18.setText("Seçilen Tarih :");

        jButton31.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton31.setText("Onayla");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jTextField8.setBackground(new java.awt.Color(240, 240, 240));
        jTextField8.setBorder(null);
        jTextField8.setOpaque(false);

        jTextField9.setBackground(new java.awt.Color(240, 240, 240));
        jTextField9.setBorder(null);
        jTextField9.setOpaque(false);

        jTextField10.setBackground(new java.awt.Color(240, 240, 240));
        jTextField10.setBorder(null);
        jTextField10.setOpaque(false);

        jTextField11.setBackground(new java.awt.Color(240, 240, 240));
        jTextField11.setBorder(null);
        jTextField11.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButton31)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBounds(390, 400, 350, 140);
        jLayeredPane1.add(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel4.setOpaque(false);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Bilgilerimi");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Güncelle");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.setBounds(120, 420, 80, 50);
        jLayeredPane1.add(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel5.setOpaque(false);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Randevularımı");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Göster");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.setBounds(20, 420, 80, 50);
        jLayeredPane1.add(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanel2.setEnabled(false);
        jPanel2.setOpaque(false);

        jButton7.setBackground(new java.awt.Color(51, 255, 51));
        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton7.setText("09:15");
        jButton7.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jPanel2, org.jdesktop.beansbinding.ELProperty.create("${enabled}"), jButton7, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(51, 255, 51));
        jButton9.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton9.setText("09:45");
        jButton9.setEnabled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(51, 255, 51));
        jButton10.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton10.setText("10:00");
        jButton10.setEnabled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(51, 255, 51));
        jButton11.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton11.setText("10:15");
        jButton11.setEnabled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(51, 255, 51));
        jButton12.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton12.setText("10:30");
        jButton12.setEnabled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(51, 255, 51));
        jButton13.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton13.setText("10:45");
        jButton13.setEnabled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(51, 255, 51));
        jButton14.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton14.setText("11:00");
        jButton14.setEnabled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(51, 255, 51));
        jButton15.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton15.setText("11:15");
        jButton15.setEnabled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(51, 255, 51));
        jButton16.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton16.setText("11:30");
        jButton16.setEnabled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(51, 255, 51));
        jButton17.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton17.setText("11:45");
        jButton17.setEnabled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(51, 255, 51));
        jButton18.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton18.setText("12:00");
        jButton18.setEnabled(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(51, 255, 51));
        jButton19.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton19.setText("13:00");
        jButton19.setEnabled(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(51, 255, 51));
        jButton20.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton20.setText("13:30");
        jButton20.setEnabled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(51, 255, 51));
        jButton21.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton21.setText("14:00");
        jButton21.setEnabled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(51, 255, 51));
        jButton22.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton22.setText("14:15");
        jButton22.setEnabled(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(51, 255, 51));
        jButton23.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton23.setText("14:30");
        jButton23.setEnabled(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(51, 255, 51));
        jButton24.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton24.setText("14:45");
        jButton24.setEnabled(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(51, 255, 51));
        jButton25.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton25.setText("15:00");
        jButton25.setEnabled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setBackground(new java.awt.Color(51, 255, 51));
        jButton26.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton26.setText("15:15");
        jButton26.setEnabled(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(51, 255, 51));
        jButton27.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton27.setText("15:30");
        jButton27.setEnabled(false);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(51, 255, 51));
        jButton28.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton28.setText("16:00");
        jButton28.setEnabled(false);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(51, 255, 51));
        jButton29.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton29.setText("16:15");
        jButton29.setEnabled(false);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(51, 255, 51));
        jButton30.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton30.setText("16:30");
        jButton30.setEnabled(false);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(51, 255, 51));
        jButton32.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton32.setText("09:00");
        jButton32.setEnabled(false);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(51, 255, 51));
        jButton33.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jButton33.setText("09:30");
        jButton33.setEnabled(false);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton32)
                    .addComponent(jButton33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jButton22)
                    .addComponent(jButton23)
                    .addComponent(jButton24)
                    .addComponent(jButton25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton26)
                    .addComponent(jButton27)
                    .addComponent(jButton28)
                    .addComponent(jButton29)
                    .addComponent(jButton30))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBounds(380, 200, 370, 180);
        jLayeredPane1.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        jButton33.setEnabled(false);//button kapatılır.
        String saat = jButton33.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        jButton32.setEnabled(false);//button kapatılır.
        String saat = jButton32.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jButton30.setEnabled(false);//button kapatılır.
        String saat = jButton30.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        jButton29.setEnabled(false);//button kapatılır.
        String saat = jButton29.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jButton28.setEnabled(false);//button kapatılır.
        String saat = jButton28.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        jButton27.setEnabled(false);//button kapatılır.
        String saat = jButton27.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jButton26.setEnabled(false);//button kapatılır.
        String saat = jButton26.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        jButton25.setEnabled(false);//button kapatılır.
        String saat = jButton25.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jButton24.setEnabled(false);//button kapatılır.
        String saat = jButton24.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        jButton23.setEnabled(false);//button kapatılır.
        String saat = jButton23.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jButton22.setEnabled(false);//button kapatılır.
        String saat = jButton22.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jButton21.setEnabled(false);//button kapatılır.
        String saat = jButton21.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jButton20.setEnabled(false);//button kapatılır.
        String saat = jButton20.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jButton19.setEnabled(false);//button kapatılır.
        String saat = jButton19.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jButton18.setEnabled(false);//button kapatılır.
        String saat = jButton18.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jButton17.setEnabled(false);//button kapatılır.
        String saat = jButton17.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jButton16.setEnabled(false);//button kapatılır.
        String saat = jButton16.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jButton15.setEnabled(false);//button kapatılır.
        String saat = jButton15.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jButton14.setEnabled(false);//button kapatılır.
        String saat = jButton14.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jButton13.setEnabled(false);//button kapatılır.
        String saat = jButton13.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jButton12.setEnabled(false);//button kapatılır.
        String saat = jButton12.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton11.setEnabled(false);//button kapatılır.
        String saat = jButton11.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jButton10.setEnabled(false);//button kapatılır.
        String saat = jButton10.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setEnabled(false);//button kapatılır.
        String saat = jButton9.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setEnabled(false);//button kapatılır.
        String saat = jButton7.getText();//buttonun saat değeri String olarak alınır.
        jTextField10.setText(saat);//metin alanına button'un saat değeri yazılır.
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed

        conn = MySQLConnect.ConnectDB();//bağlantı oluşturulur.
        
        String sql = "insert into randevular (randevu_tarihi , randevu_saati, dr_id, hasta_id, klinik_id) \n" +
        "values (?,?,(Select dr_id from doktorlar where dr_ad = ? and dr_soyad = ?),(Select hasta_id from hastalar where hasta_tc = ?),(Select klinik_id from klinikler where klinik_ismi = ?))";
        
        String[] bol = jTextField8.getText().split(" ");//combobox ile seçilen doktor adı soyadı boşluktan bölünerek bol dizisinde tutulur.
        
        try{//exception yakalamak ve programın çalışmaya temini için try catch bloklarını kullandık.Uygun hatanın ekrana yazdırılabilmesi için
            pst=conn.prepareStatement(sql);//yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            pst.setString(1, jTextField11.getText());//sorgudaki soru işareti ile belirtilen ilk alana jTextField11'de bulunan değeri gönderir.
            pst.setString(2, jTextField10.getText());//sorgudaki soru işareti ile belirtilen ikinci alana jTextField10'da bulunan değeri gönderir.
            pst.setString(3, bol[0]);//sorgudaki soru işareti ile belirtilen üçüncü alana bol[0]'da bulunan değeri gönderir.
            pst.setString(4, bol[1]);//sorgudaki soru işareti ile belirtilen dördüncü alana bol[1]'da bulunan değeri gönderir.
            pst.setString(5, hastaTCKN);//sorgudaki soru işareti ile belirtilen beşinci alana hastaTCKN değişkeninin değerini gönderir.
            pst.setString(6, jTextField9.getText());//sorgudaki soru işareti ile belirtilen altıncı alana jTextField9'da bulunan değeri gönderir.

            boolean donut = pst.execute(); // veri tabanından dönüş(etkilenen satır) olursa donut değişkeni true değeri alır.

            if(donut=true)
            {
                JOptionPane.showMessageDialog(null, "Randevunuz tamamlanmıştır.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Tekrar Randevu Alınız.");
            }
            
        }catch(Exception e){//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //UYGUN SAATLERİ GÖSTERME İŞLEMİ
        
        String veri = ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
        jTextField11.setText(veri);

        jTextField10.setText("");
        jButton7.setEnabled(true);
        jButton32.setEnabled(true);
        jButton33.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        jButton19.setEnabled(true);
        jButton20.setEnabled(true);
        jButton21.setEnabled(true);
        jButton22.setEnabled(true);
        jButton23.setEnabled(true);
        jButton24.setEnabled(true);
        jButton25.setEnabled(true);
        jButton26.setEnabled(true);
        jButton27.setEnabled(true);
        jButton28.setEnabled(true);
        jButton29.setEnabled(true);
        jButton30.setEnabled(true);

        conn = MySQLConnect.ConnectDB();//bağlantı oluşturulur.
        
        String Sql = "Select randevu_saati from randevular where randevu_tarihi = ?";
        String date= ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText(); //date değişkenine jDateChooser içinde seçilen tarih String olarak aktarılır...

        try{//exception yakalamak ve programın çalışmaya temini için try catch bloklarını kullandık.Uygun hatanın ekrana yazdırılabilmesi için
            pst = conn.prepareStatement(Sql); //yazdığımız sorgu conn nesnesi ile veri tabanına gönderilerek pst nesnesine döndürülür.
            pst.setString(1, date); //sorgudaki soru işareti ile belirtilen ilk alana date'de bulunan değeri gönderir.
            rs = pst.executeQuery(); //veri tabanından dönüş(etkilenen satır) olursa rs nesnesine değeri aktarılır.

            while(rs.next())//sorgudan sonuç döndükçe döngü çalışır.
            {
                //Saat bilgisi hangi button ile eşit ise o button pasif duruma geçer.
                
                if(jButton10.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton10.setEnabled(false);
                }

                if(jButton32.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton32.setEnabled(false);
                }

                if(jButton7.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton7.setEnabled(false);
                }

                if(jButton33.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton33.setEnabled(false);
                }

                if(jButton9.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton9.setEnabled(false);
                }

                if(jButton10.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton10.setEnabled(false);
                }

                if(jButton11.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton11.setEnabled(false);
                }

                if(jButton12.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton12.setEnabled(false);
                }

                if(jButton13.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton13.setEnabled(false);
                }

                if(jButton14.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton14.setEnabled(false);
                }

                if(jButton15.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton15.setEnabled(false);
                }

                if(jButton16.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton16.setEnabled(false);
                }

                if(jButton17.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton17.setEnabled(false);
                }

                if(jButton18.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton18.setEnabled(false);
                }

                if(jButton19.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton19.setEnabled(false);
                }

                if(jButton20.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton20.setEnabled(false);
                }

                if(jButton21.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton21.setEnabled(false);
                }
                if(jButton22.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton22.setEnabled(false);
                }
                if(jButton23.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton23.setEnabled(false);
                }
                if(jButton24.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton24.setEnabled(false);
                }
                if(jButton25.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton25.setEnabled(false);
                }
                if(jButton26.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton26.setEnabled(false);
                }
                if(jButton27.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton27.setEnabled(false);
                }
                if(jButton28.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton28.setEnabled(false);
                }
                if(jButton29.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton29.setEnabled(false);
                }
                if(jButton30.getText().equals(rs.getNString("randevu_saati")))
                {
                    jButton30.setEnabled(false);
                }
            }
        }
        catch(Exception e)//hata olşursa yakalanarak ekrana uyarı mesajı gönderilir ve programın çalışmaya devam etmesi temin edilir.
        {

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jDateChooser1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser1KeyPressed

    }//GEN-LAST:event_jDateChooser1KeyPressed

    private void jDateChooser1İnputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jDateChooser1İnputMethodTextChanged

    }//GEN-LAST:event_jDateChooser1İnputMethodTextChanged

    private void jComboBox2İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2İtemStateChanged
        String veri = jComboBox2.getSelectedItem().toString();
        jTextField8.setText(veri);
    }//GEN-LAST:event_jComboBox2İtemStateChanged

    private void jComboBox1İtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1İtemStateChanged
        String veri = jComboBox1.getSelectedItem().toString();
        jTextField9.setText(veri);
    }//GEN-LAST:event_jComboBox1İtemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new HastaBilgilerimiGuncelle(hastaTCKN).setVisible(true);//HastaBilgilerimiGuncelle hastaTCKN ile açılır.
        this.setVisible(false);//HastaKontrolPaneli kapatılır.
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new RandevuGecmisi(hastaTCKN).setVisible(true);//RandevuGecmisi hastaTCKN ile açılır.
        this.setVisible(false);//HastaKontrolPaneli kapatılır.
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new GirisEkrani().setVisible(true);//GirisEkrani açılır.
        this.setVisible(false);//HastaKontrolPaneli kapatılır.
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jTextField1.setText(hastaTCKN);
    }//GEN-LAST:event_jTextField1ActionPerformed
 
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
            java.util.logging.Logger.getLogger(HastaKontrolPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HastaKontrolPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HastaKontrolPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HastaKontrolPaneli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastaKontrolPaneli().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    
}
