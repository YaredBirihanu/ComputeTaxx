import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("0-single filter, 1-marrid jointly or" + "qualifiying widow(er), 2-marrid separately, 3-head of " + "houshold)");
        System.out.println("Enter the the filling status: ");
        int status=input.nextInt();
        System.out.println("Enter the taxable income: ");
        double income=input.nextDouble();
        double tax=0;
        if(status==0){
            if(income<=8350)
                tax=income*0.10;
            else if(income<=33950)
                tax=income*0.10+(income-8350)*0.15;
            else if (income<=82250)
                tax=8350*0.10+(33950-8350)*0.15+(income-33950)*0.25;
        }


    }
}
