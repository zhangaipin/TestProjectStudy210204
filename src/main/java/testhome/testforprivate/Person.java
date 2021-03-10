package testhome.testforprivate;

/**
 * @description:
 * @time: 2021/3/6 14:32
 */
public class Person {
    final static int num = 15;

    private String name ="defaultname";
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>0 && name.length()<=12){
            this.name = name;
        }else {
            System.out.println("名字长度不合规定！");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age <150){
            this.age = age;
        }else{
            System.out.println("年龄数字不合规定！");
        }
    }
    public void show(){
        if(!name.equals("defaultname") && age!=0){
            System.out.println("我叫"+name+"，我今年"+age+"岁了。");
        }

    }
}
