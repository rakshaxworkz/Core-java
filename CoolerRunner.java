class CoolerRunner{
  public static void main(String ws[]){
  System.out.println("Main started");
  boolean connect=Cooler.onOrOff();
  System.out.println("Is connected :"+ connect);
  connect=Cooler.onOrOff();
  System.out.println("Is connected :"+ connect);
  System.out.println("Main Ended");
  }

}