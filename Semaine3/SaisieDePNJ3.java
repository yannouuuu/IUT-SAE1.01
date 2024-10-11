// Crédit : Yann Renard
class SaisieDePNJ3 extends Program {
    String saisir(int nbPts) {
        int force = 0;
        int agilite = 0;
        int sagesse = 0;

        // Saisie de la force avec vérification
        print("Force : ");
        force = readInt();
        while (force < 0 || force > nbPts) {
            println("Désolé la saisie doit être dans l'intervalle [0," + nbPts + "].");
            print("Force : ");
            force = readInt();
        }
        nbPts -= force;

        if (nbPts == 0) {
            println("Il ne reste plus de points à répartir.");
        } else {
            // Saisie de l'agilité avec vérification
            print("Agilité : ");
            agilite = readInt();
            while (agilite < 0 || agilite > nbPts) {
                println("Désolé la saisie doit être dans l'intervalle [0," + nbPts + "].");
                print("Agilité : ");
                agilite = readInt();
            }
            nbPts -= agilite;

            if (nbPts == 0) {
                println("Il ne reste plus de points à répartir.");
            } else {
                // Saisie de la sagesse avec vérification
                print("Sagesse : ");
                sagesse = readInt();
                while (sagesse < 0 || sagesse > nbPts) {
                    println("Désolé la saisie doit être dans l'intervalle [0," + nbPts + "].");
                    print("Sagesse : ");
                    sagesse = readInt();
                }
                nbPts -= sagesse;
            }
        }

        return "Force (" + force + ") - Agilité (" + agilite + ") - Sagesse (" + sagesse + ")";
    }

    void algorithm() {
        print("Nombre de points à répartir : ");
        int nbPts = readInt();
        println(saisir(nbPts));
        println("-------------------------------");
    }
}
