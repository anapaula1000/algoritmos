import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    No startNode;
    No goalNode;

    public BreadthFirstSearch(No start, No goalNode){
        this.startNode = start;
        this.goalNode = goalNode;
    }
    public boolean compute(){

        if(this.startNode.equals(goalNode)){
            System.out.println("Goal Node Found!");
            System.out.println(startNode);
        }

        Queue<No> queue = new LinkedList<>();
        ArrayList<No> explored = new ArrayList<>();
        queue.add(this.startNode);
        explored.add(startNode);

        while(!queue.isEmpty()){
            No current = queue.remove();
            if(current.equals(this.goalNode)) {
                //System.out.println(explored);
                return true;
            }
            else{
                if(current.getChildren().isEmpty())
                    return false;
                else
                    queue.addAll(current.getChildren());
                System.out.println(current.stationName);
            }
            explored.add(current);
        }

        return false;

    }

}