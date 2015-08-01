import java.util.ArrayList;
import java.util.List;

public class Tree {
	
	static Node node;
	static Node root = null;
	static int stringLength;
	static Node currentNode; 
	
	public static void setRoot(){
		root = new Node("start", 0L, 0);
		currentNode = root;
	}
	
	public static void insertNode(Long value) {
		if(!currentNode.getChildren().isEmpty()){
			List<Node> l = currentNode.getChildren();
 			for (Node node : l) {
				// value schon vorhanden
				if(node.getValue().equals(value)){
					currentNode = node;
					return;
					// possibility +1
//					insertNode(value);
				}
				// value nicht vorhanden
				else {
					node.addChildNode(new Node("h", value, 0));
					return;
				}
			}
		}
		else {
			currentNode.addChildNode(new Node("h", value, 0));
		}
	}
	
//	public static void insertNode(Long value) {
//		List<Node> l = currentNode.getChildren();
//		for (Node node : l) {
//			// value schon vorhanden
//			if(node.getValue().equals(value)){
//				
//			}
//			// value nicht vorhanden
//		}
//		
//	}
	
//	public static void addNode(String word, Long value, int possibility){
//		
//		if(root == null) {
//			root = new Node("start", 0L, 0);
//		}
//		
//		String digit = Long.toString(value);
//		System.out.println(digit);
//			
//			/*
//			 *  check ob firstDigit im Tree vorhanden
//			 *		wenn Ja
//			 *			-> gehe in die children Liste
//			 *		wenn NEIN
//			 *			-> mache neues child mit diesem Wert
//			 *	hole nächste Digit 
//			 */
//		
//	}
//	
//	public void traversTree(Node currentNode, String digit) {
//		
//		if(!root.equals(Integer.parseInt(digit))){
//			System.out.println("equals nicht");
//			List<Node> children = root.getChildren();
//			if(!children.isEmpty()){
//				for (Node node : children) {
//					if(node.getValue().equals(digit)){
//						node.addChildNode(new Node(word, value, possibility));
//					}
//					else {
//						System.out.println("hängs an die node");
//					}
//				}
//			}
//			else {
//				root.addChildNode(new Node(word, value, possibility));
//			}
//		}	
//	}
	
	

	public static void printNode(){
		
//		System.out.println("Node:" + root.getValue());
		System.out.println("\n");
		List<Node> l = root.getChildren();
			if(l.size() != 0) {
				for (Node node : l) {
					System.out.println(node.getValue());
					if(!node.getChildren().isEmpty()){
						List<Node> li = node.getChildren();
						for (Node node2 : li) {
							System.out.println(node2.getValue());
						}
					}
				}
			}
	}
	
//	public static void main(String[] args) {
//		
//		if(root == null) {
//			setRoot();
//		}
//		
//		insertNode(1L);
//		printNode();
//		insertNode(5L);
//		printNode();
//		
//		root = currentNode;
//		insertNode(1L);
//		printNode();
//		insertNode(8L);
//		printNode();
//		
//		root = currentNode;
//		insertNode(3L);
//		printNode();
//		insertNode(4L);
//		printNode();
//	}
}
