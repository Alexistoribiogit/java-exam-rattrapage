public class Server {
    private String name;
    private int totalMoney;

    public Server(String name) {
        this.name = name;
        this.totalMoney = 0;
    }

    public void ProcessOrder(Customer customer) {
        Order order = customer.getMyOrder();

        System.out.print("Serveur : Voici votre commande : ");
        for (Cocktail cocktail : order.getCocktails()) {
            System.out.print(cocktail.getName() + ", ");
        }

        Random rand = new Random();
        int randomNum = rand.nextInt(5) + 1;

        if (randomNum == 1) {
            System.out.println("C'est pour la maison !");
        } else {
            System.out.println("Cela fera " + order.getTotalAmount() + " euros s'il vous plait.");
            customer.Pay();
            if (customer.getBudget() >= 0) {
                this.totalMoney += order.getTotalAmount();
            } else {
                System.out.println("Vous n'avez pas assez d'argent pour payer, vous êtes exclu du bar.");
            }
        }
    }

    public void DisplayTotalMoney() {
        System.out.println("Ce soir, j'ai encaissé " + this.totalMoney + " euros.");
    }

    public int GetTotalMoney() {
        return this.totalMoney;
    }
}

public class Bar {
    private List<Server> servers;

    public Bar() {
        this.servers = new ArrayList<Server>();
    }

    public void AddServer(Server server) {
        this.servers.add(server);
    }

    public List<Server> GetServers() {
        return this.servers;
    }

    public void BestEmployee() {
        int maxTotalMoney = 0;
        Server bestServer = null;

        for (Server server : this.servers) {
            if (server.GetTotalMoney() > maxTotalMoney) {
                maxTotalMoney = server.GetTotalMoney();
                bestServer = server;
            }
        }

        if (bestServer != null) {
            System.out.println("Bravo, " + bestServer.getName() + " est le serveur de la soirée !");
        }
    }
}
