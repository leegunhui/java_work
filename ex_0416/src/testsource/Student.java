package testsource;

public class Student {
    
    private String name;
    private int age;

    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + "세");
    }
}

