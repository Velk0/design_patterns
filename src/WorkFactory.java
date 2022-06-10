public abstract class WorkFactory {

    public abstract WorkProduct createToy(String Toy);

    public WorkProduct makeToy(String Toy) {
        WorkProduct product = createToy(Toy);
        product.prepare();
        return product;
    }
}
