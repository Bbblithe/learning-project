/**
 * Author:  blithe.xwj
 * Date:    2020/12/8 19:51
 * Description:
 */


class Room {
    private int no;
    private String leiXing;
    private boolean zhuangTai;

    //无参构造
    public Room() {

    }

    //有参构造
    public Room(int no, String leiXing, boolean zhuangTai) {
        this.no = no;
        this.leiXing = leiXing;
        this.zhuangTai = zhuangTai;
    }

    public int getNo() {
        return no;
    }




    //set and get 方法
    public void setNo(int no) {
        this.no = no;
    }

    public String getLeiXing() {
        return leiXing;
    }

    public void setLeiXing(String leiXing) {
        this.leiXing = leiXing;
    }

    public boolean isZhuangTai() {
        return zhuangTai;
    }

    public void setZhuangTai(boolean zhuangTai) {
        this.zhuangTai = zhuangTai;
    }

    public String toString(){
        return "房间号："+no+",房间类型是："+leiXing+(zhuangTai ? "空闲":"占用");
    }

    public boolean equals(Object obj){
        if(obj==null||!(obj instanceof Room))return false;
        if(this==obj)return true;
        Room room=(Room)obj;
        return this.no==room.no;
    }
}
