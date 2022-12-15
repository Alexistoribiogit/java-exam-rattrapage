public class Order {
    private List<Cocktail> cocktailList;
    private double totalPrice;

    public Order() {
        this.cocktailList = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addCocktail(Cocktail cocktail) {
        this.cocktailList.add(cocktail);
        this.totalPrice += cocktail.getPrice();
    }
}
