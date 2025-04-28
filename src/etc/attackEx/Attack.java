package etc.attackEx;

public class Attack {
   public Attack(){

   }
    public int attackProcess(Player A, Player B ) {

        int newHp = 0;
        int attackA =A.getAttack();
        int attackB=B.getAttack();
        int hpA=A.getHp();
        int hit =hpA-attackB;
        A.setHp(hit);

        int hpB= B.getHp();
        hit=hpB-attackA;
        B.setHp(hit);

        A.setAttack(attackA + 10);

        return newHp;
    }

}
