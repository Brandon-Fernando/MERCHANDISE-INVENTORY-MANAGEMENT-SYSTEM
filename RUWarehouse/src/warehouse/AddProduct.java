package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

        Warehouse newW = new Warehouse();
        int n = StdIn.readInt();

        for(int i = 0; i < n; i++){
            int day = StdIn.readInt();
            int id = StdIn.readInt();
            String name = StdIn.readString();
            int stock = StdIn.readInt();
            int demand = StdIn.readInt();
            newW.addProduct(id, name, stock, day, demand);
        }
        
        StdOut.println(newW);

	// Use this file to test addProduct
    }
}
