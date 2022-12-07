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
		// TODO

		return null;
	}

	/**
	 * Insert a (key, value) pair in the map.
	 * Return the old value, if the key was in the map before this insertion.
	 * If not, return null.
	 */
	@Override
	public V put(K key, V value) {
		// guard for empty map
		// TODO

		// guard for key found in first node
		// TODO

		// TODO

		return null;
	}

	/**
	 * Remove the (key, value) pair with the key as key from the map.
	 * Return the value, if the key was in the map before this removal.
	 * If not, return null.
	 */
	@Override
	public V remove(K key) {
		// guard for empty map
		// TODO

		// guard for key found in first node
		// TODO

		// TODO

		return null;
	}

	/**
	 * Return a set with all the keys in the map.
	 */
	@Override
	public Set<K> keys() {
		Set<K> keys = new LinkedHashSet<K>();

		// TODO

		return keys;
	}

	/**
	 * Return a list with all the values in the map.
	 */
	@Override
	public List<V> values() {
		List<V> values = new LinkedList<V>();

		// TODO

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
