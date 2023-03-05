public class Horse {
    String name;
    String color;
    int birthYear;

    public Horse (String name, String color, int birthYear) {
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }
   
    //Getters
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
