public class Node{
  // Properties
  private int data;
  private Node next;
  
  // Constructor
  public Node() {
    this.data = 0;
    this.next = null;
  }
  
  public Node(int data) {
    this.data = data;
    this.next = null;
  }
  
  // Getter/Setter Methods
  
  public int getData() {
    return this.data;
  }
  
  public void setData(int data) {
    this.data = data;
  }
  
  public Node getNext() {
    return this.next;
  }
  
  public void setNext(Node next) {
    this.next = next;
  }
  
  // Methods
  
  /* Prints data in node */
  public void print() {
    System.out.print(this.data + " ");
  }
  
}