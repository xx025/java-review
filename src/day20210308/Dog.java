package day20210308;

public class Dog {
    /*
     * 关键字: class
     * 语法: [public] class 类名{}
     * 类名的要求:大驼峰命名
     * */

    /*
     * 名字等->属性:成员变量
     * 成员变量的作用范围:整个类中的方法均可以使用
     * 行为->方法
     * */
    String name;
    int age;
    String color;

    /*
     * 行为->方法
     * 语法:[public] 返回值 方法名(参数列表) {方法体}*/
    public void run() {
        System.out.println("狗在跑");
    }

    /*
     *
     * 方法的签名:方法名称和参数列表组成的标识,再同一个类中不能有相同签名的两个方法
     * 方法的重载:方法名相同,签名不同的两个方法叫做重载
     * */
    public void run(String area) {
//        int a;
        System.out.println("狗在" + area + "跑");
    }

}
