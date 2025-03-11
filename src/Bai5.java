public class Bai5 {
    public static class Vector2D{
        private double x, y;
        public Vector2D(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double calculateMagnitude(){
            return Math.sqrt(x * x + y * y);
        }
        public Vector2D add(Vector2D other){
            return new Vector2D(x + other.x, y + other.y);
        }
        public Vector2D subtract(Vector2D other){
            return new Vector2D(x - other.x, y - other.y);
        }
        public double dotProduct(Vector2D other){
            return x * other.x + y * other.y;
        }
        public void displayVector(){
            System.out.println("Vector (" + x + ", " + y + ")");

        }
        public static void main(String[] args){
            Vector2D v1 = new Vector2D(3, 4);
            Vector2D v2 = new Vector2D(6, 8);

            System.out.println("Vector 1:");
            v1.displayVector();
            System.out.println("Vector 2:");
            v2.displayVector();

            System.out.println("Magnitude of Vector 1: " + v1.calculateMagnitude());
            System.out.println("Magnitude of Vector 2: " + v2.calculateMagnitude());

            System.out.println("Dot product of Vector 1 and Vector 2: " + v1.dotProduct(v2));

            Vector2D sum = v1.add(v2);
            System.out.println("Sum of Vector 1 and Vector 2:");
            sum.displayVector();

            Vector2D diff = v1.subtract(v2);
        }
    }
}
