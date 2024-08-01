class BillRunner{
	public static void main(String billing[]){
		// ClassName ref = new ClassName();
		Bill ref = new Bill(100 , 1 ,"14-07-2024" ,"31-07-2024" , false ,true , false, 345.90 , true );
	
		System.out.println("Bill generated for 14-07-2024 month is :");
		System.out.println("----------------------------------------");
		
		System.out.println("Bill Reference Id is " + ref.billReferenceId);
		System.out.println("Bill Sequence Number is " + ref.billSequenceNo);
		System.out.println("Bill is Issued on " + ref.billIssueDate);
		System.out.println("Bill due date is " + ref.billDueDate);
		System.out.println("Bill is paid or not " + ref.isBillPaid);
		System.out.println("Is the bill is latest " + ref.isLatestBill);
		System.out.println("Is this bill is Final " + ref.isFinalBill);
		System.out.println("Bill amount is " + ref.billAmount);
		System.out.println("Is bill is tax Inclusive " + ref.taxInclusiveBill);
		
		Bill bill = new Bill(101 , 2 , "14-08-2024" , "31-08-2024" , false , true ,false ,567.09 , true);
		
		
		System.out.println("Bill generated for 14-08-2024 month is :");
		System.out.println("----------------------------------------");
		
		System.out.println("Bill Reference Id is " + bill.billReferenceId);
		System.out.println("Bill Sequence Number is " + bill.billSequenceNo);
		System.out.println("Bill is Issued on " + bill.billIssueDate);
		System.out.println("Bill due date is " + bill.billDueDate);
		System.out.println("Bill is paid or not " + bill.isBillPaid);
		System.out.println("Is the bill is latest " + bill.isLatestBill);
		System.out.println("Is this bill is Final " + bill.isFinalBill);
		System.out.println("Bill amount is " + bill.billAmount);
		System.out.println("Is bill is tax Inclusive " + bill.taxInclusiveBill);
		
	}
}
//use of Constructor To initialise instance variable of class.
//It is a spcl type of method which has same name as classname withouy having any return type.