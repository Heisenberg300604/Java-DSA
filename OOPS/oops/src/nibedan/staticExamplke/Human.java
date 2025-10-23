package nibedan.staticExamplke;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static int population ;

    public Human(int salary, int age, String name, boolean married) {
        this.salary = salary;
        this.age = age;
        this.name = name;
        this.married = married;
        Human.population +=1;
    }
}
