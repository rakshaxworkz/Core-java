class MRPStore{
static String alcoholNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start;
public static boolean addAlcoholName(String alchoholName){
  boolean isAlcoholNameAdded = false;
  if(start<alcoholNames.length){
  if(alchoholName != null){
  alcoholNames[start++] = alchoholName;
  isAlcoholNameAdded = true;
  }
  else
  System.out.println("Alcohol Name is Invalid");

}
else{
  System.out.println("Alcohol Names is full");
}
return isAlcoholNameAdded;

}
public static void showAlcoholNames(){

for(String alchoholName:alcoholNames){
   System.out.println(alchoholName);
}

}
}