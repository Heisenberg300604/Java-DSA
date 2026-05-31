class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long currentMass = mass;

        for (int asteroid : asteroids) {
            if (asteroid > currentMass) {
                return false;
            }

            currentMass += asteroid;
        }

        return true;
    }
}
