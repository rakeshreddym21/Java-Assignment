package com.Listdemo;

public class Main {

    public static void main(String[] args) {

            SList<String> list=new SList<>();
            SListIterator<String> listIterator=new SListIterator<>(list);
            listIterator.add("Hello");
            listIterator.printData();
            listIterator.remove();
            listIterator.printData();

    }
}

