public class Ship {

    //health
    //location data
    private int health;
    private int size;

    private String name;

    private StateSpace stateSpace;

    public Ship(){

    }

    public Ship(int health, int size, String name) {
        this.health = health;
        this.size = size;
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //ship1.hit()
    // decrease the health
    // if the health is zero
    // if positive decrease the health by 1
    //
    public boolean hit(){
        if(health == 0){
            //zero
            System.out.println("Miss");
            return false;
        } else if (health > 0) {
           //positive
            if (health -1 > 0){
//                System.out.println("Hit");
                System.out.println("Hit");
            }else{
                System.out.printf("Killed %s%n",this.name);
                //die
            }

            health--;
            return true;
        }else{
            //negative
            System.out.println("Error, we shouldn't be here!");
            return false;
        }
    }

}
