class JuiceShopRunner{
 public static void main(String[] juices){
 
   boolean addedJuice = JuiceShop.addJuiceName("WaterMelon");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("Lime");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("Orange");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("Apple");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("chikku");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("OreoMilkshake");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.addJuiceName("Mango");
   System.out.println("Added juice" + addedJuice );
   
   JuiceShop.showJuiceNames();
   
    boolean updateJuice = JuiceShop.updateJuiceName("Pomogranete" , "Apple");
  System.out.println(updateJuice + "Juice Name is Updated");
  
  JuiceShop.showJuiceNames();
  
  
  boolean deletedJuice = JuiceShop.deleteJuiceName("chikku");
  System.out.println(deletedJuice + "Juice Name is Deleted");
  
  JuiceShop.showJuiceNames();
 
 }




}