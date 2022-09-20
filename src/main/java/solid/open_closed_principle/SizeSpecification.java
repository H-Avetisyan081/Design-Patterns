package solid.open_closed_principle;

public class SizeSpecification implements Specification<Product>{
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean IsSatisfied(Product item) {
        return item.size==size;
    }
}
