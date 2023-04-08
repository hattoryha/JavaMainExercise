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

        // find by name
        System.out.println("Mời b nhập tên sp muốn tìm: ");
        String name = scanner.nextLine();
        //productHandle.findProductByName(products, name);

        // FindByID
        System.out.println("Mời b nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = productHandle.findById(products, id);
        System.out.println(product);

        // Update sản phẩm:
        System.out.println("Mời b nhập tên sp muốn update: ");
        String nameNew = scanner.nextLine();
        boolean checkUpdate = productHandle.updateProductById(product, nameNew);
        if(checkUpdate){
            System.out.println("Update thanh công");
        } else System.out.println("Không tìm thấy sản phẩm update");

        Menu menu = new Menu();
        int option = menu.menuSelectByPrice(scanner, products);
        productHandle.filterByPrice(products, option);
    }
}
