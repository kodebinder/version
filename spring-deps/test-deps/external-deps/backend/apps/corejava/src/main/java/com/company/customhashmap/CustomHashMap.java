package com.company.customhashmap;

public class CustomHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private Node<K, V>[] table;
    private int size;

    public CustomHashMap() {
        this(DEFAULT_CAPACITY);
    }

    public CustomHashMap(int capacity) {
        table = new Node[capacity];
        size = 0;
    }

    public void put(K key, V value) {
        int index = hash(key);
        Node<K, V> head = table[index];
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        Node<K, V> newNode = new Node<>(key, value);
        newNode.next = table[index];
        table[index] = newNode;
        size++;
        if (size > LOAD_FACTOR * table.length) {
            resize();
        }
    }

    public V get(K key) {
        int index = hash(key);
        Node<K, V> head = table[index];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        Node<K, V> head = table[index];
        if (head != null && head.key.equals(key)) {
            table[index] = head.next;
            size--;
            return;
        }
        Node<K, V> prev = head;
        head = head.next;
        while (head != null) {
            if (head.key.equals(key)) {
                prev.next = head.next;
                size--;
                return;
            }
            prev = head;
            head = head.next;
        }
    }

    public int size() {
        return size;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % table.length);
    }

    private void resize() {
        Node<K, V>[] oldTable = table;
        table = new Node[2 * oldTable.length];
        size = 0;
        for (Node<K, V> head : oldTable) {
            while (head != null) {
                put(head.key, head.value);
                head = head.next;
            }
        }
    }

    private static class Node<K, V> {
        private final K key;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }

}