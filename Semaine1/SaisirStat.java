// Fonctionnalité 2
class SaisirStat extends Program {
    void algorithm () {
        println("Quelle caracteristique [Force, Agilite, Sagesse] ?");
        String caracteristique = readString();
        // CONDITION 
        if (equals(caracteristique, "Force") || equals(caracteristique, "Agilite") || equals(caracteristique, "Sagesse")) {
            println("Quelle valeur [0-10] ?");
            int valeur = readInt();
            // CONDITION imbriauée
            if (valeur >= 0 && 10 >= valeur) {
                println(caracteristique + " (" + valeur + ")");
            } else {
                println("Desole, cette valeur n'est pas valide.");
            }
        } else {
            println("Desole cette caractéristique n'existe pas.");
        }
    }
}
