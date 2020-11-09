
package uji.coba1;


public class Game {

    public static void main(String[] args) {
        Player Yoiki = new Player();
        Yoiki.nama = "Paijo";
        Yoiki.speed = 480;
        Yoiki.healthPoin = 0;
        
        Yoiki.run();
        if (Yoiki.mati()){
        System.out.println("nungguin yah");
        }
    }

}