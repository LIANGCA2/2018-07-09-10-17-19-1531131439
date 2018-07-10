package practice11;


public class Person {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String name;
    private Integer age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

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
        return "My name is " + getName() + ". I am " + getAge() + " years old.";
    }

    public String introduce() {
        return basicIntroduce();
    }

    @Override
    public boolean equals(Object obj) {

        return obj!=null && getName().equals(((Person) obj).getName()) && getAge().equals(((Person) obj).getAge()) && getId().equals(((Person) obj).getId());
    }
}
