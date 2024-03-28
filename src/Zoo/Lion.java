package Zoo;

public class Lion extends Animal
{
    //Constructor
    public Lion(String name){
        super(name);
        this.name= name;
        this.species = "lion";
    }
    public Lion(String name, int age)
    {
        super(name,age);
        this.name = name;
        this.age = age;
        this.species = "lion";
    }
    public Lion(String name, int age, String season, String color, String sex, String weight, String location, String habitat)
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
        this.species = "lion";
    }
    public void sing(){
        System.out.println("It's the circle of life.");
    }
}
