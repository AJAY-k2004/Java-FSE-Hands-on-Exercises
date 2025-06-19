public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Chair", "Furniture"),
            new Product(150, "Book", "Education")
        };

        // Linear search
        Product foundLinear = LinearSearch.searchById(products, 150);
        System.out.println("Linear Search Found: " + foundLinear);

        // Sort and binary search
        BinarySearch.sortProductsById(products);
        Product foundBinary = BinarySearch.searchById(products, 150);
        System.out.println("Binary Search Found: " + foundBinary);
    }
}
