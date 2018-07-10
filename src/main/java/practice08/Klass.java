package practice08;

public class Klass {
    private Integer number;
    private Student leader;

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Klass(int number) {
        this.number = number;
    }

    public String  getDisplayName() {
        return "Class "+number;
    }

    public void assignLeader(Student student) {
        if(student.getKlass().getNumber()==getNumber()){
         leader = student;
        }
    }


}
