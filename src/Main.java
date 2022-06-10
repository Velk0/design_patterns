public class Main {

    public static void main(String[] args) {

        MagicBoard magicBoard = new MagicBoard();
        Command INeedDolls = new INeedDolls(magicBoard);
        Command INeedBikes = new INeedBikes(magicBoard);

        Santa santa = Santa.getInstance();
        String ToyToMake = santa.MakeAToy();

        if(ToyToMake.equals("doll")){
            santa.setCommand(INeedDolls);
            santa.makeACommand();
        }
        if(ToyToMake.equals("bike")){
            santa.setCommand(INeedBikes);
            santa.makeACommand();
        }

    }
}
