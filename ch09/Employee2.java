package ch09;

public class Employee2 {
   public String name;
   String address;
   String email;
   String number;
   protected int salary;
   private String rrn;

   public String getRrn() {
	   return rrn;
   }
   public Employee2() {
}
   public Employee2(String name, String address, int salary, String rrn, String email, String number) {
	this.name = name;
	this.address = address;
	this.salary = salary;
	this.rrn = rrn;
	this.email = email;
	this.number = number;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", address=" + address + ", email=" + email + ", number=" + number + ", salary="
			+ salary + ", rrn=" + rrn + "]";
}
}
