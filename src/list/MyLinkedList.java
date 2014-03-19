package list;
import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

	private int size;
	private Node<T> startNode;
	private Node<T> endNode;

	public MyLinkedList() {
		size = 0;
	}

	public void add(T element) {
		Node<T> newNode = null;
		if (isEmpty()) {
			newNode = new Node<T>(null, element, null);
			startNode = newNode;
			endNode = newNode;
		} else {
			newNode = new Node<T>(endNode, element, null);
			endNode.next = newNode;
			endNode = newNode;
		}
		++size;
	}

	public T get(int index) {
		Node<T> currentNode;
		if (size / 2 >= index) {
			currentNode = startNode;
			for (int i = 0; i <= index; ++i) {
				currentNode = currentNode.next;
			}
		} else {
			currentNode = endNode;
			for (int i = size - 1; i >= index; --i) {
				currentNode = currentNode.previous;
			}
		}

		return currentNode.value;
	}

	public T getFirst() {
		if (!isEmpty()) {
			return startNode.value;
		} else {
			return null;
		}
	}

	public T getLast() {
		if (!isEmpty()) {
			return endNode.value;
		} else {
			return null;
		}
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	public int getSize(){
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			Node<T> currentNode = startNode;

			@Override
			public boolean hasNext() {
				if (currentNode.next != null) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public T next() {
				T item = currentNode.next.value;
				currentNode = currentNode.next;
				return item;
			}

			@Override
			public void remove() {

			}

		};
	}
}

class Node<K> {
	K value;
	public Node<K> previous;
	public Node<K> next;

	Node(Node<K> previous, K value, Node<K> next) {
		this.value = value;
		this.previous = previous;
		this.next = next;
	}
}
