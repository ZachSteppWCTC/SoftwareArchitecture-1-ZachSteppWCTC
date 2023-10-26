package us.mattgreen;
import java.util.ArrayList;
import java.util.Scanner;

public class PetMaker{
private ArrayList<Talkable> PetList = new ArrayList<>();
    public ArrayList<Talkable> getPetList() {
        return PetList;
    }
    public PetMaker() {
        boolean active = true;
        String name;
        String sound;
        while (active) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("What is the new pet's name? : ");
            name = keyboard.nextLine();
            System.out.print("What does the pet say? : ");
            sound = keyboard.nextLine();
            System.out.print("Make another new pet? (Y / N) : ");
            if (!keyboard.nextLine().equalsIgnoreCase("Y"))
                active = false;
            String finalName = name;
            String finalSound = sound;
            PetList.add(new Talkable(){

                @Override
                public String talk() {
                    return finalSound;
                }

                @Override
                public String getName() {
                    return finalName;
                }
            });

        }
    }
}
