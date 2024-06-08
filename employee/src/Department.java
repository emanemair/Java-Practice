public class Department {
    int dept_id;
    String dept_name;

    Department(int dept_id , String dept_name){
        this.dept_id = dept_id;
        this.dept_name = dept_name;
    }

    public void setDept_id(int dept_id){
        this.dept_id = dept_id;
    }
    public  int getDept_id(){
        return  this.dept_id;
    }
    public void setDept_name(String dept_name){
        this.dept_name = dept_name;
    }
    public String getDept_name(){
        return this.dept_name;
    }

}
