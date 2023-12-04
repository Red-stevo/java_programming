package com.example.demo;

import java.util.Scanner;

public class Graph {


    int i = 0;


Node head;

Node Creater;

public Node createSellerNode()
{
    Node node = new Node();
    return node;
}
Node temp;
Node temp2;

Scanner scanner;

public String readData()
{
    String data;
    scanner = new Scanner(System.in);

    data = scanner.next();
    return  data;
}


public void createGraph()
{

    int k=0;
    while(k < 5)
    {
        Node newNode = createSellerNode();
        System.out.println("Enter your Id");
        newNode.id = readData();

        System.out.println("Enter You Product");
        newNode.product = readData();

        newNode.nextNode = null;



        if(newNode.product.equals("bananas"))
        if(k == 0)
        {
            head = newNode;
            temp = head;
        }
        else
        {
            temp.nextNode = newNode;
            newNode.preNode = temp;
            temp = newNode;
        }
        k++;
    }
        temp = head;
    while(temp.nextNode != null)
    {
        System.out.print("--->"+temp.product);
        temp = temp.nextNode;
    }
    System.out.print("--->"+temp.product);
    System.out.println();


}

    public static void main(String[] args) {
        Graph graph=new Graph();
        graph.createGraph();
    }
}
