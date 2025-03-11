public class Bai3 {
    public static class Rectangle {
        private double width;
        private double length;
        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }
        public Rectangle(){
            this(1, 1);
        }
        public double getArea() {
            return width * length;
        }
        public double getPerimeter() {
            return 2 * (width + length);
        }
        public void display(){
            System.out.println("Rectangle: ");
            System.out.println("Width: " + width);
            System.out.println("Length: " + length);
            System.out.println("Area: " + getArea());
            System.out.println("Perimeter: " + getPerimeter());
        }
        public static void main(String[] args){
            Rectangle r1 = new Rectangle(5, 3);
            r1.display();
            Rectangle r2 = new Rectangle();
            r2.display();
        }
    }
}
