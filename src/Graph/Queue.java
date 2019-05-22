/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

/**
 *
 * @author basisb16
 */
public class Queue {

    private int[] elemen;
    private int front = 0;
    private int rear = 0;
    private int size;

    public Queue() {
    }

    public Queue(int size) {
        this.size = size;
        elemen = new int[size];
    }

    public boolean enqueue(int elemen) {
        if (!isEmpty()) {
            this.elemen[rear] = elemen;
            rear++;
            return true;
        }

        return false;
    }

    public int dequeue() {
        if (!isEmpty()) {
            if (front != rear) {
                int a = elemen[front];

                front++;
                return a;
            }
        }
        System.exit(0);
        return 0;
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
