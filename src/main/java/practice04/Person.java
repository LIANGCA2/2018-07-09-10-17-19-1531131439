package practice04;


public class Person {
    private String name;
    private Integer age;
    public Person(){

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String basicIntroduce() {
        return "My name is "+getName()+". I am "+getAge()+" years old.";
    }
    public String introduce() {
        return basicIntroduce();
    }
}
