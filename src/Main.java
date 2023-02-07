import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Product ghe = new Product(1, "GHE", 100);
        Product ban = new Product(2, "BAN", 250);
        Product tivi = new Product(3, "TI VI", 356);
        Product tuLanh = new Product(4, "TU LANH", 565);
        Product amNuoc = new Product(5, "AM NUOC", 80);

        ProductManager productsList = new ProductManager();
        productsList.addProduct(ghe);
        productsList.addProduct(ban);
        productsList.addProduct(tivi);
        productsList.addProduct(tuLanh);
        productsList.addProduct(amNuoc);

        productsList.sortProductByPrice();

        for(Product p: productsList.getList()) {
            if(p == productsList.findProductByID(3)) {
                p.setProductID(6);
            }
            if(p == productsList.findProductByName("BAN")) {
                p.setProductName("BAN GO");
                System.out.println(p.getProductName());
            }
            System.out.println(p.getProductName());
        }
        productsList.sortProductByPrice();
    }
}
