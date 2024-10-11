// Crédit : Valentin Licour
class SaisieDePNJ2 extends Program {
    int saisir(String message, int borneMinimale, int borneMaximale) {
        println("Caractéristique : " + message);
        print(message + " : ");
        int valeur = readInt();
        
        while (valeur < borneMinimale || valeur > borneMaximale) {
            println("Désolé, la valeur doit être dans l'intervalle [" + borneMinimale + "," + borneMaximale + "].");
            print(message + " : ");
            valeur = readInt();
        }

        println(message + " vaut " + valeur + "."); 
        return valeur;
    }

    void algorithm() {
        int force = saisir("Force", 0, 10);
    }
}