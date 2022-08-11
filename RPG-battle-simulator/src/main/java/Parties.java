public static class Party {

    public ArrayList<Character> fighter;
    public int size;
    public void fillParty(){
        // size has a random value between 2 and 10
        this.size = (int) (Math.random() * 10) + 2;
        for (int i = 0; i < this.size; i++) {
            // Each party has random fighters (Warrior or Wizard)
            if (Math.random() > 5) {
                this.fighter.add(new Warrior(i, i +"- Warrior Jr"));
            } else {
                this.fighter.add(new Wizard(i, i+ "- Wizard Jr"));
            }
        }
    }
    // TODO: Show the graveyard/ Mostrar tanatorio
    // TODO: Añadir funcion de guerreros en pie
    // TODO: Import a party using a CSV file.
    // TODO: Añadir tanatorio



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

