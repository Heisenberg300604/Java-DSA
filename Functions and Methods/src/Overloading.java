

public class Overloading {
    public static void main(String[] args) {
        sample(5);
        sample("Heisenberg");
    }

    static void sample(int x){
        System.out.println(x);
    }

    static void sample(String name){
        System.out.println(name);
    }
}

// In function overloading we have same function name same return type but we have different type of argument..
