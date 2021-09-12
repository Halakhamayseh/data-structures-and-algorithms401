package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphAdjacencyList {
    Map<NodeGraph, ArrayList<NodeGraph>> adjListMap;

    public GraphAdjacencyList() {
        adjListMap= new HashMap();
    }

/////////////////////////add node function

    public NodeGraph addNode(String value){
        NodeGraph nodeGraph=new NodeGraph(value);
        adjListMap.put(nodeGraph,new ArrayList<>());
        return  nodeGraph;
    }

    /////////////////////////////////addEdge///////

    public void addEdge(NodeGraph valueOne,NodeGraph valueTow){
//        NodeGraph nodeGraphOne=new NodeGraph(valueOne);
//        NodeGraph nodeGraphTow=new NodeGraph(valueTow);
        //make relation
        adjListMap.get(valueOne).add(valueTow);
        adjListMap.get(valueTow).add(valueOne);

    }

    ///////////////get neighbores

    public List getNeighbores(NodeGraph neighbores){
      return adjListMap.get(neighbores);

    }
    ////////////////getNode///////////////

    public List getNode(){
        ArrayList result=new ArrayList();
        result.add(adjListMap.keySet());
//        for (NodeGraph   keyNode :adjListMap.keySet()) {
//
//        }
           return result;
    }

    ////////////////////////return size
    public int size(){

          return adjListMap.size();
    }

    /////////////////get
}
