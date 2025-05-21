package sub4;

interface Product {
    double calculatePrice();
}

/*
	새로운 상품 클래스가 추가될 때마다 calculatePrice 메서드를 수정, 이는 개방-폐쇄 원칙을 위반
*/
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
        return 0;
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
        return 0;
    }
}

class PriceCalculator {
    public double calculatePrice(Object product) {
        if (product instanceof Electronics) {
            Electronics electronics = (Electronics) product;
            return electronics.getPrice() + electronics.getPrice() * 0.1; // 전자제품 10% 추가세금
        } else if (product instanceof Clothing) {
            Clothing clothing = (Clothing) product;
            return clothing.getPrice() + clothing.getPrice() * 0.05; // 의류 5% 추가세금
        }
        return 0;
    }
}

public class Ex2_OCP {

    public static void main(String[] args) {

        Electronics electronics = new Electronics(100_000);
        Clothing clothing = new Clothing(50_000);


    }
}
