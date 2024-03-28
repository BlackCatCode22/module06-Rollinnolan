package Zoo;

public class Bear extends Animal
{
    //Constructor
    public Bear(String name){
        super(name);
        this.name= name;
        this.species = "bear";
    }
    public Bear(String name, int age)
    {
        super(name,age);
        this.name = name;
        this.age = age;
        this.species = "bear";
    }
    public Bear(String name, int age, String season, String color, String sex, String weight, String location, String habitat)
    {
        super(name, age, season, color, sex, weight, location, habitat);
        this.name = name;
        this.age = age;
        this.season = season;
        this.color = color;
        this.sex = sex;
        this.weight = weight;
        this.location = location;
        this.habitat = habitat;
        this.species = "bear";
        numOfAnimals--;
    }
    public void hibernate()
    {
        System.out.println("zzzzzzzz");
    }

}
