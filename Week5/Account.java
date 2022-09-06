package Week5;

public class Account {
    protected double balance;
    protected String name;
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double a){
        if (a > 0){
            this.balance = this.balance+a;
            System.out.println(a+" baht is deposited to "+getName()+".");
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a){
        if (a > 0){
            this.balance = this.balance-a;
            System.out.println(a+" baht is withdraw from "+getName()+".");
        }
        else if(this.balance - a < 0){
            System.out.println("Not enough money!");
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    } 
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void showAccount(){
        System.out.println(this.name+" account has "+this.balance+" baht.");
    }
    public static void main(String[] args) {
        CheckingAccount a1 = new CheckingAccount(1000,"62070033",500);
 Customer c1 = new Customer();
 Customer c2 = new Customer("Harry","Potter");
 Customer c3 = new Customer("Harry","Potter",a1);

 System.out.println(c2);
 System.out.println(c3);
     }
}    

