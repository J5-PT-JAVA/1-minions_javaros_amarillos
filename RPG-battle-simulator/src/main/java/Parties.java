public class Parties {
    public ArrayList<Character> fighter;
    public int size;
    public Parties(int size) {
        this.size = size;
        this.fighter = new ArrayList<Character>();
    }

    public static void main(String[] args) {
        Party party1 = new Party();
        Party party2 = new Party();
        party1.fillParty();
        party2.fillParty();
        party1.battle(party2);
    }

    public static class Party {

        public ArrayList<Character> fighter;
        public int size;

        /* Todo: Hay 3 maneras de crear los parties:
        - Tamaño random con luchadores random
        - Import por CSV
        - Por inputs en pantalla
        */
        public void fillParty() {
            // size has a random value between 2 and 10
            this.size = (int) (Math.random() * 10) + 2;
            for (int i = 0; i < this.size; i++) {
                // Each party has random fighters (Warrior or Wizard)
                if (Math.random() > 5) {
                    this.fighter.add(new Warrior(i, i + "- Warrior Jr"));
                } else {
                    this.fighter.add(new Wizard(i, i + "- Wizard Jr"));
                }
            }
        }
        // TODO: Añadir funcion de guerreros en pie
        // TODO: Añadir tanatorio
        // TODO: When the battle is over the winner will return to the party and the loser will be removed and sent to the graveyard.
        // Then you can choose the combatants for the next duel.
        // TODO: When a party lose all their members a winner party is declared.

        public void battle(Party otherParty) {
            while (this.fighter.size() > 0 && otherParty.fighter.size() > 0) {
                for (int i = 0; i < this.fighter.size(); i++) {
                    this.fighter.get(i).Attack(otherParty.fighter.get(i));
                }
                for (int i = 0; i < otherParty.fighter.size(); i++) {
                    otherParty.fighter.get(i).Attack(this.fighter.get(i));
                }
            }
            if (this.fighter.size() > 0) {
                System.out.println("Party 1 wins");
            } else {
                System.out.println("Party 2 wins");
            }
        }
    }
}

