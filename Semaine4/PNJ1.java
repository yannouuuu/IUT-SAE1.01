class PNJ1 extends Program{
    void _testGenererBarre() {
        assertEquals("◻◻◻◻◻◻◻◻◻◻", genererBarre(0, 10));
        assertEquals("◼◼◼◻◻◻◻◻◻◻", genererBarre(3, 10));
        assertEquals("◼◼◼◼◼◼◼◼◼◼", genererBarre(10, 10));
    }
    
    String genererBarre(int black, int white) {
        String accu = "";
        for (int i = 0; i < black; i++) {
            accu += "◼";
        }
        for (int i = black; i < white; i++) {
            accu += "◻";
        }
        return accu;
    }
}