// Fonctionnalité 1
class AfficherStats extends Program {
    void algorithm(){
        print("Force : ");
        int force = readInt();
        print("Agilite : ");
        int agilite = readInt();
        print("Sagesse : ");
        int sagesse = readInt();
        
        int dexterite = (force + agilite) / 2; // Arrondi à l'inférieur automatiquement
        int charisme = (2 * force + sagesse) / 3;
        
        println("Force (" + force + ") - " +
                "Agilite (" + agilite + ") - " +
                "Sagesse (" + sagesse + ") - " +
                "Dexterite (" + dexterite + ") - " +
                "Charisme (" + charisme + ")");
    }
}
