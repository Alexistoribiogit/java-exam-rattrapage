public class Margarita extends Cocktail {
    public Margarita() {
        List<String> MargaritaIngredients = Arrays.asList("tequila", "triple sec", "jus de citron vert");
        double MargaritaPrice = 6.0;
        Cocktail Margarita = new Cocktail(MargaritaIngredients, MargaritaPrice);
    }
}
