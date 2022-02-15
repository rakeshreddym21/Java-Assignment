package com.Listdemo;

public class SList <T>{
    public Node<T> head;
    public SList(){
        head = new Node<T>();
    }
    public SListIterator<T> Iterator(){
        return new SListIterator<T>(this);
    }

}