public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        int amount = 160; // Amount to be dispensed
            atmDispenser.dispense(new Currency(amount));
        
    }
}
