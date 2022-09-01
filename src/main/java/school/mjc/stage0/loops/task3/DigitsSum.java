package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        for (int i = 0; i < String.valueOf(t).length(); i++) {
            sum += String.valueOf(t).charAt(i);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int t = 123;
        int sum = 0;
        String s = String.valueOf(t);
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            sum += (int) s.charAt(i);
        }
        System.out.println(sum);
    }
}
