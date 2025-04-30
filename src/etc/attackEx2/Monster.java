package etc.attackEx2;

public abstract class Monster {

    int hp;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int generalAttack(int attack) {
        System.out.println("일반 공격을 시작합니다.");
        return attack;
    }

    public abstract int specialAttack();
}
