public class RotatedTriangle {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 0; j < n-1; j++) {
            for (int k = n-1-j; k >0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
