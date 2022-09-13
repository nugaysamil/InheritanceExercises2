public class Köpek extends Hayvan{

     private int bacak_sayisi;

     public Köpek(String name, int boy, int kilo, int beyin,int bacak_sayisi) {

        super(name,boy,kilo,beyin);


        this.bacak_sayisi = bacak_sayisi;

    }

    public void harekete_gec(int speed) {


        System.out.println("Harekete geçiyor... " + speed + " hızıyla");
    }
    public void kos(int speed) {

        System.out.println("Köpek koşuyor....");

        this.harekete_gec(speed);

    }



}
