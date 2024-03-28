import Zoo.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File animalNames = new File("C:\\Users\\Nolan\\IdeaProjects\\Module 06\\src\\animalNames.txt");
        File arrivingAnimals = new File("C:\\Users\\Nolan\\IdeaProjects\\Module 06\\src\\arrivingAnimals.txt");
        File newAnimals = new File("C:\\Users\\Nolan\\IdeaProjects\\Module 06\\src\\zooPopulation.txt");

        //Keep track of amount of each species
        HashMap<String, Integer> Bears = new HashMap<>();
        HashMap<String, Integer> Hyenas = new HashMap<>();
        HashMap<String, Integer> Lions = new HashMap<>();
        HashMap<String, Integer> Tigers = new HashMap<>();
        Bears.put("Bears", 0);
        Hyenas.put("Hyenas", 0);
        Lions.put("Lions", 0);
        Tigers.put("Tigers", 0);
        //ArrayLists Storing animal instances
        ArrayList<Animal> animalList = new ArrayList<>();
        //local variables
        String species;
        int age;
        String season;

        //Read and parse information from arrivingAnimals.txt
        try (Scanner animalIn = new Scanner(arrivingAnimals))
        {
            while (animalIn.hasNextLine())
            {
                String line = animalIn.nextLine();

                //Age is in the first element of the array named parts
                String[] parts = line.split(", ");
                //Check if the line has at least 1 part
                if (parts.length >= 1)
                {
                    String ageAndSpecies = parts[0];
                    //Get age out of 'ageAndSpecies'
                    String[] theParts = ageAndSpecies.split(" ");
                    age = Integer.parseInt(theParts[0]);
                    species = theParts[4];

                    //Get sex out of String[] parts
                    String sex;
                    if(ageAndSpecies.contains("male"))
                    {
                        sex = "male";
                    }
                    else
                    {
                        sex = "female";
                    }

                    //get birth season out of String[] parts
                    String birthSeason = parts[1];
                    if(birthSeason.contains("spring"))
                    {
                        season = "spring";
                    }
                    else if (birthSeason.contains("fall")) {
                        season = "fall";
                    }
                    else if (birthSeason.contains("winter")) {
                        season = "winter";
                    }
                    else if (birthSeason.contains("summer"))
                    {
                        season = "summer";
                    }
                    else
                    {
                        season = "unknown";
                    }

                    //get color out of String[] parts
                    String color = parts[2];

                    //get weight out of String[] parts
                    String part = parts[3];
                    String weight = part;

                    //get location out of String[] parts
                    part = parts[4];
                    String location = part;

                    //get habitat out of String[] parts
                    part = parts[5];
                    String habitat = part;


                    //Create a new animal object.
                    Animal myAnimal = new Animal("name needed", age, species, season, color, sex, weight, location, habitat);

                    //Add the new Animal to the ArrayList of Animals
                    animalList.add(myAnimal);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        //Scan names from animalNames.txt
        try (Scanner nameIn = new Scanner(animalNames)) {
            int j = 0;
            //Check to see of nameIn has anything in the nextLine
            while(nameIn.hasNext())
            {
                //Checks if names has "names" in it
                String names = nameIn.nextLine();
                while (names.isEmpty() || names.contains(":"))
                {
                    names = nameIn.nextLine();
                }
                //Creates a String[] array containing the names
                String[] nameParts = names.split(", ");
                //Replaces the names of the objects in the animalList ArrayList
                for (int i = 0; i < nameParts.length; i++)
                {
                    Animal myAnimal = animalList.get(j);
                    myAnimal.setName(nameParts[i]);
                    animalList.set(j,myAnimal);
                    j++;
                }
            }
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found");
            e.printStackTrace();
            //==============================================================================
        }

        //goes through each animal in ArrayList<Animal> animalList
        for(int i = 0; i < animalList.size(); i++)
        {
            //creates full date of birth.
            //generate ID
            //changes the Class of an Animal to match its species
            switch (animalList.get(i).getSpecies()) {
                case "hyena" -> {
                    Hyena animal = new Hyena(animalList.get(i).getName(), animalList.get(i).getAge(),animalList.get(i).getSeason(),animalList.get(i).getColor(),animalList.get(i).getSex(),animalList.get(i).getWeight(),animalList.get(i).getLocation(),animalList.get(i).getHabitat());
                    animalList.set(i, animal);
                    Hyenas.replace("Hyenas",Hyenas.get("Hyenas") + 1);
                    int x = Hyenas.get("Hyenas");
                    if(x < 10)
                    {
                        animalList.get(i).setUniqueID("Hy0" + x);
                    }
                    else
                    {
                        animalList.get(i).setUniqueID("Hy" + x);
                    }
                }
                case "bear" -> {
                    Bear animal = new Bear(animalList.get(i).getName(), animalList.get(i).getAge(),animalList.get(i).getSeason(),animalList.get(i).getColor(),animalList.get(i).getSex(),animalList.get(i).getWeight(),animalList.get(i).getLocation(),animalList.get(i).getHabitat());
                    animalList.set(i, animal);
                    Bears.replace("Bears",Bears.get("Bears") + 1);
                    int x = Bears.get("Bears");
                    if(x < 10)
                    {
                        animalList.get(i).setUniqueID("Be0" + x);
                    }
                    else
                    {
                        animalList.get(i).setUniqueID("Be" + x);
                    }
                }
                case "lion" -> {
                    Lion animal = new Lion(animalList.get(i).getName(), animalList.get(i).getAge(),animalList.get(i).getSeason(),animalList.get(i).getColor(),animalList.get(i).getSex(),animalList.get(i).getWeight(),animalList.get(i).getLocation(),animalList.get(i).getHabitat());
                    animalList.set(i, animal);
                    Lions.replace("Lions",Lions.get("Lions") + 1);
                    int x = Lions.get("Lions") ;
                    if(x < 10)
                    {
                        animalList.get(i).setUniqueID("Li0" + x);
                    }
                    else
                    {
                        animalList.get(i).setUniqueID("Li" + x);
                    }
                }
                case "tiger" -> {
                    Tiger animal = new Tiger(animalList.get(i).getName(), animalList.get(i).getAge(),animalList.get(i).getSeason(),animalList.get(i).getColor(),animalList.get(i).getSex(),animalList.get(i).getWeight(),animalList.get(i).getLocation(),animalList.get(i).getHabitat());
                    animalList.set(i, animal);
                    Tigers.replace("Tigers",Tigers.get("Tigers") + 1);
                    int x = Tigers.get("Tigers") ;
                    if(x < 10)
                    {
                        animalList.get(i).setUniqueID("Ti0" + x);
                    }
                    else
                    {
                        animalList.get(i).setUniqueID("Ti" + x);
                    }
                }

            }
            animalList.get(i).genBirthDay();
        }
        //Writing to zooPopulation.txt
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(newAnimals));

            writer.write("Welcome to the zoo! We have "+ Animal.numOfAnimals() +  " new animals!\n");
            writer.write("We have " + Hyenas.get("Hyenas") + " Hyenas, " + Lions.get("Lions") + " Lions, " + Tigers.get("Tigers") +" Tigers, and " + Bears.get("Bears") + " Bears.\n");
            writer.newLine();
            //Writes about each animal
            writer.write("Hyena Habitat:\n");
            for (Animal animal : animalList) {
                if (animal.getClass() == Hyena.class) {
                    writer.write(animal.getUniqueId() + "; " + animal.getName() + "; " + animal.getBirthDate() + "; " + animal.getColor() + "; " + animal.getSex() + "; " + animal.getWeight() + "; " + animal.getLocation() + ", " + animal.getHabitat() + "; Arrived 2024-03-27" + "\n");
                }
            }
            writer.newLine();
            writer.write("Bear Habitat:\n");
            for (Animal animal : animalList) {
                if (animal.getClass() == Bear.class) {
                    writer.write(animal.getUniqueId() + "; " + animal.getName() + "; " + animal.getBirthDate() + "; " + animal.getColor() + "; " + animal.getSex() + "; " + animal.getWeight() + "; " + animal.getLocation() + ", " + animal.getHabitat() + "; Arrived 2024-03-27" + "\n");
                }
            }
            writer.newLine();
            writer.write("Tiger Habitat:\n");
            //Works the same as the above
            for(int i = 0; i < animalList.size(); i++)
            {
                if (animalList.get(i).getClass() == Tiger.class)
                {
                    writer.write(animalList.get(i).getUniqueId() + "; " + animalList.get(i).getName() + "; " + animalList.get(i).getBirthDate() + "; " + animalList.get(i).getColor() + "; " + animalList.get(i).getSex() + "; " +animalList.get(i).getWeight() + "; " + animalList.get(i).getLocation() + ", " + animalList.get(i).getHabitat() + "; Arrived 2024-03-27" + "\n");
                }
            }
            writer.newLine();
            writer.write("Lion Habitat:\n");
            for (Animal animal : animalList) {
                if (animal.getClass() == Lion.class) {
                    writer.write(animal.getUniqueId() + "; " + animal.getName() + "; " + animal.getBirthDate() + "; " + animal.getColor() + "; " + animal.getSex() + "; " + animal.getWeight() + "; " + animal.getLocation() + ", " + animal.getHabitat() + "; Arrived 2024-03-27" + "\n");
                }
            }
            writer.newLine();


            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Check the zooPopulation.txt file");
    }

}
