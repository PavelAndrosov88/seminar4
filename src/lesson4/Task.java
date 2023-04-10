package lesson4;

import java.util.LinkedList;
public class Task {
    public static void revers(int size) {
        LinkedList<Integer> dataIn = random(size);
               System.out.println(dataIn);
               System.out.println(reverseL(dataIn));
    }

    public static LinkedList<Integer> random(int size) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        for (int i = 0; i < size; i++) {
            result.add((int) (Math.random() * 100));
        }
        return result;
    }

    public static LinkedList<Integer> reverseL(LinkedList<Integer> inList) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        for (Integer element : inList) result.add(0, element);
        return result;
    }
}