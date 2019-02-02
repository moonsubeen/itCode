package com.my.cjava;

public class Challenge270 {
	public static void main(String[] args) {
	    MyQueue3 queue = new MyQueue3();
	    int data = 1;
	    while (!queue.isFull()) {
	      queue.enqueue(data++);
	    }
	    queue.dequeue();
	    queue.dequeue();
	    queue.enqueue(data++);
	    System.out.println(queue);
	  }
	}

	class MyQueue3 {
	  private int[] elements;
	  private int capacity;
	  private int front; // ������ ����� �ε���
	  private int rear; // ������ �߰� ����� �ε���
	  private int size; // ��� ����

	  public MyQueue3() {
	    this.elements = new int[5];
	    this.capacity = 5;
	    this.front = 0;
	    this.rear = 0;
	    this.size = 0;
	  }

	  public int dequeue() {
	    /* �ش� �޼ҵ带 �����Ͻÿ�. */
		  int removed = elements[front];
		  size--;
		  if(!isEmpty())
			  front = (front + 1) % capacity;
		  return removed;
	  }

	  public void enqueue(int data) {
	    /* �ش� �޼ҵ带 �����Ͻÿ�. */
		  if(isEmpty())
			  elements[rear] = data;
		  else
		  {
			  rear = (rear + 1 ) % capacity;
			  elements[rear] = data;
		  }
		  size++;
	  }

	  public boolean isEmpty() {
	    return size == 0;
	  }

	  public boolean isFull() {
	    return size == capacity;
	  }

	  @Override
	  public String toString() {
	    StringBuffer sbuf = new StringBuffer("---------------\n");
	    for (int i = 0; i < capacity; i++) {
	      if (!isEmpty() && (front <= rear && i >= front && i <= rear) || (front > rear && (i >= front || i <= rear)))
	        sbuf.append(String.format("%2d ", elements[i]));
	      else
	        sbuf.append(String.format("%2s ", "��"));
	    }
	    sbuf.append("\n---------------\n");
	    sbuf.append("[0][1][2][3][4]\n\n");
	    sbuf.append(String.format("front: [%d], rear: [%d], isEmpty?: %s, isFull?: %s", front, rear, isEmpty(), isFull()));
	    return sbuf.toString();
	  }

}
