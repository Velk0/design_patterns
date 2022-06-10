public class Dwarf implements Observer {
    private MagicBoard magicBoard;

    private Observable toy;

    public void update(){
        if(this.toy == null) {
            return;
        }
        String lastToy = this.toy.getUpdate();
        System.out.println("Dwarf: We received order for: " + lastToy);
    }

    @Override
    public void setToy(Observable toy) {
        this.toy = toy;
    }
}
