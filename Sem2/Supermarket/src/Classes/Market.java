package Classes;

import java.util.List;

import Interfases.iMarketBehaviour;
import Interfases.iQueueBehaviour;

public class Market implements iMarketBehaviour, iQueueBehaviour {

    @Override
    public void takeInQueue(Actor actor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takeInQueue'");
    }

    @Override
    public void releaseFromQueue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'releaseFromQueue'");
    }

    @Override
    public void takeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takeOrder'");
    }

    @Override
    public void giveOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'giveOrder'");
    }

    @Override
    public void acceptToMarket(Actor actor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'acceptToMarket'");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'releaseFromMarket'");
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
    
}
