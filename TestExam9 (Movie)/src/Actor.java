public class Actor {
    private String name;
    private char gender;

    public Actor(String name, char gender){
        this.name = name;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public char getGender(){
        return gender;
    }

    public String toString(){
        return "Name: " + name + ", gender: " + gender;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Actor)){
            return false;
        }
        Actor other = (Actor)obj;
        return name.equals(other.name) && gender == other.gender;
    }
}
