public class joker {
    public joker() {
        
    }

    public int simulateOne() {
        ArrayList<Integer> cards = new ArrayList<Integer>();
        for (int i = 0; i < 36; i++) {
            cards.push(i);
        }
        for (int i = 0; i < 4; i++) {
            int numJokers = 0;
            for (int i = 0; i < 9; i++) {
                int card = cards.remove(nextInt(cards.length));
                if (card == 1 || card == 2) {
                    numJokers++;
                }
            }
            if (numJokers == 2) {
                return 1;
            }
        }
        return 0;
    }

            
}