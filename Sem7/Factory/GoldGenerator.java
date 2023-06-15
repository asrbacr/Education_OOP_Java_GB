package OOP_GB_4335.Sem7.Factory;

public class GoldGenerator extends iItemGenerator {
  
    @Override
    public iGameItem createItem(){
        return new Gold();
    }
}
