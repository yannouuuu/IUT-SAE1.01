// Crédit : Paul Delavictoire
class Challenges3 extends Program {
    String toString(boolean[] champs) {
        String rep = "";
        for (int i = 0; i < length(champs); i++) {
            if (champs[i]) {
                rep += 'B';
            } else {
                rep += '.';
            }
        }
        return rep;
    }

    void println(boolean[] champs) {
        println(toString(champs));
    }

    boolean[] generer(int nb_case, int nb_bombe) {
        boolean[] tab = new boolean[nb_case];
        double rand;
        int id;
        for (int i = 0; i < nb_bombe; i++) {
            rand = random() * nb_case;
            id = (int) rand;
            if (!tab[id]) {
                tab[id] = true;
            } else {
                i--; // Réitère si une bombe est déjà présente
            }
        }
        return tab;
    }

    void _algorithm() {
        print("Nombre de cases : ");
        int cases = readInt();
        print("Nombre de bombes : ");
        int bombes = readInt();
        println(generer(cases, bombes));
    }

}