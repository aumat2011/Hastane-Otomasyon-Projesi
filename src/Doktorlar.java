/**
 *
 * @author aumat
 */
public class Doktorlar extends Kisiler{

    Doktorlar(String TCKN) {
        super.setTCKN(TCKN);
    }

    @Override
    public void receteGoruntule() {
        ReceteGoruntule myReceteGoruntule = new ReceteGoruntule(super.getTCKN()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void receteYaz() {
       ReceteYaz myReceteYaz = new ReceteYaz(getTCKN()); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/**
 *
 * @author aumat
 */
class Main
{
   public static void main(String[] args) {
        
       System.out.println("Debug çalışıyor");
       String TCKN = "568 880 01 02";
       Doktorlar myDoktorlar = new Doktorlar(TCKN);
       myDoktorlar.receteGoruntule();
    } 
}
