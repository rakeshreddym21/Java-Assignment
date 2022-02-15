package com.Listdemo;

public class SListIterator <T>{
    Node<T> head;
    public SListIterator(SList<T> list){
        this.head=list.head;
    }
    public void add(T data){
        Node<T> temp=head;
        if(head.data!=null){
            Node<T> lastNode=new Node<T>(data);
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=lastNode;
        }
        else{
            temp.data=data;
            temp.next=null;
        }

    }
    public void remove(){
        Node<T> temp=head;
        Node<T> pre=new Node<T>();
        if(temp.next==null) {
            temp.data = null;
        }
        else {
            while(temp.next!=null){
                pre=temp;
                temp=temp.next;
            }
            pre.next=null;

        }
    }

    public void printData(){
        Node<T> node = head;
        System.out.println("List:");
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }

    }

}

