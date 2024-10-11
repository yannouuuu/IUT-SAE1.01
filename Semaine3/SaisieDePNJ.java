// Crédit : Yann Renard, Robin Maréchal, Valentin Licour
class SaisieDePNJ extends Program {

    // 1 
    
int minimum(int a, int b) {
    int min = a;
    if (b < a) {  
        min = b;
    }
    return min;  
}

    // 2 
    
int saisir(String message, int borneMinimale, int borneMaximale) {
    print(message + " : ");
    int valeur = readInt();
    
    while (valeur < borneMinimale || valeur > borneMaximale) {
        println("Désolé, la valeur doit être dans l'intervalle [" + borneMinimale + "," + borneMaximale + "].");
        print(message + " : ");
        valeur = readInt();
    }
    return valeur;
}

    // 3
    
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

    // Algorithm

void algorithm() {
    println("Dans (2, 3), le minimum est : " + minimum(2, 3));
    println("Dans (2, 0), le minimum est : " + minimum(2, 0));
    println("Dans (1, 1), le minimum est : " + minimum(1, 1));
    println("-------------------------------");

    print("Caractéristique : ");
    String cara = readString();
    println(cara + " vaut " + saisir(cara,0,10) + "."); 
    println("-------------------------------");

    print("Nombre de points à répartir : ");
    int nbPts = readInt();
    println(saisirPNJ(nbPts));
    println("-------------------------------");
}
}

