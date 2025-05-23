package sub4;

interface Product {
    double calculatePrice();
}

class Electronics implements Product {
    private double price;

    public Electronics(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double calculatePrice() {
        return price  + price * 0.1;
    }
}

class Clothing implements Product {
    private double price;

    public Clothing(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double calculatePrice() {
        return price  + price * 0.05;
    }
}

class PriceCalculator {
    public double calculatePrice(Product product) {
        return product.calculatePrice();
    }
}

public class Ex2_OCP {
    public static void main(String[] args) {

        Electronics electronics = new Electronics(100_000);
        Clothing clothing = new Clothing(50_000);

        PriceCalculator priceCalculator = new PriceCalculator();
        double price = priceCalculator.calculatePrice(electronics);
        System.out.println(price);

        double clothingPrice = priceCalculator.calculatePrice(clothing);
        System.out.println(clothingPrice);
    }

}