package Ex02;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * LinkedMap<K,V> implements the MapI<K,V> interface using linked nodes.
 * Note: null is not allowed as a key or a value.
 */
public class LinkedMap<K, V> implements MapI<K, V> {
	private Node<K, V> head;
	private int size;

	public LinkedMap() {
		head = null;
		size = 0;
	}

	//-------------------------------------------------------------------------
	// Map<K,V> methods

	/**
	 * Return the value corresponding to the key k.
	 * Return null, if the key is not in the map.
	 */
	@Override
	public V get(K key) {
		Node<K,V> node = head;
		while(node != null && node.key != key){
			node = node.next;
		}
		if(node == null){
			return null;
		}
		return node.value;
	}

	/**
	 * Insert a (key, value) pair in the map.
	 * Return the old value, if the key was in the map before this insertion.
	 * If not, return null.
	 */
	@Override
	public V put(K key, V value) {
		// guard for empty map
		if(size == 0){
			Node<K, V> newNode = new Node<>(key,value);
			head = newNode;
			size++;
			return null;
		}

		// guard for key found in first node
		if(head.key == key){
			V oldValue = head.value;
			Node<K, V> newNode = new Node<>(key, value);
			newNode.next = head;
			head = newNode;
			size++;
			return oldValue;
		}

		Node<K,V> node = head;
		while(node.next != null && node.next.key != key){
			node = node.next;
		}

		if(node.next == null){
			Node<K, V> newNode = new Node<>(key, value);
			newNode.next = head;
			head = newNode;
			size++;
			return null;
		}

		V oldValue = node.next.value;
		Node<K, V> newNode = new Node<>(key, value);
		newNode.next = node.next.next;
		node.next = newNode;
		size++;
		return oldValue;
	}

	/**
	 * Remove the (key, value) pair with the key as key from the map.
	 * Return the value, if the key was in the map before this removal.
	 * If not, return null.
	 */
	@Override
	public V remove(K key) {
		// guard for empty map
		if(size == 0){
			return null;
		}

		// guard for key found in first node
		if(head.key == key){
			V poppedValue = head.value;
			head = head.next;
			size--;
			return poppedValue;
		}

		Node<K,V> node = head;
		while(node.next != null && node.next.key != key){
			node = node.next;
		}

		if(node.next == null){
			return null;
		}

		V poppedValue = node.next.value;
		node.next = node.next.next;
		size--;
		return poppedValue;
	}

	/**
	 * Return a set with all the keys in the map.
	 * Returns null if empty
	 */
	@Override
	public Set<K> keys() {
		if(size == 0){
			return null;
		}

		Set<K> keys = new LinkedHashSet<>();
		Node<K,V> node = head;
		while(node != null){
			keys.add(node.key);
			node = node.next;
		}

		return keys;
	}

	/**
	 * Return a list with all the values in the map.
	 * Returns null if empty
	 */
	@Override
	public List<V> values() {
		if(size == 0){
			return null;
		}

		List<V> values = new LinkedList<>();
		Node<K,V> node = head;
		while(node != null){
			values.add(node.value);
			node = node.next;
		}

		return values;
	}

	/**
	 * Return the number of (key,value) pairs in the map.
	 */
	@Override
	public int size() {
		return size;
	}

	/**
	 * Return true on an empty map, false on a non-empty map.
	 */
	@Override
	public boolean isEmpty() {
		return head == null;
	}

	//-------------------------------------------------------------------------

	private static class Node<K, V> {
		private final K key;
		private final V value;
		private Node<K, V> next;

		public Node(K key, V value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}

}
