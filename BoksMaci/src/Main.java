public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 10 , 100, 100 ,0);
        Fighter alex = new Fighter("Alex" , 10 , 100, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}