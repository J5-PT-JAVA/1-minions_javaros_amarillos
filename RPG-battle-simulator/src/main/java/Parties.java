public class Parties {
    public static void main(String[] args) {
        Party party1 = new Party();
        Party party2 = new Party();
        party1.fillParty();
        party2.fillParty();
        party1.battle(party2);
    }

    public static class Party {
        public ArrayList<Character> party = new ArrayList<Character>();
        public void fillParty() {
            Random random = new Random();
            int partySize = random.nextInt(10) + 1;
            for (int i = 0; i < partySize; i++) {
                int randomNumber = random.nextInt(2);
                if (randomNumber == 0) {
                    party.add(new Warrior());
                } else {
                    party.add(new Wizard());
                }
            }
        }
        public void battle(Party opponentParty) {
            while (true) {
                for (Character character : party) {
                    character.Attack(opponentParty.party.get(0));
                }
                for (Character character : opponentParty.party) {
                    character.Attack(party.get(0));
                }
                if (party.get(0).hp <= 0) {
                    System.out.println("Party 2 wins");
                    break;
                } else if (opponentParty.party.get(0).hp <= 0) {
                    System.out.println("Party 1 wins");
                    break;
                }
            }
        }
    }
}
