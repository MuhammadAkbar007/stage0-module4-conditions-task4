package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int biggest;
        if (first >= second) {
            biggest = first >= third ? first : third;
        } else {
            biggest = second >= third ? second : third;
        }
        System.out.println(biggest);
    }
}
