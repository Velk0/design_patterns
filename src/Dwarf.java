public class Dwarf implements Observer {
    private MagicBoard magicBoard;

    private Observable toy;

    public void update(){
        if(this.toy == null) {
            System.out.println("No topic set");
            return;
        }
        String lastToy = this.toy.getUpdate();
        System.out.println("I received order for: " + lastToy);
    }

    @Override
    public void setToy(Observable toy) {
        this.toy = toy;
    }
}
