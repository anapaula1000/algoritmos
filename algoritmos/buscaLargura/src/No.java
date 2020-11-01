import java.util.ArrayList;

public class No {
    public String stationName;
    No leftChild;
    No rightChild;

    public No(String stationName, No firstChild, No secondChild){
        this.stationName = stationName;
        this.leftChild = firstChild;
        this.rightChild = secondChild;
    }
    public ArrayList<No> getChildren(){
        ArrayList<No> childNodes = new ArrayList<>();
        if(this.leftChild != null)
        {
            childNodes.add(leftChild);
        }
        if(this.rightChild != null) {
            childNodes.add(rightChild);
        }
        return childNodes;
    }

    public boolean removeChild(No n){
        return false;
    }
}
