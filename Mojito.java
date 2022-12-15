public class Mojito extends Cocktail {

    public Mojito() {
        List<String> mojitoIngredients = Arrays.asList("rhum", "citron vert", "eau gazeuse", "menthe", "sucre");
        double mojitoPrice = 8.0;
        Cocktail mojito = new Cocktail(mojitoIngredients, mojitoPrice);
    }
}