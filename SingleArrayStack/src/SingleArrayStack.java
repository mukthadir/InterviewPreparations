
public class SingleArrayStack {

	
	
	
	
}

class Stack {
	int head[] = {-1, -1, -1};
	int arraySize = 300;
	int[] stackArray = new int[arraySize];
	int stackSize = arraySize/3;
	
	public void push(int stackNumber, int data) {
		if(head[stackNumber] + 1 >= stackSize) {
			System.out.println("Stack overflow. Can not push anymore");
			return;
		}
		
		head[stackNumber] += 1;
		stackArray[stackNumber*stackSize + head[stackNumber]] = data;		
	}
	
	public int pop(int stackNumber) {
		if(head[stackNumber] == -1) {
			System.out.println("This stack is empty. Try out other stacks");
			return -1;
		}
		
		int value = stackArray[stackNumber*stackSize + head[stackNumber]];
		stackArray[stackNumber*stackSize + head[stackNumber]] = 0;
		head[stackNumber] -= 1;
		return value;
	}
	
	public int peek(int stackNumber) {
		if(head[stackNumber] == -1) {
			System.out.println("This stack is empty. Try out other stacks");
			return -1;
		}
		
		return stackArray[stackNumber*stackSize + head[stackNumber]];
	}
}
