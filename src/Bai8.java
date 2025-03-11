public class Bai8 {
    public static class BankAccount{
        private String accountNumber;
        private String accountHolder;
        private double balance;

        public BankAccount(String accountNumber, String accountHolder, double balance){
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }
        public double deposit(double amount){
            if(amount > 0){
                balance += amount;
                System.out.println("tài khoan cộng thêm: " + amount);
                return balance;
            }
            System.out.println("số tiền phải lớn hơn 0 ");
            return balance;
        }
        public double withdraw(double amount){
            if(amount > 0 && amount <= balance){
                balance -= amount;
                System.out.println("Rút tiền thành công: " + amount);
                return balance;
            }
            System.out.println("Số tiền phải l��n hơn 0 và nhỏ hơn hoặc bằng số dư tài khoản");
            return balance;
        }
        public double transfer (BankAccount recipient, double amount){
            if(amount > 0 && amount <= balance){
                balance -= amount;
                recipient.deposit(amount);
                System.out.println("Chuyển tiền thành công từ tài khoản " + accountNumber + " sang tài khoản " + recipient.accountNumber);
                return balance;
            }
            System.out.println("Số tiền phải lớn hơn 0 và nhỏ hơn hoặc bằng số dư tài khoản");
            return balance;
        }
        public void displayBalance (){
            System.out.println("Số dư tài khoản: " + balance);
            System.out.println("Tên chủ tài khoản: " + accountHolder);
            System.out.println("Số tài khoản: " + accountNumber);
        }
        public static void main(String[] args){
            BankAccount account1 = new BankAccount("123456789", "Bình ", 1000);
            BankAccount account2 = new BankAccount("987654321", "Vũ", 500);

            account1.displayBalance();
            account2.displayBalance();

            account1.deposit(500);
            account2.withdraw(200);

            account1.displayBalance();
            account2.displayBalance();

            account1.transfer(account2, 300);

            account1.displayBalance();
            account2.displayBalance();
        }
    }
}
