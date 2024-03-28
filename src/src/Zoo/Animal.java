package Zoo;

import java.math.*;

public class Animal
{
    String name;
    int age;
    String birthDate;
    String species;
    String color;
    String weight;
    String habitat;
    String season;
    String id;
    String sex;
    String location;

    protected static int numOfAnimals = 0;
    public static int numOfAnimals()

    {
        return numOfAnimals;
    }
    public Animal(){
        numOfAnimals++;
    }
    //Constructor
    public Animal(String name)
    {
        this.name = name;
        numOfAnimals++;
    }
    //Constructor
    public Animal(String name, int age, String species, String season, String color, String sex, String weight, String location, String habitat)
    {
        this.name = name;
        this.age = age;
        this.species = species;
        this.season = season;
        this.color = color;
        this.sex = sex;
        this.weight = weight;
        this.location = location;
        this.habitat = habitat;
        numOfAnimals++;
    }
    public Animal(String name, int age, String season, String color, String sex, String weight, String location, String habitat)
    {
        this.name = name;
        this.age = age;
        this.season = season;
        this.color = color;
        this.sex = sex;
        this.weight = weight;
        this.location = location;
        this.habitat = habitat;
        numOfAnimals++;
    }
    //Primary Constructor
    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
        numOfAnimals++;
    }
    //Getters
    public void setUniqueID(String id)
    {
        this.id = id;
    }
    public void setAge(int age)
{
    this.age = age;
}
    public void setName(String name){
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public String getSpecies()
    {
        return this.species;
    }
    public int getAge(){
        return this.age;
    }
    //Setters
    public String getSeason(){return this.season;}
    public String getColor(){return this.color;}
    public String getWeight(){return this.weight;}
    public String getSex(){return this.sex;}
    public String getBirthDate(){return this.birthDate;}
    public String getHabitat (){return this.habitat;}
    public String getLocation(){return this.location;}


    public void setSpecies(String species)
    {
        this.species = species;
    }
    public void genBirthDay()
    {
        int month;
        int day;
        int year;
        String strmonth = "";
        String strday;
        month = (int) (Math.random() * 3) + 1;

        //randomly generates a month of birth
        if(season.equals("unknown"))
        {
            this.birthDate = ("unknown birth date. predicted age: " + this.age);
            return;
        }
        switch (season)
        {
            case "winter":
                strmonth = switch (month) {
                    case 1 -> "01";
                    case 2 -> "02";
                    case 3 -> "12";
                    default -> strmonth;
                };
                break;
            //layout functions the same as ^above^
            case "spring":
                switch (month)
                {
                    case 1:
                        strmonth = "03";
                        break;
                    case 2:
                        strmonth = "04";
                        break;
                    case 3:
                        strmonth = "05";
                        break;
                }
                break;

            case "summer":
                strmonth = switch (month) {
                    case 1 -> "06";
                    case 2 -> "07";
                    case 3 -> "08";
                    default -> strmonth;
                };
                break;
            case "fall":
                strmonth = switch (month) {
                    case 1 -> "09";
                    case 2 -> "10";
                    case 3 -> "11";
                    default -> strmonth;
                };
                break;


        }
        //randomly generates a day for months with 31 days
        if(strmonth.equals("01") || strmonth.equals("03") || strmonth.equals("05")|| strmonth.equals("07")||strmonth.equals("08")||strmonth.equals("10")||strmonth.equals("12"))
        {
            day = (int) (Math.random()*31)+1;
            if (day < 10)
            {
                strday = "0" + day;
            }
            else
            {
                strday = "" + day;
            }
        }
        //randomly generates a day for months with 30 days
        if(strmonth.equals("04") || strmonth.equals("06") || strmonth.equals("09") || strmonth.equals("11"))
        {
            day = (int) (Math.random()*30)+1;
            if (day < 10)
            {
                strday = "0" + day;
            }
            else
            {
                strday = "" + day;
            }
        }
        //randomly generates a day for months with 29 days
        else
        {
            day = (int) (Math.random()*29)+1;
            if (day < 10)
            {
                strday = "0" + day;
            }
            else
            {
                strday = "" + day;
            }
        }
        year = 2024 - this.age;

        this.birthDate = ("birth date: "+year + "-" + strmonth + "-" + strday);
    }

    public String getUniqueId()
    {
        return this.id;
    }

}

