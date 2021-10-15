import java.util.ArrayList;

public class Order {
    private ArrayList<OrderLine> order;

    public Order(){
        order = new ArrayList<>();
    }

    public void addProduct(int amount, Product product){
        OrderLine toAdd = new OrderLine(amount, product);
        order.add(toAdd);
    }

    public int getNumberOfOrderLines(){
        return order.size();
    }

    public OrderLine getOrderLine(int index){
        return order.get(index);
    }

    public double getTotalPrice(){
        int totalPrice = 0;

        for(int i = 0; i < order.size(); i++){
            totalPrice += order.get(i).getPrice();
        }

        return totalPrice;
    }

    public String toString(){
        String output = "";

        for(int i = 0; i<order.size(); i++){
            output += order.get(i).toString() + ", ";
        }

        return output;
    }
}
