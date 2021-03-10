package testhome.testforextends;

/**
 * @description:
 * @time: 2021/3/6 11:47
 */
public class Animals {
    String staticStr = "staticStr";
    private String name;
    private int id;

    public Animals() {
        System.out.println("No Paras1");
    }
    public Animals(String name) {
        System.out.println("No Paras2");
    }

    public Animals(String myName, int myid) {
        name = myName;
        id = myid;
        System.out.println("myName"+ myName+" myid"+myid);
    }

    public void eatSomeThing(){
        System.out.println("eatSomeThing");
    }
    public void saySomeThing(){
        System.out.println("saySomeThing");
    }
}
