import java.util.ArrayList;
import java.util.List;

public class Node {

	private String word;
	private Long value;
	private int possibility;
	
	private Node parent = null;
	private List<Node> children = new ArrayList<Node>();
	
	// public Node(String word, Long value, int possibility){
	
	public Node(String word, Long value, int possibility){
		this.setWord(word);
		this.setValue(value);
		this.setPossibility(possibility);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public int getPossibility() {
		return possibility;
	}

	public void setPossibility(int possibility) {
		this.possibility = possibility;
	}

	public List<Node> getChildren() {
		return children;
	}

	public Node getParent() {
		return parent;
	}
	
	public void addChildNode(Node child) {
	    child.parent = this;
	    if (!children.contains(child))
	    	children.add(child);
	  }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
//		sb.append(getWord());
//		sb.append("\n");
		sb.append(getValue());
//		sb.append("\n");
//		sb.append(getPossibility());
		return sb.toString();
	}
}
