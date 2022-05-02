package single_linked_lists;

public class Runner {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insertNode(10);
        l.insertNode(20);
        l.insertNode(40);
        l.insertAt(2,1000);
        l.show();
        //method calling
    }
}
