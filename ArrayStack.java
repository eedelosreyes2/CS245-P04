
public class ArrayStack implements Stack {
	private Object[] arr;
	private int top;
	

	public ArrayStack() {
		arr = new Object[10];
		top = 0;
	}
	
	@Override
	public void push(Object item) {
		// TODO Auto-generated method stub
		if (top == arr.length) {
			grow_stack();
		} arr[top++] = item;
		
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		if (empty()) {
			return null;
		} return arr[--top];
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		if (empty()) {
			return null;
		} return arr[top - 1];
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		if (top == 0) {
			return true;
		} return false;
	}

	public void grow_stack() {
		Object[] new_arr = new Object[arr.length * 2];
		System.arraycopy(arr, 0, new_arr, 0, arr.length);
		arr = new_arr;
	}
	
}
