//package Leetcode;

class HighestAltitude {

    // Method to calculate highest altitude
    public int findHighestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for (int g : gain) {
            altitude += g;
            if (altitude > maxAltitude) {
                maxAltitude = altitude;
            }
        }
        return maxAltitude;
    }

    // Main method (entry point)
    public static void main(String[] args) {

        // Sample input
        int[] gain = {-5, 1, 5, 0, -7};

        // Create object (OOP)
        HighestAltitude obj = new HighestAltitude();

        // Call method
        int result = obj.findHighestAltitude(gain);

        // Output
        System.out.println("Highest Altitude: " + result);
    }
}
