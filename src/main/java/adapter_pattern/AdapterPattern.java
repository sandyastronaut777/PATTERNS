package adapter_pattern;

public class AdapterPattern {
    public static void main(String args[]) {
        CreditCard targetInterface = new BankCustomer(); //Polymorphic statement
        targetInterface.giveBankDetails();

        System.out.print(targetInterface.getCreditCard());
    }
}

