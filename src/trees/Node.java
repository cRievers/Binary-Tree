/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trees;

/**
 *
 * @author 0076890
 */
public class Node<T> {
    T key;
    Node left;
    Node right;
    
    public Node(){
        this.key = null;
        this.left = null;
        this.right = null;
    }
    
    public Node(T value){
        this.key = value;
        this.left = null;
        this.right = null;
    }
}
