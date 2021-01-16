package objektasmasinytes;

public class ObjektasMasinytes {

    public static void main(String[] args) {
        Masina[] race = {
            new Masina("Pirma", 140),
            new Masina("Antra", 160),
            new Masina("Trecia", 180),
            new Masina("Ketvirta", 180),
            new Masina("Penkta", 180),
            new Masina("Sesta", 220),
            new Masina("Septinta", 180),
            new Masina("Astunta", 160),
        };
        
//        int[] masinos = new int[8];
        int interm = 100;
        boolean doRace = true;
        
        while(doRace) {
            // kiekvrina masina pavaziavo po xKM
            for (int i = 0; i < race.length; i++) {
                race[i].vaziok((int) (Math.random() * 10 + 1));
            }
            boolean printInterm = false;
            int intermWinner = 0;
            int intermWinnerKm = 0;
            for(int i = 0; i < race.length; i++) {
                if(race[i].getKelias() > intermWinnerKm) {
                    intermWinner = i + 1;
                    intermWinnerKm = race[i].getKelias();
                }
                if(race[i].getKelias() >= interm) {
                    printInterm = true;
                    interm += 100;
                }
            }
            if(printInterm) {
                for(int i = 0; i < race.length; i++) {
                    System.out.print(race[i].getKelias() + "\t");
                }
                System.out.println();
                System.out.println("Pirmauja: " + intermWinner + ", nuvaziavo: " + intermWinnerKm);
            }
            for(int i = 0; i < race.length; i++) {
            // jeigu bent viena masina pasiekie 1000km
                if(race[i].getKelias() >= 1000) {
                    doRace = false;
                    break;
                }
            }
        }
        
        // rusiavimas
//        for(int i = 0; i < race.length; i++) {
//            for (int j = i+1; j < race.length; j++) {
//                if(race[i].getKelias() < race[j].getKelias()) {
//                    int temp = race[i].getKelias();
//                    race[i] = race[j];
//                    race[j].getKelias() = temp;
//                }
//            }
//        }
        /*
        // spausdinimas masyvo
        for(int i = 0; i < race.length; i++) {
            System.out.print(race[i] + " ");
        }
        */
        
}
    
}
