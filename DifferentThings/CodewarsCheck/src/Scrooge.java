public class Scrooge {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int years = 0;
        while(principal < desired){
            double x = principal * interest;
            double y = x - (x * tax);
            principal += y;
            years++;
            System.out.println(principal);
            System.out.println(years);
        }
        return years;
    }

    public static int calculateYears2(double principal, double interest, double tax, double desired) {
        int years = 0;
        while (principal < desired) {
            principal += principal * interest * (1 - tax);
            years++;
            System.out.println(principal);
            System.out.println(years);
        }
        return years;
    }

    public static void main(String[] args) {
        calculateYears(1000,0.05,0.18,1100);
        //calculateYears2(1000,0.05,0.18,1100);
    }
}
