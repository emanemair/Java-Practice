public class Employee {
    int emp_id;
    float salary;
    PersonalInformation peronal_info;
    Department dept;
    Employee(int emp_id , float salary, String first_name , String last_name , int age, String phone_number, String address, Department dept){
        this.emp_id = emp_id;
        this.salary = salary;
        this.peronal_info=new PersonalInformation(first_name,last_name,age,phone_number,address);
        this.dept=dept;
    }

    public void setEmp_id(int id){
        this.emp_id = id ;
    }

    public  int getEmp_id(){
        return this.getEmp_id();
    }

    public void setSalary(float salary){
        this.salary=salary;
    }
    public float getSalary(){
        return this.salary ;
    }

    @Override
    public String toString() {
        return "{Employee{"+ " id:" +this.emp_id + ", salary:" + this.salary + "\npersonal-information{ name: " + this.peronal_info.getFirst_name() + " " +this.peronal_info.getLast_name() + ", age: "+ this.peronal_info.getAge() + ", phone number: "+ this.peronal_info.getPhone_number() + ", address: " + this.peronal_info.getAddress()+" }\n" +
                "Department { Departmetn_id : " + this.dept.getDept_id() + ", deparmtent name: " + this.dept.getDept_name() + " }} ";
    }
}
