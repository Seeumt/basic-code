package cn.itcast.day04.May220301demo;

public class Herodemo12 {
    private String name;
    private Skilldemo13 skilldemo13;

    public Herodemo12() {
    }

    public Herodemo12(String name, Skilldemo13 skilldemo13) {
        this.name = name;
        this.skilldemo13 = skilldemo13;
    }

    public void attack(){
//        System.out.println("某人叫"+name+"正在使用"+skilldemo13);
          System.out.println("某人叫"+name+"正在发动技能");
          skilldemo13.use();
          System.out.println("NB");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skilldemo13 getSkilldemo13() {
        return skilldemo13;
    }

    public void setSkilldemo13(Skilldemo13 skilldemo13) {
        this.skilldemo13 = skilldemo13;
    }
}
