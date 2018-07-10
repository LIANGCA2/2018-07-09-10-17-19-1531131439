package practice04;

public class Worker extends Person{

    private  String name;
    private Integer age;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String introduce() {
        return super.introduce()+" I am a Worker. I have a job.";
    }
}
