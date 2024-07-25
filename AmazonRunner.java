class AmazonRunner{
	public static void main(String[] args){
		System.out.println("Main Started");
		boolean produtAdded = Amazon.addProdutNames("Sunglasses");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Watch");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Airpods");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Moblie");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("TV");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Kichen Items");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Charger");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Water Botell");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Laptop");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Mouse");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Printer");
		System.out.println("Product names added " +produtAdded);
		
		Amazon.readProdutName();
		
		
		boolean produtUpdate = Amazon.updateProdutName("Smart watch" , "Printer");
		System.out.println("Product Name is updated" + produtUpdate);
		
		Amazon.readProdutName();
		
		boolean produtDelete = Amazon.deleteProdutName("Water Botell");
		System.out.println("Product Name is Deleted" +produtDelete);
		
		Amazon.readProdutName();
		System.out.println("Main Ended");
	}
}
		