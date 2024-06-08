//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Department dept = new Department(123, "CIS");
        Employee emp = new Employee(017 , 900.50f , "eman" , "emair", 25 , "0799646707" , "amman-jo", dept);
        System.out.print(emp);
    }
}