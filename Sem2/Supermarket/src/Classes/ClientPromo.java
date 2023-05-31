package Classes;

import Interfaces.iReturnOrder;

/**
 * Класс акционного клиента 
 */
public class ClientPromo extends Actor implements iReturnOrder{

    private String promotionName;

    public ClientPromo(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMakeOrder'");
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTakeOrder'");
    }

    @Override
    public boolean isMakeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isMakeOrder'");
    }

    @Override
    public boolean isTakeOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isTakeOrder'");
    }

    @Override
    public Actor getActor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getActor'");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    @Override
    public void returnOrder() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnOrder'");
    }
    
}
