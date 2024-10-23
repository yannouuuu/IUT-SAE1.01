// Crédit : Paul Delavictoire
class Challenges1 extends Program {
    String printPNJ(String str1, int val1, String str2, int val2, String str3, int val3){
        return str1+" ("+val1+")\n"+str2+" ("+val2+")\n"+str3+" ("+val3+")\n";
    }
    
    void testPrintPNJ() {
        assertEquals("a (10)\naaa (7)\naa (8)\n", printPNJ("a",10,"aaa",7,"aa", 8));
    }
}
