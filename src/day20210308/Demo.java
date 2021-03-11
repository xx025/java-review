package day20210308;

public class Demo {
    public static void main(String[] args) {
        /*
         * 现实中的狗
         * 特指某一只->对象
         * */
//        Dog erha = new Dog();
//        erha.run();
//        erha.name = "二哈";
//        erha.age = 1;
//        erha.color = "灰白色";
//        System.out.println();

        Cat cat = new Cat();
        cat.age = 2;
        cat.color = "白色";
        cat.name = "白猫";
        cat.run();
    }
}
