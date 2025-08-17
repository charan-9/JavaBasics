import java.util.Scanner;

public class first{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee's name : ");
        String emp_name = sc.nextLine();
        System.out.println("Enter Employee's current Salary : ");
        int salary = sc.nextInt();
        System.out.println("Enter Employee's Bonus% : ");
        double bonus = sc.nextDouble();
        double final_salary = salary + (salary * bonus / 100);

        System.out.println("Employee " + emp_name + "'s salary = " + final_salary);
    }
}