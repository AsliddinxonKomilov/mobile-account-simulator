public class Main {
    public static void main(String[] args) {
        MobileAccount mobileAccount = new MobileAccount("Asliddinxon", 90);
        System.out.println("Egasi : " + mobileAccount.getOwnerName());
        System.out.println("Balans : " + mobileAccount.getBalance() + " $");

        mobileAccount.Deposit(15);
        System.out.println("Balans depositdan so'ng : " + mobileAccount.getBalance() + " $");
        mobileAccount.Call(10);
        System.out.println("Balans qo'ng'iroqdan so'ng : " + mobileAccount.getBalance() + " $");
        mobileAccount.sendSms(5);
        System.out.println("Balans sms dan so'ng : " + mobileAccount.getBalance() + " $");

        System.out.println("Yakuniy balans : "+ mobileAccount.getBalance() + " $");
    }
}