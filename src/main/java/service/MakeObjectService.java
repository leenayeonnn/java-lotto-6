package service;

import domain.Amount;
import domain.Lotto;
import domain.Lottos;

public class MakeObjectService {

    public static Amount amount(int input) {
        return new Amount(input);
    }

    public static Lottos lottos() {
        return new Lottos();
    }

    public static Lotto lotto() {
        return new Lotto();
    }
}
