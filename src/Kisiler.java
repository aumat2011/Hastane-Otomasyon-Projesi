
import com.sun.org.apache.xml.internal.security.Init;

class Kisiler {

    
    private String ad;
    private String soyad;
    private String dogumTarihi;
    private String TCKN;
    
    public Kisiler() {
    }
    
     public Kisiler(String TCKN) {
         this.TCKN = TCKN;
    }
    
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getTCKN() {
        return TCKN;
    }

    public void setTCKN(String TCKN) {
        this.TCKN = TCKN;
    }
    
    public void receteGoruntule()
    {
        ReceteGoruntule myReceteGoruntule = new ReceteGoruntule(getTCKN()); 
    }
    
    public void receteYaz()
    {
        ReceteYaz myReceteYaz = new ReceteYaz(getTCKN());
    }
    
   
}




