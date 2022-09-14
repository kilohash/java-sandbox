package dailies;

public class Fibonacci {
    public static void main(String[] args) {
        int current = 2;
        int next;
        int previous = 1;

        for(int f = 1; f <= 6; f++) {
            next = current + previous;
            previous = current;
            current = next;
            System.out.println(next);
        }
    }
}
