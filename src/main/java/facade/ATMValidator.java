package facade;

public class ATMValidator {
    private int maxWithdraw = 2000;

    public boolean checkAmount(int amount) {
        return maxWithdraw >= amount;
    }

    public boolean isCardValid(String card) {
        return card.contains("PKO") || card.contains("MBANK");
    }
}
