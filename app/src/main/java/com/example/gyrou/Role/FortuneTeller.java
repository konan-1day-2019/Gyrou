package com.example.gyrou.Role;

public class FortuneTeller extends Role {
    public FortuneTeller(){

        roleName="占い師";
        ActionExplanationText="-私が黒と言えば、黒なるのだ-";
        ActionResultText="";
        actionPower=70;

    }
    @Override
    public  void setShakeAction(float a,Role role){
        int randomValue=actionDice.nextInt(101);
        targetRole=role;
        actionSuccess=actionPower+(int)shakePower;

        if(randomValue<=actionSuccess){
            ActionResultText=role.name+"は、"+role.roleName+"です。";
        }else {
            ActionResultText="占いは失敗しました。やめたら？この仕事。";
        }
    }

    public  void action(){



    }
}
