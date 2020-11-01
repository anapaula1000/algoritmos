import java.util.ArrayList;
import java.util.Stack;

public class DepthFirstSearch extends AbstractSearch{

    No startNode;
    No goalNode;

    public DepthFirstSearch(No start, No goalNode){
        super(start, goalNode);
        this.startNode = start;
        this.goalNode = goalNode;
    }

    public boolean execute(){
        if(this.startNode.equals(goalNode)){
            System.out.println("Goal Node Found at 0 depth");
            System.out.println(startNode);
        }
        Stack<No> nodeStack = new Stack<>();
        ArrayList<No> visitedNodes = new ArrayList<>();

        nodeStack.add(startNode);

        while(!nodeStack.isEmpty()){
            No current = nodeStack.pop();
            if(current.equals(goalNode)){
                System.out.println(current.stationName);
                return true;
            }
            else {
                System.out.println(current.stationName);
                visitedNodes.add(current);
                nodeStack.addAll(current.getChildren());
            }
        }
        return false;
    }

}
