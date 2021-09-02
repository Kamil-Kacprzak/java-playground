package javagenerics;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class CollectionEntry {
/*
 * Iterable					
 * 	  |
 * Collection
 * 	  |__________________
 * 	  |     |     	     |							  
 *  1List, 2Set, 	   3Queue 	                      4Map			
 * 			|		     |		                       |________________
 * 	     SortedSet	3.1Deque                           |			  	|
 * 			|		     |		                   SortedMap  	4.2ConcurrentMap  
 * 	  2.1NavigableSet    |		                       |				|
 *					     |						4.1NavigableMap<----4.3ConcurrentNavigableMap
 * 					3.2BlockingQueue
 * 					 	 |__________________
 * 						 | 	    			|
 * 					3.3TransferQueue	   3.4BlockingDeque
 * 
 * 
 * 			|HashTable		|Array					|	Navigable 				|LinkedList						|	Enum
 * ---------|---------------|-----------------------|---------------------------|-------------------------------|---------------
 * Set: 	|2Hashset		|2CopyOnWriteArraySet	|	2.1TreeSet				|2.1ConcurentSkipListSet		|	2EnumSet
 * 			|				|						|							|2LinkedHashSet                 |
 * ---------|---------------|-----------------------|---------------------------|-------------------------------|---------------
 * Queues:	|				|3.2ArrayBlockingQueue	|(Heap) 					|3ConcurentLinkedQueue          |
 * 			|				|3.1ArrayDeque			|3.2DelayQueue				|3.2LinkedBlockingQueue 		|
 *          |				|3.2SynchronousQueue?	|3PriorityQueue				|3.4LinkedBlockingdeque			|
 * 			|				|						|3.2PriorityBlockingQueue	|1/3.1LinkedList                |
 * ---------|---------------|-----------------------|---------------------------|-------------------------------|---------------
 * List:	|				|1ArrayList				|							|1/3.1LinkedList                |
 * 			|				|1CopyOnWriteArrayList  |                           |                               |
 * ---------|---------------|-----------------------|---------------------------|-------------------------------|--------------- 
 * Maps:	|4HashMap       |                       |4.1TreeMap					|4LinkedHashMap                 |   4EnumMap
 * 			|4WeakHashMap	|                       |							|4.3ConcurrentSkipListMap		|
 * 			|4IdentityHashMap|                      |                           |                               |
 * 			|4.2ConcurrenthashMap                   |                           |                               |
 * ---------|---------------|-----------------------|---------------------------|-------------------------------|---------------
 * Obsolete |4HashTable		|1Vector<--Stack 
 * 
 * 				
 * 
 * 								   Iterator			  Concurrent?			
 * -------------------------|----------------------|---------------|
 * 1ArrayList				|       fail-fast      |      N        |
 * 1CopyOnWriteArrayList	|       fail-safe      |      Y        |
 * 1/3.1LinkedList  		|       fail-fast      |      N        |
 * -------------------------|                      |               |
 * 2Hashset					|       fail-fast      |      N        |
 * 2CopyOnWriteArraySet	    |       fail-safe      |      Y        |
 * 2.1TreeSet               |       fail-fast      |      N        |
 * 2.1ConcurentSkipListSet  |          WCI         |      Y        |
 * 2EnumSet			        |          WCI         |      N        |
 * 2LinkedHashSet           |      	fail-fast      |      N        |
 * -------------------------|                      |               |
 * 3.2ArrayBlockingQueue	|          WCI         |      Y        |
 * 3.1ArrayDeque			|       fail-fast  	   |      N        |
 * 3.2SynchronousQueue		|           -          |      Y        |
 * 3PriorityQueue			|       fail-fast      |      N        |
 * 3.2PriorityBlockingQueue |       fail-fast      |      Y        |
 * 3ConcurentLinkedQueue    |       fail-fast      |      Y        |
 * 3.4LinkedBlockingDeque   |          WCI         |      Y        |
 * 3.2DelayQueue            |       fail-fast      |      Y        |
 * 3.2LinkedBlockingQueue   |          WCI         |      Y        |
 * -------------------------|                      |               |
 * 4HashMap      			|      fail-fast       |      N        |
 * 4.1TreeMap               |      fail-fast	   |      N        |
 * 4LinkedHashMap			|      fail-fast       |      N        |
 * 4EnumMap	                |         WCI          |      N        |
 * 4WeakHashMap				|      fail-fast       |      N        |
 * 4IdentityHashMap			|      fail-fast       |      N        |
 * 4.2ConcurrentHashMap  	|      fail-safe       |      Y        |
 * 4.3ConcurrentSkipListMap |         WCI          |      Y        |
 * -------------------------|                      |               |
 * 4HashTable				|      fail-fast       |      Y        |
 * 1Vector<--Stack 			|      fail-fast       |      Y        |
 * -------------------------|--------------------------------------|
 * WCI - modified and removed elements will reflect in iterator, added not necessarily 
 * 
 * 
 * 
 * 
 */              
	public static void main(String[] args) {
		new CollectionEntry();
	}
	public CollectionEntry() {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println("Entry list:"+list+"\n");
		
		System.out.println("FIFO vs LIFO Qs");
		Deque<Integer> dq = new ArrayDeque<>();
		dq.addAll(list);
		Queue<Integer> fifoQ = new ArrayDeque<>(); 
		Collections.addAll(fifoQ, dq.toArray(new Integer[0]));	
		Queue<Integer> lifoQ = Collections.asLifoQueue(dq); 											
 		List<Queue> qList = new ArrayList<>();
 		qList.add(fifoQ);
 		qList.add(lifoQ);
 		for (Queue q : qList) {
 			q.poll();
 			System.out.println(q);
 			q.add(6);
 			System.out.println(q);
 			q.poll();
 			System.out.println(q+"\n"); 			
 		}
 		
 		
	}
	

}