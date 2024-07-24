class TouristCompany{
static String placesNames[] = {null,null,null,null,null,null,null,null,null,null};
static int start;
public static boolean addTouristPlace(String touristName){
  boolean isTouristNameAdded = false;
  if(start<placesNames.length){
  if(touristName != null){
  placesNames[start++] = touristName;
  isTouristNameAdded = true;
  }
  else
  System.out.println("Tourist Name is Invalid");

}
else{
  System.out.println("Tourist Names is full");
}
return isTouristNameAdded;

}
public static void showTouristNames(){

for(String touristName:placesNames){
   System.out.println(touristName);
}

}
}