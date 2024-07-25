import java.util.*;

class Amazon{
	static String  produtNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int start;
		public static boolean addProdutNames(String produtName){
			boolean isProdutNameAdded = false;
			if(start < produtNames.length){
				if(produtName!=null){
					produtNames[start] = produtName;
					start++;
				isProdutNameAdded = true;
				}
				else
				System.out.println("Product Name is invalid");
			}else
				System.out.println("Sorry product name is full");
		return isProdutNameAdded;
		}
		public static void readProdutName(){
			System.out.println("Product Name available are");
			for(String produtName : produtNames){
				System.out.println(produtName);
			}
		}
		public static boolean updateProdutName(String newProdutName , String oldProdutName){
			System.out.println("Update method is Started");
			boolean isUpdateProdutName = false;
			for(int ref=0; ref<produtNames.length;ref++){
				if(produtNames[ref] == oldProdutName){
					produtNames[ref] = newProdutName;
					isUpdateProdutName = true;
				}
			}
			if(isUpdateProdutName==false)
				System.out.println(oldProdutName + "not found");
			System.out.println("Update method is Ended");
		return isUpdateProdutName;
		}
		public static boolean deleteProdutName(String produtName){
			boolean isDeleteProdutName = false;
			int ref , newRef;
			for(ref=0 , newRef=0; ref<produtNames.length; ref++){
				if(produtNames[ref] != produtName){
					produtNames[newRef] = produtNames[ref];
					newRef++;
				}
				else
					isDeleteProdutName = true;
			}
			int newlength = newRef;
			produtNames = Arrays.copyOf(produtNames , newlength);
			
			if(isDeleteProdutName == false){
				System.out.println(produtNames + "not found");
			}
		return isDeleteProdutName;
		}
}