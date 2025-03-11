public class Bai7 {
    public static class QuadraticEquation{
        private double a, b, c;
        public QuadraticEquation(double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double getDiscriminant(){
            return Math.pow(b, 2) - 4 * a * c;
        }
        public boolean hasRealRoots () {
            double discriminant = getDiscriminant();
            return discriminant >= 0;
        }
        public double getRoot1() {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        }
        public double getRoot2() {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        }
        public void display() {
            System.out.printf("Equation: %fx^2 + %fx + %f = 0%n", a, b, c);
            if (hasRealRoots()) {
                System.out.printf("Nghiệm thực: x1 = %.2f, x2 = %.2f%n", getRoot1(), getRoot2());
            } else {
                System.out.println("Vô nghiệm.");
            }
        }
        public static void main(String[] args) {
            QuadraticEquation equation = new QuadraticEquation(1, -7, 12);

            if (equation.getDiscriminant()<0) {
                System.out.println("không có nghiệm thực.");
            } else if (equation.getDiscriminant()==0){
                System.out.println("Nghiệm kép: x = " + (-equation.b / (2 * equation.a)));
                } else {
                System.out.println("Nghiệm phân biệt: x1 = " + equation.getRoot1() + ", x2 = " + equation.getRoot2());
            }
        }
    }
}
