package lesson4;

import java.util.LinkedList;
public class Task1 {
    public Task1(int size){
        database = Task.random(size);
        listSize = size;
    }
    private LinkedList<Integer> database = new LinkedList<Integer>();
    private int listSize = 0;
    public void enqueue(int element){
        database.add(element);
        listSize++;
    }
    public int dequeue(){
        if(listSize > 0) {
            listSize--;
            return database.remove(0);
        }
        else {
            throw new RuntimeException("Список пустой");
        }
    }
    public int first(){
        return database.get(0);
    }
       public void print(){
        System.out.println(database);
    }
}
