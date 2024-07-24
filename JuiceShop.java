class JuiceShop{
static String juiceNames[] = {null,null,null,null,null,null};
static int start;
public static boolean addJuiceName(String juiceName){
  boolean isJuiceNameAdded = false;
  if(start<juiceNames.length){
  if(juiceName != null){
  juiceNames[start++] = juiceName;
  isJuiceNameAdded = true;
  }
  else
  System.out.println("JuiceName is Invalid");

}
else{
  System.out.println("Juice Names is full");
}
return isJuiceNameAdded;

}
public static void showJuiceNames(){

for(String juiceName:juiceNames){
   System.out.println(juiceName);
}

}
}