package Zoo;

public class Tiger extends Animal
{
    //Constructor
    public Tiger(String name){
        super(name);
        this.name= name;
        this.species = "tiger";
    }
    public Tiger(String name, int age)
    {
        super(name,age);
        this.name = name;
        this.age = age;
        this.species = "tiger";
    }
    public Tiger(String name, int age, String season, String color, String sex, String weight, String location, String habitat)
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
        this.species = "tiger";
    }
    public void growl(){
        System.out.println("grrrrrr");
    }
}
