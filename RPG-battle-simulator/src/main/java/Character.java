public abstract class Character implements Attacker {
    public int id;
    public String name;
    public int hp;
    public Boolean isAlive;

    public Character(int id, String name, int hp) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = true;
    }

public void PrintStats() {
    System.out.println("Name: " + this.name + " HP: " + this.hp);
}

    public abstract void Attack();

    // add getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public Boolean getIsAlive() {
        return isAlive;
    }
    // add setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public void setIsAlive(Boolean isAlive) {
        this.isAlive = isAlive;
    }
}