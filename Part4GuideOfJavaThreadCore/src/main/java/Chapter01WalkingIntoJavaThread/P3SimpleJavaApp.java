/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2018/5/21 08:21
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package Chapter01WalkingIntoJavaThread;

import java.util.Date;

public class P3SimpleJavaApp {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.println(new Date());
            Thread.sleep(1000);
        }
    }
}
