package 操作系统.实验一;

/**
 * Author:  blithe.xwj
 * Date:    2021/11/26 08:53
 * Description:
 */


public class PCB {
   public String name;
   public char state;
   public int priority;
   public int nTime;
   public int rTime;
   public PCB link;

   public PCB() {
   }

   public PCB(String name, char state, int priority, int nTime, int rTime, PCB link) {
      this.name = name;
      this.state = state;
      this.priority = priority;
      this.nTime = nTime;
      this.rTime = rTime;
      this.link = link;
   }

   @Override
   public String toString() {
      return "PCB{" +
              "name='" + name + '\'' +
              ", state=" + state +
              ", priority=" + priority +
              ", nTime=" + nTime +
              ", rTime=" + rTime +
              ", link=" + link +
              '}';
   }
}
