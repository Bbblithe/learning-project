package test017;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/17 19:34
 * Description:
 */


public class CreditAccount extends Account{

    private double credit;

    public CreditAccount() {
    }

    public double getCredit(){
        return credit;
    }

    public void setCredit(double credit){
        this.credit=credit;
    }
}
