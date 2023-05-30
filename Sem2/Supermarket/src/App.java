import Classes.Market;
import Classes.OrdinaryClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour client1 = (iActorBehaviour) new OrdinaryClient("Ivan");
        iActorBehaviour client2 = (iActorBehaviour) new OrdinaryClient("Anna");
        iActorBehaviour client3 = (iActorBehaviour) new SpecialClient("Mer", 1);
        
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);
        market.acceptToMarket(new TaxService());

        market.update();

    }
}
