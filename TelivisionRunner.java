class TelivisionRunner{
  public static void main(String ws[]){
  System.out.println("Main started");
  boolean connect=Telivision.onOrOff();
  System.out.println("Is connected :"+ connect);
  connect=Telivision.onOrOff();
  System.out.println("Is connected :"+ connect);
  System.out.println("Main Ended");
  }

}