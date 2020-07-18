package facade;

public class Main {

    public static void main(String[] args) {

        ATMfacade facade = new ATMfacade();
        int pin[] = {1, 2, 3, 4};
        facade.withdrawal("4321", "PKO", pin, 1000);

    }

}
