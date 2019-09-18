package com.example.gyrou.Role;
import java.util.Random;

public class Werewolf extends Role {
    Werewolf(String n){
        name=n;
        ActionExplanationText="今夜、襲う対象を選択してください";
        ActionResultText="";
        initialShakePower=50;
        shakePower=initialShakePower;
    }
    public  void action(Role role){
        int randomvalue=actionDice.nextInt(100);


    }

}
