import java.util.*;
public class SnakeAndLadder {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int no_players = in.nextInt();
        System.out.println("Enter the names of the players");
        List<Player> list_of_players = new ArrayList<>();
        in.nextLine();
        for(int i=0;i<no_players;i++){
            System.out.println("Enter the player"+(i+1)+" name:");
            String name = in.nextLine();
            list_of_players.add(new Player(name));
        } 
        List<String> Winners = new ArrayList<>();
        if(no_players==1)
            System.out.println("Minimum two players are required to start the game");
        else{
            int k=1;
            while(no_players!=1){
                for(Player p:list_of_players){
                    System.out.println(p.getName()+"'s turn:");
                    System.out.println("press enter key to roll dice");
                    String action=in.nextLine();
                    if(action.equals("")){
                        p.rollDice();
                        System.out.println(p.getName()+" is at position "+p.getPos());
                    }
                    else{
                        System.out.println("you are left from game.");
                        list_of_players.remove(p);
                        no_players--;
                    }
                    if(p.getPos()==100){
                        System.out.println("yours is game_over and weight for result.");
                        Winners.add(p.getName());
                        System.out.println("ranks is "+(k++));
                        list_of_players.remove((p));
                        no_players--;
                    }
                    if(list_of_players.size()==1){
                        break;
                    }
                }
            }
        }
        for(Player p:list_of_players){
            Winners.add(p.getName());}
            System.out.println("learder_board for player:");
            for(int i=0;i<Winners.size();i++){
                System.out.println((i+1)+" "+Winners.get(i));
            }
            System.out.println(".............Game Over.............");

    }
}
