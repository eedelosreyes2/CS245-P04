
public class ArrayQueue implements Queue {
	private Object[] arr;
	private int head;
	private int tail;
	
	public ArrayQueue() {
		arr = new Object[10];
		head = 0;
		tail = 0;
	}

	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		if (empty()) {
			return null;
		} 
		Object item = arr[head];
		head++;
		if (head == arr.length) {
			head = 0;
		} return item;
	}

	@Override
	public void enqueue(Object item) {
		// TODO Auto-generated method stub
		if (full()) {
			grow_queue();
		} arr[tail++] = item;
		if (tail == arr.length) {
			tail = 0;
		}
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		if (head == tail) {
			return true;
		} return false;
	}
	
	public boolean full() {
		if ((tail + 1) % arr.length == head) {
			return true;
		} return false;
	}
	
	public void grow_queue() {
		Object[] new_arr = new Object[arr.length * 2];
		if (tail < head) {
			System.arraycopy(arr, head, new_arr, 0, arr.length - head);
		} else { 
			System.arraycopy(arr, 0, new_arr, head + 1, tail);
		} arr = new_arr;
		
	}

}
