package warehouse;

public class PurchaseProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test purchaseProduct
        Warehouse newW = new Warehouse();
        int n = StdIn.readInt();

        for(int i = 0; i < n; i++){
            String addOrPurchace = StdIn.readString();
            if(addOrPurchace.equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                newW.addProduct(id, name, stock, day, demand);
            }
            else{
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                newW.purchaseProduct(id, day, amount);
            }
        }
        StdOut.println(newW);
    }
}
