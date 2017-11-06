
public class Test {

//	
//	public static void main(String[] args) {
//	
//		String s="karthik";
//		for(int i=s.length()-1; i>=0; i--){
//			System.out.println(s.charAt(i));
//		}

	
	public static void main(String[] args) {
	 int numbers[] = new int[]{32,43,53,54,32,65,63,95,43,23};
     
     //assign first element of an array to largest and smallest
     int smallest = numbers[0];
     int largetst = numbers[0];
    
     for(int i=1; i< numbers.length; i++)
     {
             if(numbers[i] > largetst)
                     largetst = numbers[i];
             else if (numbers[i] < smallest)
                     smallest = numbers[i];
            
     }
    
     System.out.println("Largest Number is : " + largetst);
     System.out.println("Smallest Number is : " + smallest);
}
}
