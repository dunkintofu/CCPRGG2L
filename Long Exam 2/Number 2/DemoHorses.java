public class DemoHorses {
    public static void main(String[] args) {
        Horse horse = new Horse("Jarmaine", "Black", 2003);
        System.out.println("horse name: " + horse.getName());
        System.out.println("horse color: " + horse.getColor());
        System.out.println("Birth Year: " + horse.getBirthYear());
        System.out.println("---------------------------------------");


        RaceHorse raceHorse = new RaceHorse(null, null, 0, 0);
        
        raceHorse.setName("Felicia");
        raceHorse.setColor("White");
        raceHorse.setBirthYear(2000);
        raceHorse.setNumOfRaces(87);
        
        System.out.println("Race horse name: " + raceHorse.getName());
        System.out.println("Race horse color: " + raceHorse.getColor());
        System.out.println("Birth Year: " + raceHorse.getBirthYear());
        System.out.println("Number of races competed: " + raceHorse.getNumOfRaces() + "\n");
        System.out.println("---------------------------------------");
    }

   
}
