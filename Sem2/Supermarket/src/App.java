import Classes.Actor;
import Classes.ClientPromo;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Ivan");
        iActorBehaviour client2 = new OrdinaryClient("Anna");
        iActorBehaviour client3 = new SpecialClient("Mer", 1);
        ClientPromo client4 = new ClientPromo("Zina", 3);

        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(client4);
        market.acceptToMarket(new TaxService());
        
        client4.purchasceReturn(client4);

        market.update();

    }
}
