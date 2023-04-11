package attributes.attributes.bill;

public class BillMain {

    public static void main(String[] args) {
        Item item1 = new Item("Book",4,10);
        Item item2 = new Item("Pen",10,2);
        Bill bill = new Bill();
        bill.addItem(item1);
        bill.addItem(item2);
        System.out.println(bill.calculatePrice());
    }
}
