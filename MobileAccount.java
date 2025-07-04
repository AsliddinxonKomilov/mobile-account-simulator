public class MobileAccount {
    private String ownerName;
    private double balance;
    public MobileAccount(String ownerName,double balance){
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void Deposit(double amount){
        if(amount>0){
            balance += amount;
        } else {
            System.out.println("Pul miqdori noto'g'ri");
        }
    }
    public void Withdraw(double amount){
        if(amount>0 &&  amount<=balance){
            balance -= amount;
        } else {
            System.out.println("Pul miqdori noto'g'ri yoki yetarli mablag' yo'q");
        }
    }
    public void Call(double duration){
        double cost = duration * 0.5;
        if(cost<=balance){
            balance -= cost;
            System.out.println("Qo'ng'iroq amalga oshirildi.Hisobdan : " + cost + " $ yechildi");
        } else {
            System.out.println("Balansingizda yetarli mablag' yo'q");
        }
    }
    public void sendSms(int count){
        double cost = count * 0.1;
        if(cost<=balance){
            balance -= cost;
            System.out.println(count + " ta sms yuborildi.Hisobdan : " + cost + " $ yechildi");
        } else {
            System.out.println("Balansda yetarli mablag' mavjud emas sms yuborishga");
        }
    }
}