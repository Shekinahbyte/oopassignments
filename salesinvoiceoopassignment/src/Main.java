import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // BILL TO & SHIP TO
        System.out.println("Enter  Bill To place: ");
        String billTo = sc.nextLine();
        System.out.println("Enter Address 1: ");
        String billToAddress1= sc.nextLine();
        System.out.println("Enter Address 2: ");
        String billToAddress2= sc.nextLine();
        System.out.println("Enter Bill To Code: ");
        String billToCode = sc.nextLine();
        System.out.println("Enter Contact Number: ");
        String billToContact = sc.nextLine();
        System.out.println("Enter email: ");
        String billToEmail = sc.nextLine();

        System.out.println("Enter Ship To Place: ");
        String ShipTo = sc.nextLine();
        System.out.println("Enter  Ship To Address 1: ");
        String ShipToAddress1 = sc.nextLine();
        System.out.println("Enter  Ship To Address 2: ");
        String ShipToAddress2 = sc.nextLine();
        System.out.println("Enter ship To Code: ");
        String ShipToCode = sc.nextLine();
        System.out.println("Enter Contact Number: ");
        String ShipToContact = sc.nextLine();
        System.out.println("Enter email: ");
        String ShipToEmail = sc.nextLine();




        final double DISCOUNT_RATE = 0.006368; // 0.6368%

        // ---------- ITEM 1 ----------

        System.out.println("\nEnter Product 1 Name: ");
        String product1 = sc.nextLine();
        System.out.println("Product Code :");
        double productCode1 = sc.nextDouble();
        System.out.println(" HSN Code : ");
        double hsnCode1 = sc.nextDouble();
        System.out.println("Quantity: ");
        double quantity1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Units : ");
        String units1 = sc.nextLine();
        System.out.println("Rate: ");
        double rate1 = sc.nextDouble();
        System.out.println("Tax %: ");
        double t1 = sc.nextDouble();
        sc.nextLine();
        double amount1 = quantity1 * rate1;
        double tax1 = amount1 * (t1 / 100);

        // ---------- ITEM 2 ----------
        System.out.println("\nEnter Product 2 Name: ");
        String product2 = sc.nextLine();
        System.out.println("Product Code :");
        double productCode2 = sc.nextDouble();
        System.out.println(" HSN Code : ");
        double hsnCode2 = sc.nextDouble();
        System.out.println("Quantity: ");
        double quantity2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Units : ");
        String units2 = sc.nextLine();
        System.out.println("Rate: ");
        double rate2 = sc.nextDouble();
        System.out.println("Tax %: ");
        double t2 = sc.nextDouble();
        sc.nextLine();
        double amount2 = quantity2 * rate2;
        double tax2 = amount2 * (t2 / 100);

        // ---------- ITEM 3 ----------
        System.out.println("\nEnter Product 3 Name: ");
        String product3 = sc.nextLine();
        System.out.println("Product Code :");
        double productCode3 = sc.nextDouble();
        System.out.println(" HSN Code : ");
        double hsnCode3 = sc.nextDouble();
        System.out.println("Quantity: ");
        double quantity3 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Units : ");
        String units3 = sc.nextLine();
        System.out.println("Rate: ");
        double rate3 = sc.nextDouble();
        System.out.println("Tax %: ");
        double t3 = sc.nextDouble();
        sc.nextLine();
        double amount3 = quantity3 * rate3;
        double tax3 = amount3 * (t3 / 100);

        // ---------- ITEM 4 ----------
        System.out.println("\nEnter Product 4 Name: ");
        String product4 = sc.nextLine();
        System.out.println("Product Code :");
        double productCode4 = sc.nextDouble();
        System.out.println(" HSN Code : ");
        double hsnCode4 = sc.nextDouble();
        System.out.println("Quantity: ");
        double quantity4 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Units : ");
        String units4 = sc.nextLine();
        System.out.println("Rate: ");
        double rate4 = sc.nextDouble();
        System.out.println("Tax %: ");
        double t4 = sc.nextDouble();
        sc.nextLine();
        double amount4 = quantity4 * rate4;
        double tax4 = amount4 * (t4 / 100);

        // ---------- ITEM 5 ----------
        System.out.println("\nEnter Product 5 Name: ");
        String product5 = sc.nextLine();
        System.out.println("Product Code :");
        double productCode5 = sc.nextDouble();
        System.out.println(" HSN Code : ");
        double hsnCode5 = sc.nextDouble();
        System.out.println("Quantity: ");
        double quantity5 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Units : ");
        String units5 = sc.nextLine();
        System.out.println("Rate: ");
        double rate5 = sc.nextDouble();
        System.out.println("Tax %: ");
        double t5 = sc.nextDouble();
        sc.nextLine();
        double amount5 = quantity5 * rate5;
        double tax5 = amount5 * (t5 / 100);

        // ---------- ITEM 6 ----------
        System.out.println("\nEnter Product 6 Name: ");
        String product6 = sc.nextLine();
        System.out.println("Product Code :");
        double productCode6 = sc.nextDouble();
        System.out.println(" HSN Code : ");
        double hsnCode6 = sc.nextDouble();
        System.out.println("Quantity: ");
        double quantity6 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Units : ");
        String units6 = sc.nextLine();
        System.out.println("Rate: ");
        double rate6 = sc.nextDouble();
        System.out.println("Tax %: ");
        double t6 = sc.nextDouble();
        sc.nextLine();
        double amount6 = quantity6 * rate6;
        double tax6 = amount6 * (t6 / 100);

        // ---------- ITEM 7 ----------
        System.out.println("\nEnter Product 7 Name: ");
        String product7 = sc.nextLine();
        System.out.println("Product Code :");
        double productCode7 = sc.nextDouble();
        System.out.println(" HSN Code : ");
        double hsnCode7 = sc.nextDouble();
        System.out.println("Quantity: ");
        double quantity7 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Units : ");
        String units7 = sc.nextLine();
        System.out.println("Rate: ");
        double rate7 = sc.nextDouble();
        System.out.println("Tax %: ");
        double t7 = sc.nextDouble();
        sc.nextLine();
        double amount7 = quantity7 * rate7;
        double tax7 = amount7 * (t7 / 100);

        // ---------- TOTALS ----------
        double subtotal = amount1 + amount2 + amount3 + amount4 + amount5 + amount6 + amount7;
        double totalTax = tax1 + tax2 + tax3 + tax4 + tax5 + tax6 + tax7;
        double discountAmount = subtotal * DISCOUNT_RATE;
        double grandTotal = subtotal + totalTax - discountAmount;

        // ---------- FORMATTED INVOICE ----------
        System.out.println("===================================================================================================");
        System.out.println("SALES INVOICE ");
        System.out.println("=========================================================================================================");

        System.out.println("BILL TO                SHIP TO");
        System.out.println("=========================================================================================================");

        System.out.println(String.format("%-20s  %-20s", billTo, ShipTo));
        System.out.println(String.format("%-20s  %-20s", billToAddress1, ShipToAddress1));
        System.out.println(String.format("%-20s  %-20s", billToAddress2, ShipToAddress2));
        System.out.println(String.format("%-20s  %-20s", billToCode, ShipToCode));
        System.out.println(String.format("%-20s  %-20s", billToContact,  ShipToContact));
        System.out.println(String.format("%-20s  %-20s", billToEmail, ShipToEmail));


        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("Payment Date: 7 days from date of delivery \t\t\t\t Payment Terms: 100% against invoice");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(String.format ("%-4s %-12s %-20s %-10s %-10s %-10s %-10s %-10s %-10s", "No", "Product Code", "Product Name", "HSN Code", "Quantity", "Units", "Rate", "Tax", "Amount"));
        System.out.println("---------------------------------------------------------------------------------------------------------");

        System.out.println(String.format("%-4s %-12.0f %-20s %-10.0f %-10.2f %-10s %-10.2f %-10.2f %-10.2f", "1.", productCode1, product1, hsnCode1, quantity1, units1, rate1, t1, amount1));
        System.out.println(String.format("%-4s %-12.0f %-20s %-10.0f %-10.2f %-10s %-10.2f %-10.2f %-10.2f", "2.", productCode2, product2, hsnCode2, quantity2, units2, rate2, t2, amount2));
        System.out.println(String.format("%-4s %-12.0f %-20s %-10.0f %-10.2f %-10s %-10.2f %-10.2f %-10.2f", "3.", productCode3, product3, hsnCode3, quantity3, units3, rate3, t3, amount3));
        System.out.println(String.format("%-4s %-12.0f %-20s %-10.0f %-10.2f %-10s %-10.2f %-10.2f %-10.2f", "4.", productCode4, product4, hsnCode4, quantity4, units4, rate4, t4, amount4));
        System.out.println(String.format("%-4s %-12.0f %-20s %-10.0f %-10.2f %-10s %-10.2f %-10.2f %-10.2f", "5.", productCode5, product5, hsnCode5, quantity5, units5, rate5, t5, amount5));
        System.out.println(String.format("%-4s %-12.0f %-20s %-10.0f %-10.2f %-10s %-10.2f %-10.2f %-10.2f", "6.", productCode6, product6, hsnCode6, quantity6, units6, rate6, t6, amount6));
        System.out.println(String.format("%-4s %-12.0f %-20s %-10.0f %-10.2f %-10s %-10.2f %-10.2f %-10.2f", "7.", productCode7, product7, hsnCode7, quantity7, units7, rate7, t7, amount7));

        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("%-20s : %.2f", "Tax Total", totalTax));
        System.out.println(String.format("%-20s : %.4f", "Discount (0.6368%)", discountAmount));
        System.out.println(String.format("%-20s : %.2f", "GRAND TOTAL", grandTotal));
        System.out.println("=========================================================================================================");
    }
}