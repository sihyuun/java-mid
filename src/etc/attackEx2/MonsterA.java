package etc.attackEx2;

public class MonsterA extends Monster {

    int hp;
    @Override
    public int specialAttack() {
        int attack = 2000;
        System.out.println("속성 공격을 시작합니다.");
        return hp - attack;
    }
}
