package OOP_GB_4335.Sem7.Factory;

public abstract class iItemGenerator {
    
    public void openRerward(){
       
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
}
