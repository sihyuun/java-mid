package etc.attackEx2;

import java.util.Scanner;

public class AttackMainV1 {


    public static void main(String[] args) {
        Player player = new Player(10000, 1000);
        MonsterA a = new MonsterA();
        MonsterB b = new MonsterB();

        int gAttack = 1000;
        int mTotalAttack = 0;
        int pTotalAttack = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // select monster
            System.out.println("== 목록 ==");
            System.out.println("a: monsterA, b: monsterB, exit: 종료");
            System.out.print("선택하세요: ");
            String monsterOption = scanner.nextLine();
            if (monsterOption.equals("a")) {
                //battle
                for (int i = player.getAttack(); i < a.getHp() ;  ) {
                    for (int j = a.generalAttack(gAttack); j < player.getHp();) {
                        player.setHp(player.getHp() - a.generalAttack(gAttack));
                        player.setHp(player.getHp() - a.specialAttack());
                        a.setHp(a.getHp() - player.getAttack());
                    }
                }
            } else if (monsterOption.equals("b")) {
                for (int i = player.getAttack(); i < b.getHp() ; ) {
                    for (int j = a.generalAttack(gAttack); j < player.getHp();) {
                        player.setHp(player.getHp() - b.generalAttack(gAttack));
                        player.setHp(player.getHp() - b.specialAttack());
                        b.setHp(b.getHp() - player.getAttack());
                    }
                }
            } else if (monsterOption.equals("exit")) {
                System.out.println("공격을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다.");
                break;
            }

            mTotalAttack += a.generalAttack(gAttack) + a.specialAttack();
            System.out.println("공격 성공, 몬스터가 지금까지 가한 데미지는 총 " + mTotalAttack + "입니다.");

            pTotalAttack += player.getAttack();
            System.out.println("공격 성공, 플레이어가 지금까지 가한 데미지는 총 " + pTotalAttack + "입니다.");
        }

        System.out.println("플레이어의 남은 hp는 " + player.getHp() + "입니다.");
        System.out.println("몬스터A의 남은 hp는 " + a.getHp() + "입니다.");
        System.out.println("몬스터B의 남은 hp는 " + b.getHp() + "입니다.");

    }

}
