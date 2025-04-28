package etc.attackEx;

public class Player {

    private int hp;
    private int attack;

    public Player(int hp, int attack) {
        this.hp = hp;
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setHp(int hp) {
        this.hp = hp;

    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
