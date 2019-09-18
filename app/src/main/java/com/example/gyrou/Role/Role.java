package com.example.gyrou.Role;

import android.app.ActionBar;
import java.util.Random;
public abstract class Role {
    int rId;//ID
    String name;//プレイヤー名
    String roleName;//役職名
    Random actionDice=new Random();
    Role targetRole;//対象のプレイヤー
    public  String getName(){
        return name;
    }
    public  Role(){
        isAlive=true;
    }
    public void setName(String s){
        name=s;
    }

    protected  String ActionExplanationText;//アクション前の説明

    protected  String ActionResultText;//アクション結果の表示

    public boolean isAlive;//生存しているかどうか

    protected  int actionPower;//アクションを成功させるためのパワー

    protected float shakePower;//シェイクパワー.自身のアクションの成功率に加算する
    protected  int defenseValue;//防御力。人狼の捕食成功確率を下げる
    ///<summary>
    ///シェイク後に実行するメソッド.
    ///結果表示ステップで実行
    ///</summary>
    public void setShakeAction(float value,Role role){
        shakePower=value;
        targetRole=role;
    }


    protected int actionSuccess;//アクションの成功率(max 100%)

    public abstract void action();//夜のアクション.処理ステップで一括に実行される

    public  void setExplanationText(String s){
        ActionExplanationText=s;
    }

    public  void setResultText(String s){
        ActionResultText=s;
    }



}
