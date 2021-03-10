package testhome.testforextends;

/**
 * @description:
 * @time: 2021/3/6 11:52
 */
public class Penguin extends Animals {


    public Penguin(){
        System.out.println("Penguin_Method");
    }

    @Override
    public void saySomeThing(){
        System.out.println("1111111");
    }

    public static void main(String[] args) {
//        System.out.println();
//        Penguin penguin = new Penguin();
//        penguin.eatSomeThing();
//        penguin.saySomeThing();
    }
}
