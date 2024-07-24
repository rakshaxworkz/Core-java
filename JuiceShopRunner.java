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
 
 }




}