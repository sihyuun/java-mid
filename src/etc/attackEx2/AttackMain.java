package etc.attackEx2;

public class AttackMain {

    public static void main(String[] args) {
        Player player = new Player(10000);
        MonsterA a = new MonsterA();
        int gAttack = 1000;
        int totalAttack = 0;

        while (true) {
            if (player.getHp() < a.generalAttack(gAttack) + a.specialAttack() || player.getHp() == 0) {
                System.out.println("공격 실패");
                break;
            }
            totalAttack += a.generalAttack(gAttack) + a.specialAttack();
            System.out.println("공격 성공, 몬스터가 가한 데미지는 " + totalAttack + "입니다.");
            player.setHp(player.getHp() - a.generalAttack(gAttack));
            player.setHp(player.getHp() - a.specialAttack());
        }

        System.out.println("플레이어의 남은 hp는 " + player.getHp() + "입니다.");
    }
}
