class VisualisateurCaracteristiques extends Program {
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

    String visualiserCaracteristique(String nom, int valeur, int max) {
        return genererBarre(valeur, max) + " " + nom;
    }

    void testVisualiserCaracteristique() {
        assertEquals("◼◼◼◻◻◻◻◻◻◻ Force", visualiserCaracteristique("Force", 3, 10));
        assertEquals("◼◼◼◻◻◻◻◻◻◻ Agilité", visualiserCaracteristique("Agilité", 3, 10));
        assertEquals("◼◼◼◼◼◼◼◼◼◼ Sagesse", visualiserCaracteristique("Sagesse", 10, 10));
    }
    
    void algorithm() {
        testVisualiserCaracteristique();
    }
}