package virtual_pet;

public class VirtualPetApplication {
    private String catName;
    private int hunger;
    private int thirst;
    private int attention;
    private int bathroom;
    private int sleepy;




    public VirtualPetApplication(String c) {
        catName = c;
        hunger = 1;
        thirst = 1;
        attention = 1;
        sleepy = 1;
        bathroom = 1;
    }

    public void changeHunger(int h){
        hunger += h;
    }
    public void changeThirst(int t){
        thirst += t;
    }
    public void changeAttention(int a){
        attention += a;
    }
    public void changeBathroom(int b){
        bathroom = b;
    }
    public void changeSleepy(int s){
        sleepy += s;
    }

    // getter methods
    public String getCatName(){
        return catName;
    }
    public int getAttention(){
        return attention;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }
    public int getBathroom(){
        return bathroom;
    }
    public int getSleepy(){
        return sleepy;
    }
    // setter methods


    public void setAttention(int attention) {
        this.attention = attention;
    }
    public void setBathroom(int bathroom){
        this.bathroom = bathroom;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setSleepy(int sleepy) {
        this.sleepy = sleepy;
    }
    // on-tick method that will generate randomized game loop
    public void tick(){
        hunger = 1;
        thirst = 1;
        attention = 1;
        sleepy = 1;
        bathroom = 1;
    }
}
