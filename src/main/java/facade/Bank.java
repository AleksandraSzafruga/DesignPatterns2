package facade;

import java.sql.Struct;

public class Bank {

    public boolean checkPIN(int tab[]) {
        if (tab.length == 4) {
            if (tab[0] == 1 &&
                    tab[1] == 2 &&
                    tab[2] == 3 &&
                    tab[3] == 4) {
                return true;

            }
        }
        return false;
    }

    public boolean withdrawal(String id, int amount) {
        System.out.println("Wypłacono: " + amount);
        return true;
    }
}
