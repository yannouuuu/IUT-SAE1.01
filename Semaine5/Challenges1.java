// Crédit : Paul Delavictoire
class Challenges1 extends Program {
    String printPNJ(String str1, int val1, String str2, int val2, String str3, int val3) {
        String rep = str1;
        int ml = Math.max(Math.max(length(str1), length(str2)), length(str3));
        for (int i = 0; i < ml - length(str1); i++) {
            rep += " ";
        }
        rep += " (" + val1 + ")\n" + str2;
        for (int i = 0; i < ml - length(str2); i++) {
            rep += " ";
        }
        rep += " (" + val2 + ")\n" + str3;
        for (int i = 0; i < ml - length(str3); i++) {
            rep += " ";
        }
        rep += " (" + val3 + ")\n";
        return rep;
    }
    
    void testPrintPNJ() {
        assertEquals("a   (10)\naaa (7)\naa  (8)\n", printPNJ("a", 10, "aaa", 7, "aa", 8));
    }
}
