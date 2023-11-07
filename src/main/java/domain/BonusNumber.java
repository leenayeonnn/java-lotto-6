package domain;

import static util.ErrorMessage.LOTTO_NUMBER_IS_UNIQUE;
import static util.ErrorMessage.LOTTO_NUMBER_RANGE;

import java.util.List;

public class BonusNumber {
    private int bonusNumber;

    public BonusNumber(int bonusNumber, Lotto lotto){
        this.bonusNumber = validate(bonusNumber, lotto);
    }

    private int validate(int bonusNumber, Lotto lotto){
        if(!checkValidNumberRange(bonusNumber)){
            return 0;
        }
        if(!checkNoDuplication(bonusNumber, lotto)){
            return 0;
        }
        return bonusNumber;
    }

    private boolean checkValidNumberRange(int bonusNumber){
        try{
            if(bonusNumber < 1 || bonusNumber > 45){
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException e){
            System.out.println(LOTTO_NUMBER_RANGE.get());
            return false;
        }
        return true;
    }

    private boolean checkNoDuplication(int bonusNumber, Lotto lotto){
        try{
            if (lotto.contain(bonusNumber)) {
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException e){
            System.out.println(LOTTO_NUMBER_IS_UNIQUE.get());
            return false;
        }
        return true;
    }

    public boolean isValid() {
        return bonusNumber != 0;
    }
}
