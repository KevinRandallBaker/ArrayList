package csc311_linklist;

public class CSC311_LinkList
{

    public static void main(String[] args) 
    {
        LinkedList<Integer> myList = new LinkedList<Integer>();
        
        myList.add(0, 5); System.out.println(myList);
        myList.add(0, 4); System.out.println(myList);
        myList.add(0, 3); System.out.println(myList);
        myList.add(0, 2); System.out.println(myList);
        myList.add(0, 1); System.out.println(myList);
        myList.add(0, 0); System.out.println(myList);
        
		/*
		 * System.out.println("Removed " + myList.remove(0) + " | " + myList);
		 * System.out.println("Removed " + myList.remove(0) + " | " + myList);
		 * System.out.println("Removed " + myList.remove(0) + " | " + myList);
		 * System.out.println("Removed " + myList.remove(0) + " | " + myList);
		 * System.out.println("Removed " + myList.remove(0) + " | " + myList);
		 * System.out.println("Removed " + myList.remove(0) + " | " + myList);
		 * System.out.println("Removed " + myList.remove(0) + " | " + myList);
		 */
        
        myList.printRecur();
        
        //System.out.println("Get index 1: " + myList.get(1));
        //myList.set(2, 4); System.out.println("Set index: " + myList);
    }
   
}
