package practice05;

public class Student  extends Person{
    private Integer klass;

    @Override
    public String introduce() {
        return super.introduce()+" I am a Student. I am at Class "+getKlass()+".";
    }

    public Student(String name, int age, int klass) {
        super(name,age);
        this.klass = klass;
    }

    public Integer getKlass() {
        return klass;
    }

    public void setKlass(Integer klass) {
        this.klass = klass;
    }
}
