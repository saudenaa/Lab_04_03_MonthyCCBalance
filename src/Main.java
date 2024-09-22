public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Declearing initial credit card balance
        double creditCardBalance = 50000.00;

        //declear the interest rate(17%) annually  and convert to monthly rates
        double annualInterestRate = 0.17; // 17%
        double monthlyInterestRate = annualInterestRate / 12; //Monthly interest rate

        //calculate the interest due after one month and two month
        double interestAfterOneMonth = creditCardBalance * monthlyInterestRate ;
        double balanceAfterOneMonth = creditCardBalance + interestAfterOneMonth;

        double interestAfterTwoMonth = balanceAfterOneMonth * monthlyInterestRate ;
        double balanceAfterTwoMonth = creditCardBalance + interestAfterTwoMonth;

        //output the result
        System.out.println("initial Credit card Balance " + " = " + creditCardBalance);
        System.out.println("annual Interest Rate" + " = " + annualInterestRate );
        System.out.println("monthly Interest Rate " + " = " + monthlyInterestRate );
        System.out.println("interest After One Month "  + " = " + interestAfterOneMonth );
        System.out.println("balance After One Month "  + " = " + balanceAfterOneMonth );
        System.out.println("interest After Two Month "  + " = " + interestAfterTwoMonth );
        System.out.println("balance After Two Month "  + " = " + balanceAfterTwoMonth );

    }
}