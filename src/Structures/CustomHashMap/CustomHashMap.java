package Structures.CustomHashMap;


public class CustomHashMap {
    private final HashNode[] table;
    private int numOfBuckets;
    private int size; // кол-во нод во всей таблице

    public CustomHashMap() {
        table = new HashNode[10];
        this.size = 0;
    }

    public CustomHashMap(int capacity) {
        this.numOfBuckets = capacity;
        table = new HashNode[numOfBuckets];
        this.size = 0;
    }

    private static class HashNode {
        private final Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(Integer key, String value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("Key or Value equals null");
        }
        int bucketIndex = getIndex(key);
        HashNode head = table[bucketIndex];
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = table[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        table[bucketIndex] = node;
    }

    private int getIndex(Integer key) {
        return key % numOfBuckets;
    }

    public String get(Integer key) {
        if (key == null) {
            throw new IllegalArgumentException("Key equals null");
        }
        int bucketIndex = getIndex(key);
        HashNode head = table[bucketIndex];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public String remove(Integer key) {
        if (key == null) {
            throw new IllegalArgumentException("Key equals null");
        }
        int index = getIndex(key);
        HashNode head = table[index];
        HashNode previous = null;
        while (head != null) {
            if (head.key.equals(key)) {
                break;
            }
            previous = head;
            head = head.next;
        }
        if (head == null) {
            return null;
        }
        size--;
        if (previous != null) {
            previous.next = head.next;
        } else {
            table[index] = head.next;
        }
        return head.value;
    }


}
