package com.example.gyrou.Role;

import android.app.ActionBar;
import java.util.Random;
public abstract class Role {
    int rId;//ID
    String name;//プレイヤー名
    Random actionDice=new Random();
    public  String getName(){
        return name;
    }
    protected  String ActionExplanationText;//アクション前の説明

    protected  String ActionResultText;//アクション結果の表示

    protected boolean isAlive;//生存しているかどうか
    protected  float initialShakePower;//初期のシェイクパワー

    protected float shakePower;//シェイクパワー

    public void setShakePower(float value){
        shakePower=value;
    }

    protected int actionSuccess;//アクションの成功率(max 100%)

    public abstract void action(Role role);//夜のアクション

    public  void setExplanationText(String s){
        ActionExplanationText=s;
    }

    public  void setResultText(String s){
        ActionResultText=s;
    }


}
