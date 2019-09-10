package com.bridgelabz.datastructure;

public class OrderedList<T> {
    LinkedList<T> baseList = new LinkedList<T>();
    
    public boolean add(T data) {
        baseList.add(data);
        baseList.sort();
        return true;
    }
    
    public boolean remove(T data) {
        baseList.remove(data);
        return true;
    }
    
    public boolean contains(T data){
        return(baseList.search(data));
    }
    
    public T readAt(int index) {
        return baseList.readAt(index);
    }
    
    public void display() {
        baseList.read();
        System.out.println("");

    }
    
    public boolean isEmpty() {
        return baseList.isEmpty();
    }
    
    public int size() {
        return baseList.size();
    }
}


