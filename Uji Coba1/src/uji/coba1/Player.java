
package uji.coba1;


public class Player {
   
    String nama;
    int speed;
    int healthPoin;
    
    void run() {
        System.out.println(nama +" mumbul...");
        System.out.println("speed; "+ speed);
    }
    
    boolean mati(){
    if (healthPoin <= 0) return true;
    return false;
    }
    


}