
public class TwoStacks {

	int size;
	int top1, top2;
	int array[];
	
	TwoStacks(int n) {
		
		array= new int[n];
		size=n;
		top1=-1;
		top2=size;
		
	}
	void push1(int data)
	{
		if(top1<top2-1)
		{
			top1++;
			array[top1]=data;
		}
		else
		{
			System.out.println("overflow");
		}
	}
	
	void push2(int data)
	{
		if(top1<top2-1)
		{
			top2--;
			array[top2]=data;
		}
		else
		{
			System.out.println("overflow");
		}
	}
	int pop1()
	{
		if(top1>=0)
		{
			int x=array[top1];
			top1--;
			return x;
		}
		else
		{
			System.out.println("underflow");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2()
	{
		if(top2<size)
		{
			int x=array[top2];
			top2++;
			return x;
		}
		else
		{
			System.out.println("underflow");
			System.exit(1);
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStacks ts= new TwoStacks(5);
		ts.push1(3);
		ts.push2(6);
		ts.push1(4);
		ts.push2(5);
		ts.push1(2);
		  System.out.println("Popped element from" + 
                  " stack1 is " + ts.pop1()); 
ts.push1(8); 
System.out.println("Popped element from" + 
                " stack2 is " + ts.pop1()); 
	}

}
