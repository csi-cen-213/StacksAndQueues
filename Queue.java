public class SinglyLinkedList{
  // Properties
  private Node head = null;
  private int size = 0;

  // Constructor: Using default constructor
  
  // Getter/Setter Methods
  
  public Node getHead() {
    return this.head;
  }
  
  public void setHead(Node newNode) {
    this.head = newNode;
    // TEST: will this work in all circumstances?
    this.size = 1;
  }

  public int getSize() {
    return this.size;
  }
  
  /* Traverses & prints list */
  public void print() {
    if (this.isEmpty()) {
      System.out.println("List is empty.");
    }
    else {
      Node tmp = this.head;
      while (tmp != null) {
        tmp.print();
        tmp = tmp.getNext();
      }
      System.out.println("");
    }
  }
  
  public boolean isEmpty() {
    return this.head==null;
  }
  
  public void add(int index, int data) {
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
    
    
    

   
    // Write pseudocode to do entire add method
    // use addToBeginning, addToEnd to stand in
    // for the stuff we already have done
    this.size++;
    }
  }
  
  // Finds a node and returns its reference
  public Node find(int index) {
    // BUG: null pointer exception when index < 0
    Node tmp = head;
    if (index < 0 || index > size) {
      //System.out.println("Find: " + index);
      return null;
    }
    else {
      for (int i = 0; i < index; i++)
        tmp = tmp.getNext();
      return tmp;
    }
  }
  
  // Deletes node at index if it exists
  public void delete(int index) {
    Node tmp = this.head;
    int i = 0;
    // delete head
    if (index == 0) {
      this.head = this.head.getNext();
    }
    // delete nodes later in list
    while (tmp.getNext() != null 
             && i < index-1) {
      //System.out.println("Delete: " + i);
      tmp = tmp.getNext();
      i++;
    }
    if (index < 0) {
      System.out.println("Index can't be negative.");
    }
    else {
      try {
        tmp.setNext(tmp.getNext().getNext());
        size--;
      }
      catch (Exception e) {
        System.out.println("That index does not exist.");
      }
    }
  }
  
  public void destroy() {
    this.head = null;
  }
  
}