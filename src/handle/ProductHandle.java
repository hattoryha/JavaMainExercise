package handle;

import entity.Product;

import java.util.Scanner;

public class ProductHandle {

    public Product createProduct(Scanner scanner, int i){
        System.out.println("Mời b nhập vào tên sp thứ "+(i+1));
        String name = scanner.nextLine();
        return new Product(name);
    }

    public void displayAllProducts(Product[] products){
        for (Product p: products
             ) {
            System.out.println(p);
        }
    }

    public String findProductByName(Product[] products, String name){
        boolean check = false;
        for (Product product: products) {
            if (product.getName().equalsIgnoreCase(name)){
                System.out.println(product);
                check= true;
            }
        }
        if(!check){
            return "Không tìm thấy sản phẩm có tên là: "+name;
        }
        return "Đã tìm thấy sản phẩm r nhá";
    }

    public Product findById(Product[] products, int id){
        for (Product product: products) {
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public boolean updateProductById(Product product, String name){
        if(product == null) return false;
        else {
            product.setName(name);
            return true;
        }
    }

    public void filterByPrice(Product[] products, int option){
        for (Product p: products) {
            if(p.getPrice()<50000 && option==1) System.out.println(p);
            //else if () ToDO
        }
    }
}
