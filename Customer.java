public class Customer {
    private int budget;

    private List<Cocktail> favoriteOrder;

    private Order myOrder;

    public Customer(int budget) {
        this.budget = budget;
        this.myOrder = new Order();
        this.favoriteOrder = new ArrayList<Cocktail>();
    }

    public int getBudget() {
        return this.budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Order getMyOrder() {
        return this.myOrder;
    }

    public void setMyOrder(Order myOrder) {
        this.myOrder = myOrder;
    }

    public List<Cocktail> getFavoriteOrder() {
        return this.favoriteOrder;
    }

    public void setFavoriteOrder(List<Cocktail> favoriteOrder) {
        this.favoriteOrder = favoriteOrder;
    }

    public List<Cocktail> BestOrder() {
        return this.favoriteOrder;
    }

    public void Pay() {
        int totalAmount = this.myOrder.getTotalAmount();

        if (this.budget >= totalAmount) {
            this.budget -= totalAmount;
            System.out.println("Paiement effectué. Il vous reste " + this.budget + " euros sur votre compte.");
        } else {
            System.out.println("Vous n'avez pas suffisamment d'argent sur votre compte pour payer cette commande.");
        }
    }

}
