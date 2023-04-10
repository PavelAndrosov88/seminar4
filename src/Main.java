import lesson4.Task;
import lesson4.Task1;

public class Main {
    public static void main(String[] args) {

                Task.revers(10);
                Task1 queue = new Task1(10);
                // Исходный список
                queue.print();
                // enqueue:
                System.out.println("Поместили элемент в конец очереди:");
                queue.enqueue(111);
                queue.print();
                // dequeue:
                System.out.println("Первый элемент: " + queue.dequeue() + ",удалили");
                queue.print();
                // first:
                System.out.println("Первый элемент: " + queue.first() + ",оставили");
                queue.print();
        }

    }






