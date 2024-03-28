package Zoo;

    public class Hyena extends Animal
    {
        //Constructor
        public Hyena(String name){
            super(name);
            this.name= name;
            this.species = "hyena";
        }
        public Hyena(String name, int age)
        {
            super(name,age);
            this.name = name;
            this.age = age;
            this.species = "hyena";
        }
        public Hyena(String name, int age, String season, String color, String sex, String weight, String location, String habitat)
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
            this.species = "hyena";
            numOfAnimals--;
        }

        public void laugh()
        {
            System.out.println("giggle giggle");
        }

    }
