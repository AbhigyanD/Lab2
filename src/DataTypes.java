import java.util.List;

public class DataTypes {
    // Fixing the code to pass the test
    public static long sum(List<Integer> numbers) {
        long s = 0;  // Change int to long
        // "foreach" loop to iterate through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;  // Return long value
    }
}
