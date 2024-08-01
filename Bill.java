class Bill{

	int billReferenceId;
	int billSequenceNo;
	String billIssueDate;
	String billDueDate;
	boolean isBillPaid;
	boolean isLatestBill;
	boolean isFinalBill;
	double billAmount;
	boolean taxInclusiveBill;
	
	//Parameterized
	public Bill(int billRefId ,int billSeqNo , String billIDate,String billDdate ,boolean isBilldt, boolean isLatestBl ,  boolean isFinalBl ,  double billAmnt , boolean taxIBill ){
		billReferenceId = billRefId;
		billSequenceNo = billSeqNo;
		billIssueDate = billIDate;
		billDueDate = billDdate;
		isBillPaid = isBilldt;
		isLatestBill = isLatestBl;
		isFinalBill = isFinalBl;
		billAmount = billAmnt;
		taxInclusiveBill = taxIBill;
	}
}
