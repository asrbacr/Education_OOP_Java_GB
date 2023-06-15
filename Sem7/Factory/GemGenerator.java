package OOP_GB_4335.Sem7.Factory;

public class GemGenerator extends iItemGenerator{
    @Override
    public iGameItem createItem(){
        return new Gem();
    }
}
