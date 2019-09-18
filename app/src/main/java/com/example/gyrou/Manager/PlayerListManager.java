package com.example.gyrou.Manager;
import com.example.gyrou.Role.Citizen;
import com.example.gyrou.Role.FortuneTeller;
import com.example.gyrou.Role.Role;
import com.example.gyrou.Role.Werewolf;

import java.util.ArrayList;

public class PlayerListManager {
    private static final PlayerListManager ourInstance = new PlayerListManager();

    public static PlayerListManager getInstance() {
        return ourInstance;
    }

    private PlayerListManager() {
        activePlayerList=new ArrayList<Role>();
    }

    public  static ArrayList<Role> activePlayerList;
    public  static int[] menberRole=new int[3];
    public static  void setPlayerToRole(int n){
        activePlayerList.clear();
        switch (n){
            case 4:
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new FortuneTeller());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                break;
            case  5:
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new FortuneTeller());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                break;
            case 6:
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new FortuneTeller());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                break;
            case 7:
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new FortuneTeller());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                break;
            case 8:
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new FortuneTeller());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                break;

        }
    }
    //夜の処理時
    public  static void afterAction(){
        for (Role r:getSurvivorList()){
            r.action();
        }

    }
    public  static  ArrayList<Role> getSurvivorList(){
        ArrayList<Role> returnlist=new ArrayList<Role>();
        for(Role r:activePlayerList){
            if(r.isAlive){
                returnlist.add(r);
            }
        }
        return  returnlist;
    }
}
