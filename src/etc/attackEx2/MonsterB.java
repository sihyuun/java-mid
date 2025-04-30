package etc.attackEx2;

public class MonsterB extends Monster {

    @Override
    public int specialAttack() {
        int attack = 3000;
        System.out.println("속성 공격을 시작합니다.");
        return attack;
    }
}
