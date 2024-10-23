// Crédit : Paul Delavictoire
class Challenges2 extends Program {
    String printPNJ(String[] titres, int[] valeurs) {
        String rep = titres[0] + "\n" + titres[1];
        int ml = Math.max(Math.max(length(titres[1]), length(titres[2])), length(titres[3]));
        for (int i = 0; i < ml - length(titres[1]); i++) {
            rep += " ";
        }
        rep += " (" + valeurs[1] + ")\n" + titres[2];
        for (int i = 0; i < ml - length(titres[2]); i++) {
            rep += " ";
        }
        rep += " (" + valeurs[2] + ")\n" + titres[3];
        for (int i = 0; i < ml - length(titres[3]); i++) {
            rep += " ";
        }
        rep += " (" + valeurs[3] + ")\n";
        return rep;
    }
    
    void testPrintPNJTableaux() {
        assertEquals("Frodon\nForce   (4)\nAgilité (9)\nSagesse (9)\n", printPNJ(new String[]{"Frodon", "Force", "Agilité", "Sagesse"}, new int[]{0, 4, 9, 9}));
    }
}
