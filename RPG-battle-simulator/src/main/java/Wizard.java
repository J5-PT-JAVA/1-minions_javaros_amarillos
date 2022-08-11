public class Wizard extends Character{
    public int mana;
    public int intelligence;


    public void Fireball(Character opponent){
        if(this.mana > 0){
            this.mana -= 5;
            opponent.hp -= this.intelligence;
        }
    }

    public void StaffHit(Character opponent){
        if(this.mana > 0){
            this.mana -= 1;
            opponent.hp -= 2;
        }
    }
    @Override
    public void Attack() {
  
    }
}