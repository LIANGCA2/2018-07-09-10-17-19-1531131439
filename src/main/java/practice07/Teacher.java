package practice07;

public class Teacher extends Person{
    private Klass klass ;

    public Teacher(String name, int age) {
        super(name,age);
    }


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a Teacher. I teach "+(getKlass() == null?"No Class":"Class "+getKlass().getNumber())+".";
    }

    public Teacher(String name, int age, Klass klass) {
        super(name,age);
        this.klass = klass;
    }

    public String introduceWith(Student student) {
        if(student.getKlass().getNumber()!=getKlass().getNumber()){
            return super.introduce()+" I am a Teacher. I don't teach "+student.getName()+".";
        }else {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
        }
}
