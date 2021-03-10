package testhome.testforstatic;

/**
 * @description:
 * @time: 2021/3/7 21:27
 */
public class BaseClass {
    public BaseClass(){
        System.out.println("构造函数");
    }
    {
        System.out.println("构造代码块");
    }
    static{
        System.out.println("静态代码块");
    }
    public void testMethod(){
        System.out.println("普通方法");
    }
}
