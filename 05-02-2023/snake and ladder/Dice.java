import java.util.*;
class Dice{
    public int roll(){
        Random random = new Random();
        int r = random.nextInt(6)+1;
        return r;
    }
}