package Week5;

public class CheckingAccount extends Account{
    private double credit;
    public CheckingAccount(){
        super(0,"");
        this.credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return this.credit;
    }
    public void withdraw(double a){
        if (getBalance() - a >= 0){
            this.balance = this.balance-a;
            System.out.println(a+" bath is withdraw from "+getName()+" and your credit balance is "+getCredit()+".");
        }
        else if (getBalance() - a < 0 && getBalance() - a + getCredit() > 0){
            setBalance(0);
            this.credit = this.credit - a;
            System.out.println(a+" bath is withdraw from "+getName()+" and your credit balance is "+getCredit()+".");
        }
        else{
            System.out.println("Not enough money!");
        }
    }
    public void withdraw(String a){
        this.withdraw(Double.parseDouble(a));
    }
    public String toString(){
        return "The "+getName()+" account has "+getBalance()+" baht and "+getCredit()+" credits.";
    }
}
