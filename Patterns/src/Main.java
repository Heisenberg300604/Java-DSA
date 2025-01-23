public class Main {
    public static void main(String[] args) {
        System.out.println("Let's Print Pattern ! ");
        pattern2(4);
    }
    // Refer to this link - https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = n; row <=1 ; row--) {
            for (int col = 0; col <n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}