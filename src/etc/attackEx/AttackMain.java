package etc.attackEx;

public class AttackMain {

    public static void main(String[] args) {
        Player playerA = new Player(100, 20);
        Player playerB = new Player(200, 10);

       while(true){
            if(playerA.getHp() == 0 || playerB.getHp() == 0){
                break;
            }
            playerA.setHp( playerA.getHp() - playerB.getAttack() );
            playerB.setHp( playerB.getHp() - playerA.getAttack() );
       }
    }

}
