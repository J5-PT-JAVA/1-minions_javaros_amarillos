public class Warrior extends Character{
    public int stamina;
    public int strength;

    public void HeavyAttack(Character opponent){
        this.stamina -= 5;
        opponent.hp -= this.strength;
    }
    public void WeakAttack(Character opponent){
        // The damage of a weak attack is the half of the strength (truncate decimals). Every weak attack will recover his stamina by 1.
        opponent.hp -= this.strength/2;
        this.stamina += 1;
    }

    public Warrior(int id, String name){
        this.id = id;
        this.name = name;
        this.hp = (int) (Math.random() * 200) + 100;
        this.isAlive = true;
        this.stamina = (int) (Math.random() * 50) + 10;
        this.strength = (int) (Math.random() * 10) + 1;
    }

    @Override
    public void Attack(Character opponent) {
        if (this.stamina > 5) {
            this.HeavyAttack(opponent);
        } else {
            this.WeakAttack(opponent);
        }
    }

}
