public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        int amount = 14; // Amount to be dispensed

        if (amount % 2 != 0) {
            System.out.println("Amount should be in multiples of 2.");
        } else {
            atmDispenser.dispense(new Currency(amount));
        }
    }
}
