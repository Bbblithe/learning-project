/**
 * Author:  blithe.xwj
 * Date:    2020/12/4 21:19
 * Description:
 */


public class MacBookPro {
    private InsertDrawable ins;

    public void MacBookPro(){

    }
    public MacBookPro(InsertDrawable ins){
        this.ins =ins;
    }

    public InsertDrawable getIns() {
        return ins;
    }

    public void setIns(InsertDrawable ins) {
        this.ins = ins;
    }

    public void chaBa(){
        ins.connect();
    }
}
