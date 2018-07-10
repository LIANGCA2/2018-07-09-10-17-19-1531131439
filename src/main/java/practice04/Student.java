package practice04;


public class Student extends Person {
    private String name;
    private Integer age;
    private Integer klass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Student(String name, int age, int klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }


    public String introduce() {
        return super.introduce()+" I am a Student. I am at Class "+getKlass()+".";
    }
}
