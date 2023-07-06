package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if(divider == 0) {
            System.out.println("division by zero");
        } else {
            double dividendDouble = (double) dividend;
            double dividerDouble = (double) divider;
            double divisionResult = dividendDouble / dividerDouble;
            divisionResult *= dividerDouble;

            if(divisionResult == dividendDouble) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        }
    }
}
