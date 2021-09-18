package graph;

import java.util.*;
import java.util.Queue;

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

    public List<NodeGraph> getNeighbores(NodeGraph neighbores){
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
//////////////////////////////////////code 36////////////////////////////////////////////
public List<NodeGraph> breadthFirst(NodeGraph node){
//          List<String> queue =new ArrayList<>();
        //make list to store visited use set to not duplicate
//        Set vistedVertex=new HashSet<>();

    List vistedVertex=new ArrayList();
//  Queue queue=new Queue(); //F way
    Queue<NodeGraph> queueTow =new LinkedList<>(); //sec way
//    queue.enqueue(node);
    queueTow.add(node);
    vistedVertex.add(node);
    while (!queueTow.isEmpty()){
//        NodeGraph temp= (NodeGraph) queue.dequeue();
        NodeGraph temp=  queueTow.remove();
//        allNode.add(temp);
        for(NodeGraph oneNode : getNeighbores(temp)){
            if (!vistedVertex.contains(oneNode)){
                vistedVertex.add(oneNode);
                queueTow.add(oneNode);
            }
        }
    }return (List<NodeGraph>) vistedVertex;


}
    /////////////////37//////////////////////////////
//    public HashMap businessTrip(GraphAdjacencyList graph,ArrayList arrayList){
////        NodeGraph newViretx=new NodeGraph(String v,)
//        //array this array include vertix key
////        ArrayList arrayList1= (ArrayList) graph.adjListMap.keySet();
//        HashMap <Boolean,Integer>hashMap=new HashMap();
//
//            for (NodeGraph vertix :graph.adjListMap.keySet()) {
//
//                for (int cityName = 0; cityName < arrayList.size(); cityName++) {
//                    System.out.println("vertex value"+vertix.value);
//                    System.out.println("city name"+arrayList.get(cityName));
//                    System.out.println(graph.adjListMap.get(vertix));
//
//
//                    if(graph.adjListMap.get(vertix).contains(arrayList.get(cityName))){
//                        System.out.println(vertix.value);
//                        System.out.println(vertix.weight);
//                        hashMap.put(true,vertix.weight);
//            }
//
//        }
//
//        }
//
//          return hashMap;
//    }
////////////////////////////38////////////////////////////////
    public Set<NodeGraph> depthFirst(NodeGraph node){

        //make list to store visited use set to not duplicate
        Set vistedVertex=new LinkedHashSet();


  Stack stack=new Stack(); //F way

    stack.push(node);


        while (!stack.isEmpty()){
        NodeGraph temp= (NodeGraph) stack.pop();

            for(NodeGraph oneNode : getNeighbores(temp)){
                if (!vistedVertex.contains(oneNode)){
                    vistedVertex.add(oneNode);
                    stack.push(oneNode);
                }
            }
        }return (Set<NodeGraph>) vistedVertex;


    }
}
