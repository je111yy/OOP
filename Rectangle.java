class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);

        System.out.println("Area of rectangle: " + rect1.calculateArea());
        System.out.println("Perimeter of rectangle: " + rect1.calculatePerimeter());
    }
}
