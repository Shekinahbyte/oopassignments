import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // BILL TO & SHIP TO
        System.out.print("Enter Bill To information: ");
        String billTo = sc.nextLine();

        System.out.print("Enter Ship To information: ");
        String shipTo = sc.nextLine();

        double discountRate = 0.006368; // 0.6368%

        // ---------- ITEM 1 ----------
        System.out.println("\nEnter Product 1 Name: ");
        String p1 = sc.nextLine();
        System.out.print("Quantity: ");
        double q1 = sc.nextDouble();
        System.out.print("Rate: ");
        double r1 = sc.nextDouble();
        System.out.print("Tax %: ");
        double t1 = sc.nextDouble();
        sc.nextLine();
        double a1 = q1 * r1;
        double tax1 = a1 * (t1 / 100);

        // ---------- ITEM 2 ----------
        System.out.println("\nEnter Product 2 Name: ");
        String p2 = sc.nextLine();
        System.out.print("Quantity: ");
        double q2 = sc.nextDouble();
        System.out.print("Rate: ");
        double r2 = sc.nextDouble();
        System.out.print("Tax %: ");
        double t2 = sc.nextDouble();
        sc.nextLine();
        double a2 = q2 * r2;
        double tax2 = a2 * (t2 / 100);

        // ---------- ITEM 3 ----------
        System.out.println("\nEnter Product 3 Name: ");
        String p3 = sc.nextLine();
        System.out.print("Quantity: ");
        double q3 = sc.nextDouble();
        System.out.print("Rate: ");
        double r3 = sc.nextDouble();
        System.out.print("Tax %: ");
        double t3 = sc.nextDouble();
        sc.nextLine();
        double a3 = q3 * r3;
        double tax3 = a3 * (t3 / 100);

        // ---------- ITEM 4 ----------
        System.out.println("\nEnter Product 4 Name: ");
        String p4 = sc.nextLine();
        System.out.print("Quantity: ");
        double q4 = sc.nextDouble();
        System.out.print("Rate: ");
        double r4 = sc.nextDouble();
        System.out.print("Tax %: ");
        double t4 = sc.nextDouble();
        sc.nextLine();
        double a4 = q4 * r4;
        double tax4 = a4 * (t4 / 100);

        // ---------- ITEM 5 ----------
        System.out.println("\nEnter Product 5 Name: ");
        String p5 = sc.nextLine();
        System.out.print("Quantity: ");
        double q5 = sc.nextDouble();
        System.out.print("Rate: ");
        double r5 = sc.nextDouble();
        System.out.print("Tax %: ");
        double t5 = sc.nextDouble();
        sc.nextLine();
        double a5 = q5 * r5;
        double tax5 = a5 * (t5 / 100);

        // ---------- ITEM 6 ----------
        System.out.println("\nEnter Product 6 Name: ");
        String p6 = sc.nextLine();
        System.out.print("Quantity: ");
        double q6 = sc.nextDouble();
        System.out.print("Rate: ");
        double r6 = sc.nextDouble();
        System.out.print("Tax %: ");
        double t6 = sc.nextDouble();
        sc.nextLine();
        double a6 = q6 * r6;
        double tax6 = a6 * (t6 / 100);

        // ---------- ITEM 7 ----------
        System.out.println("\nEnter Product 7 Name: ");
        String p7 = sc.nextLine();
        System.out.print("Quantity: ");
        double q7 = sc.nextDouble();
        System.out.print("Rate: ");
        double r7 = sc.nextDouble();
        System.out.print("Tax %: ");
        double t7 = sc.nextDouble();
        sc.nextLine();
        double a7 = q7 * r7;
        double tax7 = a7 * (t7 / 100);

        // ---------- TOTALS ----------
        double subtotal = a1 + a2 + a3 + a4 + a5 + a6 + a7;
        double totalTax = tax1 + tax2 + tax3 + tax4 + tax5 + tax6 + tax7;
        double discountAmount = subtotal * discountRate;
        double grandTotal = subtotal + totalTax - discountAmount;

        // ---------- FORMATTED INVOICE ----------
        System.out.println("\n====================================================");
        System.out.println("                     SALES INVOICE                  ");
        System.out.println("====================================================");

        System.out.println("\nBILL TO:");
        System.out.println(billTo);

        System.out.println("\nSHIP TO:");
        System.out.println(shipTo);

        System.out.println("\n----------------------------------------------------");
        System.out.printf("%-4s %-20s %-6s %-8s %-8s\n", "No", "Product Name", "Qty", "Rate", "Amount");
        System.out.println("----------------------------------------------------");

        System.out.printf("%-4s %-20s %-6.2f %-8.2f %-8.2f\n", "1.", p1, q1, r1, a1);
        System.out.printf("%-4s %-20s %-6.2f %-8.2f %-8.2f\n", "2.", p2, q2, r2, a2);
        System.out.printf("%-4s %-20s %-6.2f %-8.2f %-8.2f\n", "3.", p3, q3, r3, a3);
        System.out.printf("%-4s %-20s %-6.2f %-8.2f %-8.2f\n", "4.", p4, q4, r4, a4);
        System.out.printf("%-4s %-20s %-6.2f %-8.2f %-8.2f\n", "5.", p5, q5, r5, a5);
        System.out.printf("%-4s %-20s %-6.2f %-8.2f %-8.2f\n", "6.", p6, q6, r6, a6);
        System.out.printf("%-4s %-20s %-6.2f %-8.2f %-8.2f\n", "7.", p7, q7, r7, a7);

        System.out.println("----------------------------------------------------");
        System.out.printf("%-20s : %.2f\n", "Subtotal", subtotal);
        System.out.printf("%-20s : %.2f\n", "Tax Total", totalTax);
        System.out.printf("%-20s : %.4f\n", "Discount (0.6368%)", discountAmount);
        System.out.printf("%-20s : %.2f\n", "GRAND TOTAL", grandTotal);
        System.out.println("====================================================");
    }
}