public class Bai9 {
    public static class Fraction{
        int numerator;
        int denominator;
        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        public Fraction add(Fraction other){
            int newNumerator = numerator * other.denominator + denominator * other.numerator;
            int newDenominator = denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }
        public Fraction subtract(Fraction other){
            int newNumerator = numerator * other.denominator - denominator * other.numerator;
            int newDenominator = denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }
        public Fraction multiply(Fraction other){
            int newNumerator = numerator * other.numerator;
            int newDenominator = denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }
        public Fraction divide(Fraction other){
            int newNumerator = numerator * other.denominator;
            int newDenominator = denominator * other.numerator;
            return new Fraction(newNumerator, newDenominator);
        }
        public Fraction simplify (){
            int gcd = gcd(numerator, denominator);
            return new Fraction(numerator / gcd, denominator / gcd);
        }
        private static int gcd(int a, int b){
            if(b == 0) return a;
            return gcd(b, a % b);
        }
        public String toString(){
            return numerator + "/" + denominator;
        }

        public static void main(String[] args) {
            Fraction frac1 = new Fraction(1, 2);
            Fraction frac2 = new Fraction(2, 3);

            Fraction sum = frac1.add(frac2).simplify();
            Fraction difference = frac1.subtract(frac2).simplify();
            Fraction product = frac1.multiply(frac2).simplify();
            Fraction quotient = frac1.divide(frac2).simplify();

            System.out.println("Fraction 1: " + frac1);
            System.out.println("Fraction 2: " + frac2);

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
        }
    }
}
