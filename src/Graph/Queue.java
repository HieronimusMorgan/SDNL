package Graph;

import java.util.NoSuchElementException;


public class Queue {

    private int[] elemen;
    private int front = 0;
    private int rear = 0;
    private int size;

    public Queue() {
    }

    public Queue(int size) {
        elemen = new int[size];
        size = 0;
    }

    public boolean enqueue(int data) {
        if (elemen.length != size) {
            elemen[rear++] = data;
            if (rear == elemen.length) {
                rear = 0;
            }
            size++;
            return true;
        } else {
            return false;
        }
    }

    public int dequeue() {
         if (!isEmpty()) {
            if (size == 0) {
                return -1;
            } else {
                int bantu = elemen[front];
                if (front + 1 == elemen.length) {
                    front = 0;
                } else {
                    front++;
                }
                size--;
                return bantu;
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }
}
