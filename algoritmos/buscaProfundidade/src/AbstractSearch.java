public abstract class AbstractSearch {

    No startNode;
    No goalNode;

    public AbstractSearch(No startNode, No goalNode){
        this.startNode = startNode;
        this.goalNode = goalNode;
    }

    public abstract boolean execute();

}