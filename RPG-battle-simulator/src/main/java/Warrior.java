public class Warrior extends Character{
    public int stamina;
    public int strength;

    public void HeavyAttack(Character opponent){
        if(this.stamina > 0){
            this.stamina -= 5;
            opponent.hp -= this.strength;
        }
    }
    public void WeakAttack(Character opponent){
        if(this.stamina > 0){
            this.stamina -= 1;
            opponent.hp -= this.strength/2;
        }
    }
    @Override
    public void Attack() {
    }

}