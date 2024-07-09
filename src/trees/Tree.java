package trees;

public class Tree {
    private Node root;
    private int size = 0;
    
    public Tree(){
        this.root = new Node();
    }
    
    public Node getRoot(){
        return this.root;
    }
    
    public void printPreOrder(Node root){
        if(root != null){
            System.out.print(root.key + "(");
            printPreOrder(root.left);
            printPreOrder(root.right);
            System.out.print(")");
        }
    }
    
    public void printInOrder(Node root){
        if(root != null){
            printInOrder(root.left);
            System.out.print(root.key + " ");
            printInOrder(root.right);
        }
    }
    
    public void printPosOrder(Node root){
        if(root != null){
            printPosOrder(root.left);
            printPosOrder(root.right);
            System.out.print(root.key + " ");
        }
    }
    
    public Node insert(Node root, Node no){
        if(this.size == 0){
            this.root = no;
            size++;
            return no;
        }
        if(root == null){
            root = no;
            size++;
            return root;
        }
        else if((int)no.key < (int)root.key)
            root.left = insert(root.left, no);
        else
            root.right = insert(root.right, no);
        return root;
    }
    
    public void insert(int value){
        Node no = new Node(value);
        insert(this.getRoot(), no);
    }
    
    public int getSize(){
        return this.size;
    }
    
    public int countElements(Node root){
        if(root == null)
            return 0;
        else
            return countElements(root.left) + 1 + countElements(root.right);
    }
    
    public Node isThere(Node root, int num){
        if(this.size == 0)
            return null;
        if((int)root.key == num)
            return root;
        else if((int)root.key > num)
            root.left = isThere(root.left, num);
        else
            root.right = isThere(root.right, num);
        return null;
    }
}