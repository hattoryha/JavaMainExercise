import entity.Product;
import handle.ProductHandle;
import view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductHandle productHandle = new ProductHandle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập số lượng sản phẩm muốn tạo ra: ");
        int n = Integer.parseInt(scanner.nextLine());
        Product[] products = new Product[n];

        // Create products and add to array
        for (int i = 0; i < n; i++) {
            Product product = productHandle.createProduct(scanner, i);
            products[i] = product;
        }

        //Display all products
        productHandle.displayAllProducts(products);

        // sort by price
        productHandle.sortByPrice(products);
    }
}
