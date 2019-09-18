package com.example.gyrou.Role;
import java.util.Random;

public class Werewolf extends Role {
    Werewolf(String n){
        name=n;
        roleName="人狼";
        isAlive=true;
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
        }


    }

}
