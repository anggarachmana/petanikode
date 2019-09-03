package dasar;

public class Player {
    // definisi atribut
    String name;
    int speed;
    int healthPoin;

    // definisi method run
    void run() {
        System.out.println(name + "is runnning...");
        System.out.println("Speed: " + speed);
    }

    // definisi method untuk mengecek nilai kesehatan (healthpoin)
    boolean isDead() {
        if(healthPoin <= 0) return true;
        return false;
    }
}
