
public class Node {
    private String data;
    private List<Node> children;
    private Node parent;

    public Node(String data) {
        this.data = data;
        this.children = new ArrayList<Node>();
    }

    public Node(Node node) {
        this.data = node.getData();
        children = new ArrayList<Node>();
    }


    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Node> getChildren() {
        return this.children;
    }

}
