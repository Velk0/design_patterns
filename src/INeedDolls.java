public class INeedDolls implements Command{
    private MagicBoard magicBoard;


    public INeedDolls(MagicBoard magicBoard){
        this.magicBoard = magicBoard;

    }

    @Override
    public void execute() {
        this.magicBoard.MakeADoll();
    }
}
