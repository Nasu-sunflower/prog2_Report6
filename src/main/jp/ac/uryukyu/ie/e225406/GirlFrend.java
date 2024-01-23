package main.jp.ac.uryukyu.ie.e225406;

public class GirlFrend {
    private String name;
    private int love;
    private boolean marriage;

    public GirlFrend(String name,int maximumlove,boolean marriage){
        this.name = name;
        love = maximumlove;
        marriage = false;
    }

    //getter
    public String getName(){return this.name;}
    public int getLovd(){return this.love;}
    public boolean getMarriage(){return this.marriage;}

    public void doPresent(GirlFrend girlFrend,Present p){
        
    }
}
