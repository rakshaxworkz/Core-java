class TeaPointRunner{
  public static void main(String[] tea){
  boolean addedTea = TeaPoint.addTeaName("AmruthTea");
  System.out.println("Tea is added " + addedTea);
  
  TeaPoint.addTeaName("Green Tea");
  System.out.println("Tea is added " + addedTea);
  
  TeaPoint.addTeaName("Ginger Tea");
  System.out.println("Tea is added " + addedTea);
  
  TeaPoint.addTeaName("Chocalate Tea");
  System.out.println("Tea is added " + addedTea);
  
  TeaPoint.addTeaName("Barley Tea");
  System.out.println("Tea is added " + addedTea);
  
   TeaPoint.addTeaName("Black Tea");
  System.out.println("Tea is added " + addedTea);
  
     
  TeaPoint.showTeaNames();
  
  boolean updateTea = TeaPoint.updateTeaName("Masala Tea" , "Chocalate Tea");
  System.out.println(updateTea + "Tea Name is Updated");
  
  TeaPoint.showTeaNames();
  
  
  boolean deletedTea = TeaPoint.deleteTeaName("Green Tea");
  System.out.println(deletedTea + "Tea Name is Deleted");
  
  TeaPoint.showTeaNames();
  }



}