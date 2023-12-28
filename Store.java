import java.util.ArrayList;

public class Store {

    ArrayList<Product> productList;

    public Store(ArrayList<Product> productList) {
        this.productList = productList;
    }

    //Добавление
    public void addProductToStore(Product newProduct){
        this.productList.add(newProduct);
    }

    //Продажа
    public void saleProduct(Product product){
        this.productList.remove(product);
    }

    //Обновление
    public void updateProductInStore(int indexToUpdate, Product newProduct){
        this.productList.set(indexToUpdate, newProduct);
    }

    //Вывод общей стоимости всех товаров
    public double totalCost(){

        double totalCost = 0.0;

        for (Product product : this.productList){
            totalCost += product.getPrice() * product.getCount();
        }

        return totalCost;
    }

    //Вывод информации о товарах
    public void PrintProductsOfStore(){

        System.out.println("\nИнформация о товарах:");
        for (Product product : this.productList){
            System.out.println(product.toString());
        }

    }


}
