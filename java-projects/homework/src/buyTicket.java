/**
 * Author:  blithe.xwj
 * Date:    2021/1/11 08:34
 * Description:
 */


class buyTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        for(int i = 0 ; i < 1000 ; i++ ){
            new MyMachine(ticket).start();
        }
    }
}

class MyMachine extends Thread{
    Ticket ticket ;
    public  MyMachine(Ticket ticket){
        this.ticket = ticket;
    }

    public void run(){
        ticket.buy(1);
    }
}

class Ticket{
    int no;
    public Ticket(){
        this.no = 100;
    }

    public Ticket(int no){
        this.no = no;
    }

    public void setNo(int no){
        this.no = no;
    }

    public int getNo(){
        return no;
    }

    public synchronized void buy(int num){
        // 买之前是这个实例变量数量本身没变的属性100（默认构造方法是给的100）
        if(no > 0) {
            int before = this.getNo();

            // 买票之后则是 原先的数量 - 你买的的数量和
            int after = before - num;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 更新这个Ticket的no数量。
            this.setNo(after);
            System.out.println("恭喜你，购票成功，机器中还剩余"+this.getNo()+"张");
        } else {
            System.out.println("不好意思，票已经订光");
            return;
        }
    }
}