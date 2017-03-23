public class Stack{
  // Properties
  private Node top = null;

  // Constructor: Using default constructor
  
  // Getter/Setter Methods
  
  public Node getTop() {
    return this.top;
  }
  
  public void setTop(Node newNode) {
    this.top = newNode;
  }
  
  /* Traverses & prints list */
  public void print() {
    if (this.isEmpty()) {
      System.out.println("List is empty.");
    }
    else {
      Node tmp = this.top;
      while (tmp != null) {
        tmp.print();
        tmp = tmp.getNext();
      }
      System.out.println("");
    }
  }
  
  public boolean isEmpty() {
    return this.top==null;
  }
  
  /*public void add(int index, int data) {
    Node newNode = new Node(data);
    
    if( index > this.size)
      //error
      System.out.println("Index " + index + " does not exist.");
    else {
      // if list is empty, newNode is head
      if (this.isEmpty()) {
        this.head = newNode;
      }
      // adds to front of list
      else if (index == 0) {
        newNode.setNext(head);
        this.head = newNode;
      }
      else if (index == this.size) {
        // adds to end of list
        Node current = this.head;
        while (current.getNext() != null) {
          current = current.getNext();
        }
        current.setNext(newNode);
      }
      else {
        // adds to middle of list
        Node current = this.head;
        for(int i = 0; i < index - 1; i++) {
          current = current.getNext();
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
      }
    
    
    

   
    }
  }*/
  
  
  
  
  
  public void destroy() {
    this.top = null;
  }
  
}