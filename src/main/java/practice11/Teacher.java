package practice11;

import java.util.LinkedList;

public class Teacher extends Person implements AssignLeaderListener, JoinClassListener {
    private LinkedList<Klass> classes = new LinkedList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klasses) {
        super(id, name, age);
        this.classes = klasses;
        for (int i = 0; i < classes.size(); i++) {
            classes.get(i).registerAssignLeaderListener(this);
            classes.get(i).registerJoinListener(this);
        }
    }


    @Override
    public String introduce() {
        if (getClasses().size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < classes.size(); i++) {
                sb.append(classes.get(i).getNumber() + ", ");
            }
            return super.introduce() + " I am a Teacher. I teach Class " + sb.substring(0, sb.length() - 2) + ".";
        }

    }

    public String introduceWith(Student student) {
        if (!getClasses().contains(student.getKlass())) {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }
    }

    public boolean isTeaching(Student student) {
        if (getClasses().contains(student.getKlass())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void sayAssignLeader(Student student, int number) {
        System.out.print("I am " + getName() + ". I know " + student.getName() + " become Leader of Class " + number + ".\n");
    }

    @Override
    public void saySomeoneJoinClass(Student student, Integer number) {
        System.out.print("I am " + getName() + ". I know " + student.getName() + " has joined Class " + number + ".\n");
    }


}
