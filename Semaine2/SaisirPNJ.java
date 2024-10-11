// Fonctionnalité 2
class SaisirPNJ extends Program {
    void algorithm() {
        int force = -1;    
        int agilite = -1; 
        int sagesse = -1;  

        // Saisie et contrôle pour la force
        print("Force : ");
        force = readInt();
        while (force < 0 || force > 10) {
            println("Veuillez entrer un nombre compris entre 0 et 10 inclus.");
            println("Force : ");
            force = readInt();
        }

        // Saisie et contrôle pour l'agilité
        print("Agilité : ");
        agilite = readInt();
        while (agilite < 0 || agilite > 10) {
            println("Veuillez entrer un nombre compris entre 0 et 10 inclus.");
            println("Agilité : ");
            agilite = readInt();
        }

        // Saisie et contrôle pour la sagesse
        print("Sagesse : ");
        sagesse = readInt();
        while (sagesse < 0 || sagesse > 10) {
            println("Veuillez entrer un nombre compris entre 0 et 10 inclus.");
            print("Sagesse : ");
            sagesse = readInt();
        }
        
        println("Force (" + force + ") - Agilité (" + agilite + ") - Sagesse (" + sagesse + ")");
    }
}