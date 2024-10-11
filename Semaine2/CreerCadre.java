 // Fonctionnalité 3
class CreerCadre extends Program {
    void algorithm() {
        print("Message : ");
        String message = readString();
        int longueur = length(message);

        // Affichage du cadre supérieur
        print(" ");
        for (int i = 0; i < longueur + 2; i++) {
            print("-");
        }
        println();

        // Affichage du message encadré
        print("| " + message + " |");
        println();

        // Affichage du cadre inférieur
        print(" ");
        for (int i = 0; i < longueur + 2; i++) {
            print("-");
        }
        println();
    }
}