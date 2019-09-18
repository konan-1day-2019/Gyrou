package com.example.gyrou.Manager;
import com.example.gyrou.Role.Citizen;
import com.example.gyrou.Role.FortuneTeller;
import com.example.gyrou.Role.Role;
import com.example.gyrou.Role.Werewolf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class PlayerListManager {
    private static final PlayerListManager ourInstance = new PlayerListManager();

    public static PlayerListManager getInstance() {
        return ourInstance;
    }
    static Random random=new Random();
    private PlayerListManager() {
        nameList=new ArrayList<String>();
        activePlayerList=new ArrayList<Role>();
    }
    public static  void addPlayer(String s){
        nameList.add(s);
    }
    public  static ArrayList<String> nameList;
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
                menberRole[0]=1;
                menberRole[1]=1;
                menberRole[2]=2;
                break;
            case  5:
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new FortuneTeller());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                menberRole[0]=2;
                menberRole[1]=1;
                menberRole[2]=2;
                break;
            case 6:
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new FortuneTeller());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                menberRole[0]=2;
                menberRole[1]=1;
                menberRole[2]=3;
                break;
            case 7:
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new Werewolf());
                activePlayerList.add(new FortuneTeller());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                activePlayerList.add(new Citizen());
                menberRole[0]=2;
                menberRole[1]=1;
                menberRole[2]=4;

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
                menberRole[0]=2;
                menberRole[1]=1;
                menberRole[2]=5;

                break;

        }
    }
    public  static  void setName(){
        for(int i=0;i<activePlayerList.size();i++){
            int index=random.nextInt(activePlayerList.size());
            System.out.println("\nIndex :" + index );
            nameList.get(index);
            activePlayerList.get(i).setName(nameList.get(i));
            nameList.remove(nameList.get(index));
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

    public static ArrayList<String> deadRoleName=new ArrayList<String>();
    public  static  void resetDeadRoleName(){
        deadRoleName.clear();
    }
}
