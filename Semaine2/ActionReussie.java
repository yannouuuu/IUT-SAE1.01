// Fonctionnalité 1
class ActionReussie extends Program { 
    void algorithm() {
        println("Valeur de la caractéristique (seuil de réussite) : ");
        int seuil = readInt();
        int resultatDe = (int)(random() * 11);
        println("Resultat du dé : " + resultatDe);
        if (resultatDe == 0) {
            println("Resultats de l'action : Echec critique !");
        } else if (resultatDe == 10) {
            println("Resultats de l'action : Reussite critique !");
        } else if (resultatDe >= seuil) {
            println("Resultats de l'action : Reussite");
        } else {
            println("Resultats de l'action : Echec");
        }
    }
}