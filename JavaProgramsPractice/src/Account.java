public class Account {

    public static void main(String[] args) {

        AccountData ad = new AccountData();

        ad.setAcc_no(857938);
        ad.setName("Rohit");
        ad.setAcc_type("Savings");
        ad.setBalance(953455);


        System.out.println("*********************************************");
        System.out.println("Account No:- " +ad.getAcc_no());
        System.out.println("Account Name:- " +ad.getName());
        System.out.println("Account Type:- " +ad.getAcc_type());
        System.out.println("Account Balance:- " +ad.getBalance());
        System.out.println("**********************************************");
    }


}
