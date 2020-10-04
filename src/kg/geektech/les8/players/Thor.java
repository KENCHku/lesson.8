package kg.geektech.les8.players;

import java.util.Random;

public class Thor extends Hero {
    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.DEAFEN);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (new Random().nextInt(2)==1){
            System.out.println("Thor deafen the Boss");
            boss.setDeafen(true);
        }else{
            boss.setDeafen(false);
        }


    }
}

        /*Random r = new Random();
        int deafen = r.nextInt(2);
        int bossDamage = boss.getDamage();
        if (deafen == 1) {boss.setDamage(0);
            System.out.println("Thor deafen Boss");}
         else {
             boss.setDamage(50);
        }
    }*/

