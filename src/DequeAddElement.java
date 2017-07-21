

	import java.util.Deque;
	import java.util.LinkedList;

	public class DequeAddElement {
	    public static void main(String[] args) {
	        //
	        // Create an instance of deque using LinkedList class.
	        //
	        Deque deque = new LinkedList();
	        
	        //
	        // Insert a word into the deque
	        //
	        deque.add("jumps");

	        //
	        // Insert words at the beginning of the current deque 
	        // elements
	        //
	        deque.addFirst("fox");
	        deque.addFirst("brown");
	        deque.addFirst("quick");
	        deque.addFirst("The");
	        

	        //
	        // Insert words at the end of the current deque elements
	        //
	        deque.addLast("over");
	        deque.addLast("the");
	        deque.addLast("lazy");
	        deque.addLast("dog");
            deque.pollFirst();
            deque.poll();
            

            
	       
	            System.out.println("word = " + deque);
	        
	    }
	}

