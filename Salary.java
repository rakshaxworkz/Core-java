class Salary{
	static int basicSalary=15000;
	static int increasedSalary=basicSalary+2000;
	static int experiencedSalary = increasedSalary+2000;
 public static void salaryOfPerson(int age){
 if(age>=20 && age<25){
	 System.out.println("Salary is "+basicSalary );
 }
else if(age>=25 && age<30){
	
	 System.out.println("Salary is " + increasedSalary );
 }
 else{
	 
	 System.out.println("Salary is " + experiencedSalary);
	 return;
 }
 }
}