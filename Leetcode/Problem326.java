class Problem326{

    public boolean isPowerOfThree(int n) {
        return n>0 && 1162261467 % n == 0;
    }

    public boolean anotherApproach(int n){
        while (n>0) {
            if (n%3==0){
                n = n/3;
            }
            else{
                break;
            }
        }
        return n == 1;
    }
    public static void main(String[] args) {
        Problem326 problem326 = new Problem326();
        System.out.println(problem326.isPowerOfThree(27)); // true
        System.out.println(problem326.isPowerOfThree(0)); // false
        System.out.println(problem326.isPowerOfThree(9)); // true
        System.out.println(problem326.isPowerOfThree(45)); // false

        // Lets try with for loop

        System.out.println(problem326.anotherApproach(27)); // true


        // How did we solve this problem?
        // We can use the fact that 3^19 = 1162261467, which is the largest power of 3 that fits in an int.
        // So we can check if n is a divisor of 1162261467. If it is, then n is a power of 3.
        // This is because if n is a power of 3, then it can be expressed as 3^k for some integer k.
        // So we can check if 1162261467 % n == 0. If it is, then n is a power of 3.
        // This solution has a time complexity of O(1) and a space complexity of O(1).
        // We can also use a loop to check if n is a power of 3.
        // We can keep dividing n by 3 until n is less than or equal to 1.
        // If n is equal to 1, then it is a power of 3. If n is less than 1, then it is not a power of 3.
        // This solution has a time complexity of O(log n) and a space complexity of O(1).
        // We can also use recursion to check if n is a power of 3.
        // We can check if n is equal to 1. If it is, then it is a power of 3.
        // If n is less than 1, then it is not a power of 3.
        // If n is greater than 1, then we can check if n is divisible by 3.
        // If it is, then we can call the function recursively with n divided by 3.
        // This solution has a time complexity of O(log n) and a space complexity of O(log n).

    }
}