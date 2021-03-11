package day20210308;

public class Cat extends Animal {


    /*
     *       Java中是单继承的
     *
     * */


    String name;
    int age;
    String color;

    /*
     *           重写
     *   存在于父子类中,方法的签名相同的两个方法,就是重写
     * */
    public void run() {
        System.out.println("猫在跑");
    }

    @Override
    public void eat() {

    }
}

