package com.example.gyrou.Role;


public class Citizen extends Role {
    Citizen(String n){
        name=n;
        roleName="市民";
        isAlive=true;
        ActionExplanationText="-疑わしきは罰せよ-";
        ActionResultText="";
        actionPower=50;

    }
    @Override
    public  void setShakeAction(float value,Role role){
        shakePower=(int)value;
        targetRole=role;
        defenseValue=(int)actionPower;

    }

    public void action(){

    }
}
