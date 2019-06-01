/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.NoSuchElementException;

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
