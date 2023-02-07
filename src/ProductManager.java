import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private static ArrayList<Product> list = new ArrayList<Product>();

    public ArrayList<Product> getList() {
        return list;
    }

    public void addProduct(Product product) {
        list.add(product);
    }
    public void removeProduct(Product product) {
        list.remove(product);
    }
    public Product findProductByID(int productID){
        Product productFindByID = new Product();
        for(Product p: list) {
            if(productID == p.getProductID()) {
                productFindByID = p;
                break;
            }
        }
        return productFindByID;
    }
    public Product findProductByName(String productName) {
        Product productFindByName = new Product();
        for(Product p: list) {
            if(productName.compareTo(p.getProductName()) == 0) {
                productFindByName = p;
                break;
            }
        }
        return productFindByName;
    }
    public void sortProductByPrice() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) o1.getProductPrice() - (int) o2.getProductPrice();
            }
        });
    }
}
