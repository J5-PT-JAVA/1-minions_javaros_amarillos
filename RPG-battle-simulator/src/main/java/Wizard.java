public class Wizard extends Character{
    public int mana;
    public int intelligence;

    public void Fireball(Character opponent){
        this.mana -= 5;
        opponent.hp -= this.intelligence;
    }

    public void StaffHit(Character opponent){
        this.mana -= 1;
        opponent.hp -= 2;
    }

    public Wizard(int id, String name){
        this.id = id;
        this.name = name;
        this.hp =   (int) (Math.random() * 50) + 100;
        this.isAlive = true;
        this.mana = (int) (Math.random() * 50) + 10;
        this.intelligence = (int) (Math.random() * 50) + 1;
    }

    @Override
    public void Attack(Character opponent) {
        if (this.mana > 5) {
            this.Fireball(opponent);
        } else {
            this.StaffHit(opponent);
        }
    }
}
