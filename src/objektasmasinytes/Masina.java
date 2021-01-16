package objektasmasinytes;

public class Masina {
    private String pav;
    private int maxGreitis;
    private int kelias;
    private int greitis;
    
    public Masina(String pav, int maxGreitis) {
        this.pav = pav;
        this.maxGreitis  = maxGreitis;
        this.kelias = 0;
        this.greitis = 0;
    }
    
    public void vaziok(int kiek) {
        if (kiek < 0) {
           this.greitis = 0;
        }
        this.greitis += kiek;
        this.kelias += this.greitis;
    }
    
    public void stabdyk(int kiek) {
        if (kiek < 0) {
           return;
        }
        this.greitis -= kiek;
    }
    
    public void gazok(int kiek) {
        if(kiek > this.maxGreitis) {
           this.greitis += this.maxGreitis;
        }
    }
    
    public int getGreitis() {
        return this.greitis;
    }
    
    public int setKelias(int kelias) {
        return this.kelias = kelias;
    }
    
    public int getKelias() {
        return this.kelias;
}
    
    /*
    void vaziok()
    void gazok(int kiek)
    void stabdik(int kiek)
    
    Jei sportine masina
    50% kad pasikeis spoilerio pozicija
    
    30% stabdys, nuo 1 iki 5
    50% gazuos, nuo 1 iki 10
    20% nekeis greicio
    
    
    sukurti klase
    SportineMasina
    
    gazuok() jei spoileris nuleistas - gazuoja 2x greiciau
    gazuok() jei spoileris pakeltas - gazuoja (int kiek) kaip ir buvo nurosyta ir paprastiems masinoms
    
    stabdyk() jei spoileris pakeltas - stabdo 2x greiciau, jeigu ne, stabdo kaip kiti
    
    turi spoileris - > true - pakeltas, false - nuleistas
    */
    
    // fromclass
    /*
    void gazuok(int kiek)
    void stabdyk(int kiek)
    void vaziuok() (neigiamas skaius negali buti, jeigu gazot reikia daugiau negu maxGreitis, tai daugiau maxGreicio nevazios)

    Jei sportine masina
    50% kad pasikeis spoilerio pozicija


    30% stabdys 1-5
    50% gazuos 1-10
    20% nekeis greicio


    SportineMasina

    gazuok() jei spoileris nuleistas - gazuoja 2x greiciau
    stabdyk() jei spoileris pakeltas - stabdo 2x greiciau

    spoileris true - pakeltas, false - nuleistas
    */
    
    
}
