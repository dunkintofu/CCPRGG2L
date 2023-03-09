
public class ComparePlayers extends Player {
ComparePlayers(String name, String team, int jerseyNumber) {
        super(name , team, jerseyNumber);
    }

    public static void main(String[] args) {

    
    Player player1 = new Player("", "", 0);
    Player player2 = new Player("", "", 0);
    
    //read player1 info
    System.out.println("Enter player 1 information:");
    player1.readPlayer();
    System.out.println("Player 1 info: " + player1.name + ", " + player1.team + ", " + player1.jerseyNumber);

    //read player2 info
    System.out.println("Enter player 2 information:");
    player2.readPlayer();
    System.out.println("Player 2 info: " + player2.name + ", " + player2.team + ", " + player2.jerseyNumber);

    if (player1.team.equals(player2.team) && player1.jerseyNumber == player2.jerseyNumber) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }
    }


    //call equals method
    public static boolean equals(Player player1, Player player2){
        if (player1.team.equals(player2.team) && player1.jerseyNumber == player2.jerseyNumber) {
            return true;
        } else {
            return false;
        }
    }
}

