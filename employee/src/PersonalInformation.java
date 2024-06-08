public class PersonalInformation {
    private String first_name;
    private String last_name;
    private int age;
    private String phone_number;
    private String address;

    PersonalInformation(String first_name,String last_name, int age , String phone_number, String address){
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.phone_number = phone_number;
        this.address = address ;
    }
    public void set_name(String name){
        String[] person_name = name.split(" ");
        this.first_name = person_name[0];
        this.last_name = person_name[1];
    }
    public String getFirst_name(){
        return this.first_name;
    }
    public  String getLast_name(){
        return this.last_name;
    }
    public void set_phone_number(String number){
        this.phone_number = number;
    }

    public  String getPhone_number(){
        return this.phone_number;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public  String getAddress() {
        return this.address;
    }

}
