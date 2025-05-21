package sub4;

class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // 정사각형이므로 높이도 자동 설정
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height; // 정사각형이므로 너비도 자동 설정
    }
}

public class Ex3_LSP {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        resize(rect); // 예상: 넓이 증가

        Square square = new Square();
        resize(square); // 예상과 다르게 정사각형의 높이도 함께 증가
    }

    public static void resize(Rectangle rect) {
        rect.setWidth(5);
        rect.setHeight(10);
        System.out.println("Expected area = 50, Actual area = " + rect.getArea());
    }
}
