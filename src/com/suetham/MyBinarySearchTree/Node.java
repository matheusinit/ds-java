/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author 20201014040024
 */
public class Node {
    private Node parent;
    private Object element;
    private Node leftChild;
    private Node rightChild;
    
    public Node(Object element) {
        this.element = element;
    }
    
    public int childrenSize() {
        int counter = 0;
        
        if (leftChild != null) {
            counter++;
        }
        
        if (rightChild != null) {
            counter++;
        }
        
        return counter;
    }
    
    public Node parent() {
        return parent;
    }
    
    public Node leftChild() {
        return leftChild;
    }
    
    public Node rightChild() {
        return rightChild;
    }
    
    public Object element() {
        return element;
    }
    
    public void setParent(Node parent) {
        this.parent = parent;
    }
    
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
    
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
    
    public void setElement(Object element) {
        this.element = element;
    }
    
    public void addChild(Object element) {
        Node node = new Node(element);
        
        node.parent = this;
        
        if ((int) element <= (int) this.element && leftChild == null) {
            leftChild = node;
        } else if ((int) element >= (int) this.element && rightChild == null) {
            rightChild = node;
        }
    }
    
    public void printStatus() {
        System.out.print(" - Parent Ref: " + (this.parent == null ? this.parent : this.parent.element));
        System.out.print(" - Left Child: " + (this.leftChild == null ? this.leftChild : this.leftChild.element));
        System.out.print(" - Right Child: " + (this.rightChild == null ? this.rightChild : this.rightChild.element));
        
        System.out.println();
    }
}
