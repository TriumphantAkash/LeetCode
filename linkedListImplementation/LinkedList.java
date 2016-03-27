package linkedListImplementation;
public class LinkedList {
	Node listHead;
	
	public void addNode(int data){
		Node n = new Node();
		n.setData(data);
		n.setNext(null);
		
		if(listHead == null){
			listHead = n;
		}else {
			Node temp = listHead;
			while(temp.getNext() != null){
				temp = temp.getNext();
			}
			
			temp.setNext(n);
		}
	}
	
	public void print(){
		Node temp = listHead;
		while(temp != null){
			if(temp == listHead){
				System.out.print(temp.getData());
			}else {
				System.out.print("->"+temp.getData());
			}
			
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	public void deleteLast(){
		if(listHead == null){
			System.out.println("empty list");
			return;
		}
		
		if(listHead.getNext() == null){
			listHead = null;
		}
		
		Node temp = listHead;
		
		while(temp.getNext().getNext() != null){
			temp = temp.getNext();
		}
		
		temp.setNext(null);
		System.gc();
	}
	
	
	public void deleteNode(int val){
		boolean visited = false;
		if(listHead == null){
			System.out.println("empty list");
			return;
		}
		if(listHead.getData() == val){
			listHead = listHead.getNext();
			System.out.println("removed!");
			return;
		}
		
		Node temp = listHead;
		while(temp.getNext() != null){
			visited = true;
			if(temp.getNext().getData() == val){
				//remove temp's next
				temp.setNext(temp.getNext().getNext());
				System.out.println("removed!");
				System.gc();
				return;
			}
			temp = temp.getNext();
		}
		if(visited = true){
			System.out.println("not present! ");
		}
	}
	public void evenOddLL(){
		Node evenHead = listHead.getNext();
		
		Node oddTemp = listHead;
		Node evenTemp = listHead.getNext();
		
		int i = 3;
		Node temp = listHead.getNext().getNext();
		while(temp != null){
			if(i%2 == 0){//even position
				evenTemp.setNext(temp);
				evenTemp = temp;
			}else {//odd position
				oddTemp.setNext(temp);
				oddTemp = temp;
			}
			i++;
			temp = temp.getNext();
		}
		evenTemp.setNext(null);
		oddTemp.setNext(evenHead);
	}
}
