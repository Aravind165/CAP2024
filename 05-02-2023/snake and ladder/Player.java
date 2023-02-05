import java.util.*;
public class Player {
    private int pos=0;
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    Player(String name){
        setName(name);
    }
    public int getPos(){
        return pos;
    }
    public void rollDice(){
        Dice e=new Dice();
        int d=e.roll();
       
       System.out.println("dice value :"+d);
        if((pos+d)<=100){
            pos=pos+d;
        }
        else{
            System.out.println("limt is exceed.");
         }

        HashMap<Integer,Integer>Snakes=new HashMap<>();
        Snakes.put(15,8);
        Snakes.put(51,32);
        Snakes.put(64,27);
        Snakes.put(65,60);
        Snakes.put(89,30);
        Snakes.put(91,73);
        Snakes.put(98,2);
        HashMap<Integer,Integer>Ladders=new HashMap<>();
        Ladders.put(7,14);
        Ladders.put(13,31);
        Ladders.put(25,38);
        Ladders.put(33,58);
        Ladders.put(51,67);
        Ladders.put(68,81);
        if(Snakes.containsKey(pos)){
            System.out.println("At position "+pos+" you affected by snake");
            pos=Snakes.get(pos);
        }
        else if(Ladders.containsKey(pos)){
            System.out.println("At position "+pos+" you get ladder");
            pos=Ladders.get(pos);
        }
    }
}
