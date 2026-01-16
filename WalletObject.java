// This is the object
class Wallet {

    String owner;
    int price;

    // Constructor
    Wallet(String owner, int price) {
        this.owner = owner;
        this.price = price;
    }

}

public class WalletObject {
    public static void main(String[] args) {
        
        Wallet cab = new Wallet("Allysa", 300);

        System.out.println("Owner of Wallet: ");
        System.out.println(cab.owner);
        System.out.println("Price of Wallet: ");
        System.out.println(cab.price);
        
    }
}