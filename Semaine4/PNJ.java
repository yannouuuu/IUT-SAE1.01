// Crédit : Valentin Licour
class PNJ extends Program {
    String genererBarre(int black, int white) {
        String accu = "";
        for (int i = 0; i < black; i++) {
            accu += "◼";
        }
        for (int i = black; i < white; i++) {
            accu += "◻";
        }
        return accu;
    }
    
    String visualiserCaracteristique(String nom, int valeur, int max){
        return genererBarre(valeur, max) + " " + nom; 
    }

    String getChamps(String lignePNJ, int indice){
        int cpt = 0, id = 0;
        while (cpt < indice){
            if (charAt(lignePNJ, id) == ','){
                cpt++;
            }
            id++;
        }
        int debut = id;
        while (cpt < indice + 1 && id < length(lignePNJ)){
            if (charAt(lignePNJ, id) == ','){
                cpt++;
            }
            id++;
        }
        if (id == length(lignePNJ)){
            id++;
        }
        return substring(lignePNJ, debut, id-1);
    }

    void algo(String constante) {
        println(getChamps(constante, 0));
        for (int i = 1; i <= 5; i += 2){
            println(visualiserCaracteristique(getChamps(constante, i), stringToInt(getChamps(constante, i+1)), 10));
        }
        println();
    }
    
    void _testVisualiserCaracteristique() {
        assertEquals("◼◼◼◻◻◻◻◻◻◻ Force", visualiserCaracteristique("Force", 3, 10));
        assertEquals("◼◼◼◻◻◻◻◻◻◻ Agilité", visualiserCaracteristique("Agilité", 3, 10));
        assertEquals("◼◼◼◼◼◼◼◼◼◼ Sagesse", visualiserCaracteristique("Sagesse", 10, 10));
    }
    
    void _testGenererBarre() {
        assertEquals("◻◻◻◻◻◻◻◻◻◻", genererBarre(0, 10));
        assertEquals("◼◼◼◻◻◻◻◻◻◻", genererBarre(3, 10));
        assertEquals("◼◼◼◼◼◼◼◼◼◼", genererBarre(10, 10));
    }
    
    void algorithm(){
        algo("Frodon,Force,4,Agilité,9,Sagesse,9");
        algo("Z6PO,Force,1,Agilité,1,Langues,10");
        algo("Beetlejuice,Magie,6,Malice,10,Sarcasme,10");
    }
    
}