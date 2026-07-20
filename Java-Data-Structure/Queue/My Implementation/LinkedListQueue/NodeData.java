package LinkedListQueue;

public class NodeData {
    private int data;

    public NodeData(int data){
        this.data=data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int compareTo(NodeData nodeData){
        if(data == nodeData.data)return 0;
        if(data < nodeData.data)return -1;
        return 1;
    }

    public String toString() {
        return (" "+data) ;
    }
}
