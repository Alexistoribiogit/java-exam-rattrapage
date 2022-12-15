public class PiñaColada extends Cocktail {
    public PiñaColada() {
        List<String> PiñaColadaIngredients = Arrays.asList("rhum blanc", "rhum ambré", "jus d'ananas", "lait de coco");
        double PiñaColadaPrice = 7.0;
        Cocktail PiñaColada = new Cocktail(PiñaColadaIngredients, PiñaColadaPrice);
    }
}