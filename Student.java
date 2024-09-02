package Tset01;

public class Student {
    private String name;
    private Integer age;
    private String sex;
    private String id;

    public Student(String name, Integer age, String sex, String id) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
    }

    @Override
    public String toString() {
        return  name+"\t\t"+age+"\t\t"+sex+"\t\t"+id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
