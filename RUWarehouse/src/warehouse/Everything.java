package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test all methods
        Warehouse newW = new Warehouse();
        int n = StdIn.readInt();

        for(int i = 0; i < n; i++){
            String method = StdIn.readString();
            if(method.equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                newW.addProduct(id, name, stock, day, demand);
            }
            else if(method.equals("restock")){
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                newW.restockProduct(id, amount);
            }
            else if(method.equals("purchase")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                int amount = StdIn.readInt();
                newW.purchaseProduct(id, day, amount);
            }
            else{
                int id = StdIn.readInt();
                newW.deleteProduct(id);
            }
        }
        StdOut.println(newW);
    }
}
