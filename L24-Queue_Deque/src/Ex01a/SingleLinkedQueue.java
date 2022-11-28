package Ex01a;

import java.util.NoSuchElementException;

public class SingleLinkedQueue<E> implements QueueI<E> {
	// first points to the node at the front of the queue
	// (= the first node in the singly-linked list)
	private Node first;

	// last points to the node at the back of the queue
	// (= the last node in the singly-linked list)
	private Node last;
	private int size;

	public SingleLinkedQueue() {
		first = null;
		last = null;
		size = 0;
	}

	/**
	 * Add a new entry to the back of the queue.
	 */
	@Override
	public void add(E entry) {
		Node newNode = new Node(entry);
		if(first == null){
			first = newNode;
		} else {
			last.next = newNode;
		}
		last = newNode;
		size++;
	}

	/**
	 * Remove and return the entry at the front of the queue.
	 * Throw a NoSuchElementException(), if the queue is empty.
	 */
	@Override
	public E remove() {
		if (first == null){
			throw new NoSuchElementException();
		}
		E popped = first.entry;
		if(first == last){
			first = null;
			last = null;
		} else {
			first = first.next;
		}
		size--;
		return popped;
	}

	/**
	 * Return the entry at the front of the queue.
	 * Throw a NoSuchElementException(), if the queue is empty.
	 */
	@Override
	public E element() {
		if (first == null){
			throw new NoSuchElementException();
		}
		return first.entry;
	}

	/**
	 * Return true, if the queue is empty.
	 */
	@Override
	public boolean isEmpty() {
		return first == last;
	}

	/**
	 * Remove all entries from this queue.
	 */
	@Override
	public void clear() {
		first = null;
		last = null;
		size = 0;
	}

	/**
	 * Return the number of elements in the queue.
	 */
	@Override
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node node = first;
		while(node != null){
			sb.append(node.entry).append("\n");
			node = node.next;
		}
		if(sb.toString().equals("")){
			sb.append("Empty");
		}
		return sb.toString();
	}

	//-------------------------------------------------------------------------

	private class Node {
		private final E entry;
		private Node next;

		public Node(E entry) {
			this.entry = entry;
		}
	}
}
