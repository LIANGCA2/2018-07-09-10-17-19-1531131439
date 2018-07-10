package practice09;
public class Student  extends Person {
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id,name,age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        return super.introduce()+" I am a Student."+(klass.getLeader()!=null&&klass.getLeader().getId()==this.getId()?" I am Leader of Class ":" I am at Class ")+getKlass().getNumber()+".";
    }


    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}

