class FanRunner{
  public static void main(String ws[]){
  System.out.println("Main started");
  boolean connect=Fan.onOrOff();
  System.out.println("Is connected :"+ connect);
  connect=Fan.onOrOff();
  System.out.println("Is connected :"+ connect);
  System.out.println("Main Ended");
  }

}