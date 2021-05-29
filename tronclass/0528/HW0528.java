// 408401610 2021/05/28

import java.util.Scanner; 

public class HW0528 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter filing status
        System.out.print(
        "(0-single filer, 1-married jointly or qualifying widow(er), "
        + "\n2-married separately, 3-head of household)\n" +
        "Enter the filing status: ");
        Tax tax1 = new Tax();
        tax1.setStatus( input.nextInt() );

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        tax1.setIncome( input.nextDouble() );

        tax1.showTax();
    }
}
class Tax {
    private int status = 0;
    private double income = 0;
    private double tax = 0;

    public int getStatus() {
        return status;
    }
    public double getIncome() {
        return income;
    }
    public double getTax() {
        return tax;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public void setIncome(Double income) {
        this.income = income;
    }
    public void setTax(Double tax) {
        this.tax = tax;
    }

    public void showTax() {
        if (status == 0) { // Compute tax for single filers
            if (income <= 8350)
            tax = income * 0.10;
            else if (income <= 33950)
            tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
            (income - 33950) * 0.25;
            else if (income <= 171550)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
            (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950)
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
            (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
            (income - 171550) * 0.33;
            else
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
            (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
            (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        }
        else if (status == 1) { // Compute tax for married file jointly
            // Left as exercise
        }
        else if (status == 2) { // Compute tax for married separately
            // Left as exercise
        }
        else if (status == 3) { // Compute tax for head of household
            // Left as exercise
        }
        else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }

        // Display the result
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }
}