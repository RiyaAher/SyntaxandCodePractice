import java.util.Arrays;
import java.util.List;

class Product {
    private String name;
    private String category;
    private double price;

    public Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getCategory() { return category; }
    public double getPrice() { return price; }
}

public class StreamPractice {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", "Electronics", 1200.0),
            new Product("Java Book", "Books", 45.0),
            new Product("Smartphone", "Electronics", 800.0),
            new Product("Headphones", "Electronics", 150.0),
            new Product("Cooking Pan", "Kitchen", 60.0)
        );

        // 1. We store the final result in a 'double' variable, coz thats what we want. Every operaton under products.stream() gets assigned to averagePrice variable as double datatype.
double averagePrice = products.stream()
    // 2 & 3. Check if the SINGLE product's category equals "Electronics"
    .filter(product -> product.getCategory().equals("Electronics")) //we call 2 method here.
    // Transform the stream of Products into a stream of primitive doubles
    .mapToDouble(Product::getPrice) //:: is a shorthand for method reference. which says "Hey Stream, grab the getPrice method from the Product class and apply it to whatever item comes down the belt."
    // 4. Calculate the average (this returns an OptionalDouble)
    .average()
    // If the list was empty and there's no average, default to 0.0
    .orElse(0.0); //handling edge cases here. 

System.out.println("Average Electronics Price: $" + averagePrice);
        
    }
}