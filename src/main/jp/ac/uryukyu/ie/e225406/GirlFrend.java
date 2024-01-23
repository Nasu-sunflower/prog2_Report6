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
    public int getLove(){return this.love;}
    public boolean getMarriage(){return this.marriage;}

    public void doPresent(GirlFrend girlFrend){
        love -= 30;
        if (love < 0){
            marriage = true;
            System.out.printf("%s:あなたとずっと一緒にいたいわ。\n", name);
        }else{ System.out.printf("%s:うれしいわ。\n", name);}
    }

    public void talk(GirlFrend girlFrend){
        love -= 20;
        if (love < 0){
            marriage = true;
            System.out.printf("%s:あなたとずっと一緒にいたいわ。\n", name);
        }else{ System.out.printf("%s:たのしいわ。\n", name);}
    }

    public void propose(GirlFrend girlFrend){
        System.out.printf("僕と結婚してください！");
        if(marriage = true){
            System.out.printf("%s:よろこんで！\n", name);
        }else{
            System.out.printf("%s:あなたのことそういう風に見れないのごめんなさいね。\n", name);
        }
    }
}
