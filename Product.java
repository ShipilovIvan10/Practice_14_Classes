public class Product {
    //Поля класса
    private String id;
    private String name;
    private double price;
    private double count;

    public Product(String id, String name, double price, double count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public String toString(){
        return "Инфо о задании : ИД = " + id + ", Название = " + name + ", Цена = " + price
                + ", количество = " + count;
    }
}
