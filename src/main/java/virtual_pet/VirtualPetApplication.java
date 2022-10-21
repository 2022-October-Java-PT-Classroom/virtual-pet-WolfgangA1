package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {


    public static void main(String[] args) {
        //Interact with a virtual_pet.VirtualPet object in this method
        int select;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your cats name?");
        String catName = input.nextLine();

        VirtualPet cat = new VirtualPet(catName);

        needsMenu(catName);

        do {
            System.out.println("What would you like to do today?");
            System.out.println("Press 1 to give " + catName + " pets");
            System.out.println("Press 2 to feed " + catName + " favorite treats");
            System.out.println("Press 3 to nap " + catName + " cuddle");
            System.out.println("Press 4 to give water to " + catName);
            System.out.println("Press 5 to let " + catName + " use litter box");
            System.out.println("Press 6 to quit.");

            select = input.nextInt();

            if (select == 6) {
                continue;
            } else if (select == 1) {
                if (cat.getAttention() > 5) {
                    System.out.println(catName + " doesn't want attention right now");
                    continue;
                }
                System.out.println(catName + " starts to purrrr!");
                cat.changeAttention(+1);
                cat.changeHunger(-1);
                cat.changeThirst(-1);
                cat.changeSleepy(-1);
                showCatCurrentNeeds(cat);
            } else if (select == 2) {
                if (cat.getHunger() > 5) {
                    System.out.println(catName + " walks away from the treats");
                    continue;
                }
                System.out.println(catName + " they plop down from being fed");
                cat.changeThirst(-1);
                cat.changeSleepy(-1);
                cat.changeBathroom(-1);
                cat.changeAttention(+1);
                showCatCurrentNeeds(cat);
            } else if (select == 3) {
                if (cat.getSleepy() > 5) {
                    System.out.println(catName + " gets angry");
                    continue;
                }
                System.out.println(catName + " meows and curls in a ball");
                cat.changeSleepy(+1);
                cat.changeBathroom(-1);
                cat.changeHunger(-1);
                cat.changeThirst(-1);
                showCatCurrentNeeds(cat);
            } else if (select == 4) {
                if (cat.getThirst() > 5) {
                    System.out.println(" Walks away from water bowl, not interested");
                    continue;
                }
                System.out.println(catName + " enjoys the water");
                cat.changeThirst(+1);
                cat.changeBathroom(-1);
                cat.changeHunger(0);
                showCatCurrentNeeds(cat);
            } else if (select == 5) {
                if (cat.getBathroom() > 5) {
                    System.out.println(catName + "");
                    continue;
                }
                System.out.println(catName + " had to go really bad");
                cat.changeBathroom(+1);
                cat.changeHunger(-1);
                cat.changeSleepy(0);
                showCatCurrentNeeds(cat);
            } else {
                System.out.println("You need to choose something to do with " + catName);
            }
            cat.tick();


        } while (select != 6);

    }

    private static void showCatCurrentNeeds(VirtualPet cat) {
        System.out.println("Attention: " + cat.getAttention());
        System.out.println("Thirst: " + cat.getThirst());
        System.out.println("Bathroom: " + cat.getBathroom());
        System.out.println("Hunger:" + cat.getHunger());
        System.out.println("Sleepy: " + cat.getSleepy());
    }

    public static void needsMenu(String catName) {

    }
}