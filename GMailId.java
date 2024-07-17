class GMailId{
 public static void searchMail(String mailId){
   String arr[]={"raksha@gmail.com" , "sinchana@gmail.com" , "naspa@gmail.com" , "samith@gmail.com" , "abhi@gmail.com"};
  
   boolean found=false;
   for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mailId) {
                found = true;
                break; 
            }
        }
	if (found) {
            System.out.println("The target gmail " + mailId + " is present in the array.");
        } else {
            System.out.println("The target gmail " + mailId + " is not present in the array.");
        }
		
		
	if (mailId==arr[0]){
		String name="Raksha Shetty";
        int age= 21;
        long phoneNumber=8197614012L;
        System.out.println("Name of the person is " + name);
        System.out.println("Age of the person is " + age);
        System.out.println("Phone Number of the person is " + phoneNumber);
	}
	else if (mailId==arr[1]){
		String name="Sinchana Shetty";
        int age= 21;
        long phoneNumber=9897614012L;
        System.out.println("Name of the person is " + name);
        System.out.println("Age of the person is " + age);
        System.out.println("Phone Number of the person is " + phoneNumber);
	}
	else if(mailId== arr[2]){
   String name="Naspan";
   int age= 24;
   long phoneNumber=9997614012L;
   System.out.println("Name of the person is " + name);
   System.out.println("Age of the person is " + age);
   System.out.println("Phone Number of the person is " + phoneNumber);
   }
   
   else if(mailId== arr[3]){
   String name="Samith Rai";
   int age= 23;
   long phoneNumber=8197614012L;
   System.out.println("Name of the person is " + name);
   System.out.println("Age of the person is " + age);
   System.out.println("Phone Number of the person is " + phoneNumber);
   }
   
   else if(mailId== arr[4]){
   String name="Abhishek";
   int age= 25;
   long phoneNumber=898914012L;
   System.out.println("Name of the person is " + name);
   System.out.println("Age of the person is " + age);
   System.out.println("Phone Number of the person is " + phoneNumber);
   } 
    }
}