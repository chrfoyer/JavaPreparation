public class OrderLine {
    private int amount;
    private Product product;

    public OrderLine(int amount, Product product){
        this.amount = amount;
        this.product = product.copy();
    }

    public int getAmount(){
        return amount;
    }

    public Product getProduct(){
        return product;
    }

    public double getPrice(){
        return amount * product.getPrice();
    }

    public boolean equals(Object obj){
        if(!(obj instanceof OrderLine)){
            return false;
        }

        OrderLine other = (OrderLine)obj;

        return amount == other.amount && product.equals(other.product);
    }

    public String toString(){
    return "Amount: "+ amount +"\n" + product.toString();
    }

}
