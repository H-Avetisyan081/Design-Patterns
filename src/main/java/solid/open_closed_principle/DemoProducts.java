package solid.open_closed_principle;

import java.util.List;

public class DemoProducts {
    public static void main(String[] args) {
        Product coat = new Product("Coat", Color.GREEN, Size.SMALL);
        Product jacket = new Product("Jacket", Color.GREEN, Size.LARGE);
        Product suit = new Product("Suit", Color.BLUE, Size.LARGE);

        List<Product> products = List.of(coat, jacket, suit);
        ProductFilter productFilter = new ProductFilter();
        System.out.println("Green products (Old): ");
        productFilter.filterByColor(products, Color.GREEN)
                .forEach(product -> System.out.println("-" + product.name));

        BetterFilter betterFilter = new BetterFilter();
        System.out.println("Green products (New): ");
        betterFilter.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(product -> System.out.println("-" + product.name));

        System.out.println("Large blue items: ");
        betterFilter.filter(products,new AndSpecification<>(
                new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE)
        )).forEach(product -> System.out.println("-" + product.name + " is large and blue"));
    }


}
