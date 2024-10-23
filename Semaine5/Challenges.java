// Crédit : Paul Delavictoire
class Challenges extends Program{    
    // Fonctionnalité 1 
    String printPNJ(String str1, int val1, String str2, int val2, String str3, int val3){
        return str1+" ("+val1+")\n"+str2+" ("+val2+")\n"+str3+" ("+val3+")\n";
    }
    // Fonctionnalité 2 
    String printPNJ(String[] titres, int[] valeurs){
        return titres[0]+"\n"+titres[1]+" ("+valeurs[1]+")\n"+titres[2]+" ("+valeurs[2]+")\n"+titres[3]+" ("+valeurs[3]+")\n";
    }
    // Fonctionnalité 3 
    String toString(boolean[] champs){
        String rep = "";
        for (int i = 0; i < length(champs); i++){
            if (champs[i]){
                rep += 'B';
            } else {
                rep += '.';
            }
        }
        return rep;
    }
    
    void println(boolean[] champs){
        println(toString(champs));
    }
    
    boolean[] generer(int nb_case, int nb_bombe){
        boolean[] tab = new boolean[nb_case];
        double rand;
        int id;
        for (int i = 0; i < nb_bombe; i++){
            rand = random()*nb_case;
            id = (int) rand;
            if (!tab[id]){
                tab[id]=true;
            } else{
                i--;
            }
        }
        return tab;
    }
    
    void algorithm(){
        print("Nombre de cases : ");
        int cases=readInt();
        print("Nombre de bombes : ");
        int bombes=readInt();
        println(generer(cases,bombes));
    }

    
    void testPrintPNJ() {
        assertEquals("a (10)\naaa (7)\naa (8)\n", printPNJ("a",10,"aaa",7,"aa", 8));
    }
    
    void testPrintPNJTableaux() {
        assertEquals("Frodon\nForce (4)\nAgilité (9)\nSagesse (9)\n", printPNJ(new
       String[]{"Frodon", "Force", "Agilité", "Sagesse"}, new int[]{0,4,9,9})) ;
    }
}