package indi.rocky.groovy;

/**
 * Created by luoqi3 on 2017/12/5.
 */
public class Person {
    private String name;
    private String age;
    private String birthday;

    public Person(String name,String age,String birthday){
        this.age=age;
        this.name=name;
        this.birthday=birthday;
    }

    public String toString(){
        return name+" "+age+" "+birthday;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
