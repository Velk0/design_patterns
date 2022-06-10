import java.util.Scanner;

public class Santa {

    private static Santa instance;
    private Command command;

    private Santa(){

    }

    public static Santa getInstance(){
        if(instance == null) {
            instance = new Santa();
        }
        return instance;
    }

    public String MakeAToy(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello Santa, write the toy you want to be made - bike or doll");
        String ToyToMake = myObj.nextLine();

        return ToyToMake;


        //System.out.println("I want a" + ToyToMake);
    }

    public Command getCommand() {

        return command;
    }

    public void setCommand(Command command) {

        this.command = command;
    }

    public void makeACommand() {
        if(this.command == null) {
            System.out.println("No command given");
            return;
        }
        this.command.execute();
    }


}
