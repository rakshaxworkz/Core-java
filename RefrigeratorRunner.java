class RefrigeratorRunner{
  public static void main(String ws[]){
  System.out.println("Main started");
  boolean connect=Refrigerator.onOrOff();
  System.out.println("Is connected :"+ connect);
  connect=Refrigerator.onOrOff();
  System.out.println("Is connected :"+ connect);
  System.out.println("Main Ended");
  }

}