package Product;

public class Product {
    private String name;
    private double price;
    private double discount;

    public Product(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
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
        do {
            if (price > 0) {
                this.price = price;
            } else {
                System.out.println("Ta errado");
            }
        } while (price <= 0);

    }

    public double getDiscount(double percenual) {
        return this.price - (percenual / 100 * this.price);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
