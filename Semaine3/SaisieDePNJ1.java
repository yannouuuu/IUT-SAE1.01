// Crédit : Robin Maréchal
class SaisieDePNJ1 extends Program {
    int minimum(int a, int b) {
        int min = a;
        if (b < a) {  
            min = b;
        }
        return min;  
    }

    void algorithm() {
        println("Dans (2, 3), le minimum est : " + minimum(2, 3));
        println("Dans (2, 0), le minimum est : " + minimum(2, 0));
        println("Dans (1, 1), le minimum est : " + minimum(1, 1));
    }
}