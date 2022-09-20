package solid.open_closed_principle;

public class ColorSpecification implements  Specification<Product>{
    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean IsSatisfied(Product item) {
        return item.color==color;
    }
}
