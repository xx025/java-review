package day20210308;

public abstract class Animal {
    String name;
    int age;
    String color;

    public void run() {
        System.out.println("动物在跑");
    }

    /*          抽象方法
     *      只有方法的声明部分,并没有方法的具体实现(代码块),并加上abstract关键字
     *
     *      一个类中只要有抽象方法,这个类必须是抽象类
     *      抽象类中并不一定要有抽象方法
     *      抽象类不能够实例化
     *
     *      一个类继承自抽象类,那么这个类要么是抽象类,要么完善抽抽象方法
     * */
    public abstract void eat();

}
