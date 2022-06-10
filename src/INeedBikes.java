public class INeedBikes implements Command {
    private MagicBoard magicBoard;


    public INeedBikes(MagicBoard magicBoard){
        this.magicBoard = magicBoard;

    }

    @Override
    public void execute() {
        this.magicBoard.MakeABike();
    }
}
