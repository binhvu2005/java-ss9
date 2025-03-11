public class Bai6 {
    public static class Point2D{
        private double x;
        private double y;
        public Point2D(double x, double y) {
            this.x = x;
            this.y = y;
        }
        private double getX () {
            return x;
        }
        private double getY () {
            return y;
        }
        public double distance(Point2D other) {
            double dx = x - other.x;
            double dy = y - other.y;
            return Math.sqrt(dx*dx + dy*dy);
        }
        public void displayPoint(){
            System.out.println("Point (" + x + "," + y + ")");

        }
        public static void main(String[] args) {
            Point2D p1 = new Point2D(4, 6);
            Point2D p2 = new Point2D(10, 12);
            double distance = p1.distance(p2);
            System.out.println("Distance between p1 and p2: " + distance);
            p1.displayPoint();
            p2.displayPoint();
        }
    }
}
