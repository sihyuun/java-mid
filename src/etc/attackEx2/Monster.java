package etc.attackEx2;

public abstract class Monster {
    public int hp;

    public void setHp(int hp) {
        this.hp = hp;
    }
    int attack = 1000;
    public int generalAttack(int attack) {
        System.out.println("일반 공격을 시작합니다.");
        this.attack = attack;
        return hp - attack;

    }

    public abstract int specialAttack();

}
