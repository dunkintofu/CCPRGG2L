import java.util.Scanner;
public class Player {
    
    String name;
    String team;
    int jerseyNumber;
    
    Player(String name, String team, int jerseyNumber) {
        this.name = name;
        this.team = team;
        this.jerseyNumber = jerseyNumber;
    }

    void readPlayer() {
        
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter player name: ");
           this.name = sc.nextLine();
           System.out.println("Enter player team: ");
           this.team = sc.nextLine();
           System.out.println("Enter player jersey number: ");
           this.jerseyNumber = Integer.parseInt(sc.nextLine());

        }

  
}
