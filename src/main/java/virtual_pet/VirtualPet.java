package virtual_pet;


public class VirtualPet {
    private String catName;
    private int hunger;
    private int thirst;
    private int attention;
    private int bathroom;
    private int sleepy;


    public VirtualPet(String c) {
        catName = c;
        hunger = 1;
        thirst = 1;
        attention = 1;
        sleepy = 1;
        bathroom = 1;
    }

    public void changeHunger(int h) {
        hunger += h;
    }

    public void changeThirst(int t) {
        thirst += t;
    }

    public void changeAttention(int a) {
        attention += a;
    }

    public void changeBathroom(int b) {
        bathroom = b;
    }

    public void changeSleepy(int s) {
        sleepy += s;
    }


    public int getAttention() {
        return attention;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBathroom() {
        return bathroom;
    }

    public int getSleepy() {
        return sleepy;
    }

    public void tick() {
        hunger = 1;
        thirst = 1;
        attention = 1;
        sleepy = 1;
        bathroom = 1;
    }
}



