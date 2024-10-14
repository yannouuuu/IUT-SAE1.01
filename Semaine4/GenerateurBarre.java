class GenerateurBarre extends Program {
    String genererBarre(int valeur, int maximum) {
        String barre = "";
        for (int i = 0; i < valeur; i++) {
            barre += "◼";
        }
        for (int i = valeur; i < maximum; i++) {
            barre += "◻";
        }
        return barre;
    }
    
    void testGenererBarre() {
        assertEquals("◻◻◻◻◻◻◻◻◻◻", genererBarre(0, 10));
        assertEquals("◼◼◼◻◻◻◻◻◻◻", genererBarre(3, 10));
        assertEquals("◼◼◼◼◼◼◼◼◼◼", genererBarre(10, 10));
    }
    
    void _algorithm() {
        testGenererBarre();
    }
}