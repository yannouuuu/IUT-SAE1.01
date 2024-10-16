// Crédit : Valentin Licour
class PNJ2 extends Program {
    void _testVisualiserCaracteristique() {
        assertEquals("◼◼◼◻◻◻◻◻◻◻ Force", visualiserCaracteristique("Force", 3, 10));
        assertEquals("◼◼◼◻◻◻◻◻◻◻ Agilité", visualiserCaracteristique("Agilité", 3, 10));
        assertEquals("◼◼◼◼◼◼◼◼◼◼ Sagesse", visualiserCaracteristique("Sagesse", 10, 10));
    }
    
    String visualiserCaracteristique(String nom, int valeur, int max){
        return genererBarre(valeur, max) + " " + nom; 
    }
}