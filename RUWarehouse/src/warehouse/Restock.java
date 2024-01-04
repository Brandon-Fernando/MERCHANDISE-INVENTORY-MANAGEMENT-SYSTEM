package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Uset his file to test restock
        Warehouse newW = new Warehouse();
        int n = StdIn.readInt();

        for(int i = 0; i < n; i++){
            String addOrRestock = StdIn.readString();
            if(addOrRestock.equals("add")){
                int day = StdIn.readInt();
                int id = StdIn.readInt();
                String name = StdIn.readString();
                int stock = StdIn.readInt();
                int demand = StdIn.readInt();
                newW.addProduct(id, name, stock, day, demand);
            }
            else{
                int id = StdIn.readInt();
                int amountR = StdIn.readInt();
                newW.restockProduct(id, amountR);
            }
        }

        StdOut.println(newW);
    }
}
