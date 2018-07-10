package practice11;

import java.util.ArrayList;

public class Klass {
    private Integer number;
    private Student leader;
    private ArrayList memberList = new ArrayList<Student>();
    private ArrayList<Teacher> assignLeaderListenerList = new ArrayList<>();
    private ArrayList<Teacher> joinClassListener = new ArrayList<>();

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
            notifyTeacherSomeoneAssignLeader(student);
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public void notifyTeacherSomeoneAssignLeader(Student student) {
        for(int i = 0;i<assignLeaderListenerList.size();i++){
            assignLeaderListenerList.get(i).sayAssignLeader(student,this.number);
          //  (assignLeaderListenerList.get(i)).sayAssignLeader(student,this.number);
        }
    }


    public void notifyTeacherSomeoneJoinClass(Student student) {
        for(int i = 0;i<joinClassListener.size();i++){
            joinClassListener.get(i).saySomeoneJoinClass(student,this.number);
            //  (assignLeaderListenerList.get(i)).sayAssignLeader(student,this.number);
        }
    }

    public void registerJoinListener(Teacher teacher){
        joinClassListener.add(teacher);
    }
    public void appendMember(Student student) {
        student.setKlass(this);
        memberList.add(student);
        notifyTeacherSomeoneJoinClass(student);
    }

    public void registerAssignLeaderListener(Teacher teacher){
        assignLeaderListenerList.add(teacher);
    }

}
