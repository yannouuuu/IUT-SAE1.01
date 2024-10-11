//Fonctionnalité 3
class GenererPNJ extends Program {
    void algorithm() {
        /* Génération aléatoire des caractéristiques avec des valeurs entre 0 et 10 
        (on utilise 11 car quand convertion en int d'un double, il arrondi à l'inférieur) */
        int force = (int)(random() * 11);     // Force entre 0 et 10
        int agilite = (int)(random() * 11);   // Agilité entre 0 et 10
        int sagesse = (int)(random() * 11);   // Sagesse entre 0 et 10
        int dexterite = (int)(random() * 11); // Dextérité entre 0 et 10
        int charisme = (int)(random() * 11);  // Charisme entre 0 et 10

        println("Force (" + force + ") - " +
                "Agilite (" + agilite + ") - " +
                "Sagesse (" + sagesse + ") - " +
                "Dexterite (" + dexterite + ") - " +
                "Charisme (" + charisme + ")");
    }
}
