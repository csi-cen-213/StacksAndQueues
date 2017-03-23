public class Main{
  public static void main(String [ ] args) {
    // test default constructor
    /*Node myNode = new Node();
    System.out.println(myNode.getData());
    System.out.println(myNode.getNext());*/
    /*Node myOtherNode = new Node(5);
    System.out.println(myOtherNode.getData());
    System.out.println(myOtherNode.getNext());
    // test print
    myOtherNode.print();*/
    
    SinglyLinkedList ll = new SinglyLinkedList();
    /*System.out.println(ll);
    System.out.println(ll.getHead());
    System.out.println(ll.getSize());
    ll.setHead(new Node(2));
    System.out.println(ll.getHead());
    //ll.getHead().print();
    //System.out.println(ll.getSize());
    ll.print();*/
    
    // test isEmpty works
    /*ll.print();
    ll.setHead(new Node(5));
    ll.print();*/
    
    // test adding to font of list
    ll.add(0,1);
    ll.add(0,2);
    ll.add(0,3);
    ll.add(0,4);
    ll.add(0,5);
    ll.add(5, 20);
    ll.add(6, 21);
    //ll.add(100, 5);
    
    /*ll.add(5, 10);
    ll.add(3, 1000);
    
    ll.find(3).print();
    System.out.println();
    //ll.find(-1).print();
    //ll.find(1000).print();
    System.out.println(ll.find(-1));
    System.out.println(ll.find(1000));
    if (ll.find(-1) != null) {
      ll.find(-1).print();
    }
    else {
      System.out.println("Node doesn't exist.");
    }
    ll.find(0).print();
    ll.find(0).print();
    System.out.println(8);
    
    ll.print();
    System.out.println("size: " + ll.getSize());*/
    ll.print();
    System.out.println("size: " + ll.getSize());
    ll.delete(-6);
    ll.print();
    System.out.println("size: " + ll.getSize());
    /*ll.print();
    ll.destroy();
    ll.print();*/
  }
}