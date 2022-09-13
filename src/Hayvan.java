public class Hayvan {


    private String name;
    private int boy;
    private int kilo;
    private int beyin;

    public Hayvan (String name, int boy, int kilo, int beyin) {

        this.name = name;
        this.boy = boy;
        this.kilo = kilo;
        this.beyin = beyin;


    }
    public void harekete_gec(int speed) {

        System.out.println("Bura calisti " + speed + " ile hareket ediyor...");

    }

    public void yemek_ye() {

        System.out.println("Yemek yeniyor... ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBeyin() {
        return beyin;
    }

    public void setBeyin(int beyin) {
        this.beyin = beyin;
    }
}
