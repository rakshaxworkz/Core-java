class WashingMachineRunner{
  public static void main(String ws[]){
  System.out.println("Main started");
  boolean connect=WashingMachine.onOrOff();
  System.out.println("Is connected :"+ connect);
  connect=WashingMachine.onOrOff();
  System.out.println("Is connected :"+ connect);
  System.out.println("Main Ended");
  }

}