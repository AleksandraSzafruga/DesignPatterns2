package facade;

public class ATMfacade {

    ATMValidator atmValidator = new ATMValidator();

    Bank bank = new Bank();

    public void withdrawal(String id, String card, int pin[], int amount) {

        if (atmValidator.isCardValid(card)) {

            if (atmValidator.checkAmount(amount)) {

                if (bank.checkPIN(pin)) {

                    if (bank.withdrawal(id, amount)) {
                        System.out.println("Wypłata dokonana, zapraszamy ponownie");
                    } else {
                        System.out.println("Za mało środków na koncie");
                        return;
                    }

                } else {
                    System.out.println("PIN niepoprawny");
                    return;
                }

            } else {
                System.out.println("Za duża kwota");
                return;
            }


        } else {
            System.out.println("Bankomat nie obsługuje karty");
            return;
        }


    }

}
