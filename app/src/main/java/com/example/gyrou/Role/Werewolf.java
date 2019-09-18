package com.example.gyrou.Role;
import com.example.gyrou.Manager.PlayerListManager;

import java.util.Random;

public class Werewolf extends Role {
   public Werewolf(){

        roleName="人狼";
        ActionExplanationText="-わんわんお(^ω^U)-";
        ActionResultText="";
        actionPower=50;

    }
    @Override
    public  void setShakeAction(float s,Role role){
        shakePower=s;
        targetRole=role;
    }

    public  void action(){
        int randomValue=actionDice.nextInt(101)-targetRole.defenseValue;
        actionSuccess=actionPower+(int)shakePower;

        if(randomValue<actionPower+shakePower){
            targetRole.isAlive=false;
            PlayerListManager.deadRoleName.add(targetRole.name);
        }


    }

}
