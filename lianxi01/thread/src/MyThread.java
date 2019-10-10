/**
 * @author ：Leo
 * @date ：Created in 2019-08-18
 * @description ：
 * @version: 1.0
 */
public class MyThread  extends Thread{
    public MyThread(String name) {
        super(name);
    }
    @Override
    public void  run(){
        for (int i = 0; i < 200; i++) {
            System.out.println(getName()+i+"正在执行");
        }
    }
}
