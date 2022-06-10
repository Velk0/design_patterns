public class Workshop extends WorkFactory {
    @Override
    public WorkProduct createToy(String Toy) {
        if(Toy.equals("bike")){
            return new Bike();
        }
        if(Toy.equals("doll")){
            return new Doll();
        }
        System.out.println("We can't make this toy");
        return null;
    }
}
