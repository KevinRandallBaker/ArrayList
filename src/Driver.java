public class Driver 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> myList = new ArrayList();
	    
		// Adding elements using default method
		System.out.println("Adding elements using default add method: ");
        myList.add(0);
        System.out.println(myList);
        myList.add(1);
        System.out.println(myList);
        myList.add(2);
       
        System.out.println(myList + "\n");
        // Trying to add an element to a crazy index for the error
        System.out.println("Adding element to a bogus index to trigger message:");
        myList.add(4, 1000);
        System.out.println();
      
        // Filling array up to max size
        System.out.println("Filling array: ");
        for(int i = 0; i < 7; i++)
        	myList.add(i + 3); 
        System.out.println(myList + "\n");
        
        // Trying to add to array knowing that it will cause a reallocate due to size
        System.out.println("Adding elment to cause reallocation due to size:");
        myList.add(10);
        System.out.println(myList + "\n");
        
        // Adding in the middle of the array to see if shift works correctly
        System.out.println("Adding in the middle to see if shift works:");
        myList.add(60, 4);
        System.out.println(myList + "\n");
        
        // Testing gets and indexOf
        System.out.println("Get index 5: " + myList.get(5));
        System.out.println("getSize: " + myList.getSize());
        System.out.println("indexOf 60: " + myList.indexOf(60));
        System.out.println("indexOf 62: " + myList.indexOf(62) + "\n");
        
        // Testing set
        myList.set(17, 5);
        System.out.println("Set index 5: " + myList.get(5) + "\n");
        
        // Testing remove
        myList.remove(1);
        System.out.println("myList after removing index 1: " + myList + "\n");

	}

}
