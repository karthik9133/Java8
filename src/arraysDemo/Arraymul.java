package arraysDemo;

public class Arraymul {
	int size;
	int othersize;
	
	public  int [] multiply(int array1[],int array2[])
	{
	
	int[] product=new int[2*size];

	int carryover=0;

	for(int i=0;i<size;i++)
	{
	
	for(int j=0;j<othersize;j++)
	{
	product[i]=(array1[i]*array2[j])+carryover;
	if(product[i]>10)
	{
	carryover=product[i]/10;
	product[i]=product[i]/(carryover*10);
	}
	}
System.out.println(product[i]);
	}

	return product;

	}	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int array1[]={1,2,3,4};
		int array2[]={5,1,2,4};
		
		Arraymul am=new Arraymul();
		am.multiply(array1, array2);
	}

}
