package Estudante;
import Enums.Enum.Color;
import Enums.Enum.Sex;


public class Student {
    private String name;
    private int age;
    private Color color;
    private Sex sex;


//    void eating(Lunch lunch){
//        //NOSSO CÓDIGO AQUI
//    }
//    void drinking(Juice juice){
//        //NOSSO CÓDIGO AQUI
//    }
//
//    void running(){
//        //NOSSO CÓDIGO AQUI
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}

