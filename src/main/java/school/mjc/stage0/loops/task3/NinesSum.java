package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            String t = "";
            for (int j = 1; j <= i; j++) {
                t += "9";
            }
            sum += Integer.parseInt(t);
        }
        System.out.println(sum);
    }
}
