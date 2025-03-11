public class Bai4 {
    public static class Circle{
        private double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public double getArea(){
            return Math.PI * radius * radius;
        }
        public double getPerimeter(){
            return 2 * Math.PI * radius;
        }
        public void display(){
            System.out.println("Radius: " + radius);
            System.out.println("Area: " + getArea());
            System.out.println("Perimeter: " + getPerimeter());
        }
        public static void main(String[] args) {
            Circle circle1 = new Circle(5.0);
            Circle circle2 = new Circle(3.0);
            circle1.display();
            circle2.display();
        }
    }
}
