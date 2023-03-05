public class RaceHorse extends Horse {
    int numOfRaces;

    public RaceHorse(String name, String color, int birthYear, int numOfRaces) {
        super(name, color, birthYear);
        this.numOfRaces = numOfRaces;
    }

    public int getNumOfRaces(){
        return this.numOfRaces;
    }

    public void setNumOfRaces(int numOfRaces){
        this.numOfRaces = numOfRaces;
    }
    
}
