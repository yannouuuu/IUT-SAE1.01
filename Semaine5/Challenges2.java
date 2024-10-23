// Crédit : Paul Delavictoire
class Challenges2 extends Program {
    String printPNJ(String[] titres, int[] valeurs){
        return titres[0]+"\n"+titres[1]+" ("+valeurs[1]+")\n"+titres[2]+" ("+valeurs[2]+")\n"+titres[3]+" ("+valeurs[3]+")\n";
    }
    
    void testPrintPNJTableaux() {
        assertEquals("Frodon\nForce (4)\nAgilité (9)\nSagesse (9)\n", printPNJ(new
       String[]{"Frodon", "Force", "Agilité", "Sagesse"}, new int[]{0,4,9,9})) ;
    }
}
