package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        for (int i = 0; i < String.valueOf(t).length(); i++) {
            if (String.valueOf(t).charAt(i) == '-') {
                i++;
                char c = String.valueOf(t).charAt(i);
                sum += Integer.parseInt(String.valueOf(c));
            } else {
                char c = String.valueOf(t).charAt(i);
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        System.out.println(sum);
    }
}
