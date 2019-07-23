package B.Jun04demo01;



/**
 *枚举默认的构造方法：
 * protected Enum（String name,int ordinal）
 * 此构造方法不能被外部方法直接调用，只能
 * 被其子类访问，此构造方法为自动调用
 *
 *
 */
public enum Color implements info{
    RED("red"),
    GREEN(),
    BLUE("blue"),
    //protected Enum（String name,int ordinal）
    //每一个都代表着枚举的实例（对象）
    //枚举类型的对象一定是在枚举类型内部定义的
    ;

    private String color;


    private Color(){
        System.out.println("无参构造方法");
    }

    private Color(String color){
        this.color=color;
        System.out.println("有参构造方法");
    }

    @Override
    public String getColor() {
        return color;
    }


}
