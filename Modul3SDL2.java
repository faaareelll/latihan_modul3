package com.mycompany.modul3sdl2;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author faaareell
 */
public class Modul3SDL2 {

    public void queueExample() {
        Queue queue = new LinkedList();
        queue.add("java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");        
        System.out.println("Remove : " + queue.remove());
        System.out.println("element : " + queue.element());
        System.out.println("poll : " + queue.poll());
        System.out.println("peek : " + queue.peek());
    }
    public static void main(String[] args) {
        new Modul3SDL2().queueExample();
    }
}
