/***********************************************************
 * @Description : 验证线程具有随机性
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2018/3/18 下午1:35
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter1basic;

public class P6Test {
    public static void main(String[] args) {
        P6MyThread myThread = new P6MyThread();
        myThread.setName("myThread");
        myThread.start();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("running thread : " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
