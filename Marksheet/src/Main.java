//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String regNumber1 = "reg001", fullName1 = "John Doe";
        int ccs2211_1 = 78;
        int ccs2212_1 = 85;

        String regNumber2 = "reg002", fullName2 = "Alice Smith";
        int ccs2211_2 = 89;
        int ccs2212_2 = 49;

        System.out.println("STUDENT SCORE SHEET\n");
        System.out.println("Reg Number \t\tFull name       \tCCS 2211      \tCCS2212");
        System.out.println(regNumber1 + "\t\t\t" + fullName1 +"\t\t\t" + ccs2211_1 +"\t\t\t\t" + ccs2212_1 );
        System.out.println(regNumber2 + "\t\t\t" + fullName2 +"\t\t\t" + ccs2211_2 +"\t\t\t\t" + ccs2212_2);
    }
}