import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner inputs=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=inputs.nextLine();
        System.out.println("Enter reg.no :");
        int reg=inputs.nextInt();
        inputs.nextLine();
        System.out.println("Enter your Mother's Name:");
        String Mname=inputs.nextLine();
        System.out.println("Result:");
        System.out.println("Name:"+""+name);
        System.out.println("Reg.no:"+""+reg);
        System.out.println("Mother's Name:"+""+Mname);

    }
}
