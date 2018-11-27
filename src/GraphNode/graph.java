/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Doetheman
 */
public class graph implements GNode{
    
    //Name of node
    String nodeName;
    //set constructor
    graph(String a) {
      this.nodeName = a;

    }
     //Returns name of node
    @Override
    public String getName() {
        return this.nodeName;
    }
    
    
    //Array to store children of node
    GNode[] children;
    //Sets array for children 
    public void setChildren(GNode[] setChildren){
        int length = setChildren.length;
        this.children = new GNode[length];
        int childValue = 0;
        for(GNode x: setChildren){
            this.children[childValue] = x;
            childValue++;
        }
    }
    //returns children array 
    @Override
    public GNode[] getChildren() {
        if(this.children == null){
        GNode[] emptyList = new GNode[0];
        return emptyList;
         } else return this.children;
    }
    
    
    // ArrayList stores nodes in graph
    // NOG is acronym for nodes on graph
    private final ArrayList<GNode> NoG = new ArrayList<>();
    
    //Create method to check for recurring nodes by name?
//    public boolean nodeCheck(GNode node){
//        for(GNode name : node.getChildren()){
//            if(node.getName().equals(name)){
//                return false;
//            }
//        }
//        return true;
//    }
    
    //Stores nodes and children in an Arraylist
    public ArrayList walkGraph(GNode node){
        //String name = node.getName();
       //if(nodeCheck(node)){
        //Adds node to list 
        NoG.add(node);
        for(GNode c : node.getChildren()){
            walkGraph( c );
        }
        
        return NoG;
    }
    //ArrayList inside an arraylist to store path to node
    ArrayList<ArrayList<GNode>> pathNodeList = new ArrayList<>();
    //Previous arraylist of nodes
    ArrayList<GNode> prevNodeList = new ArrayList<>();
    //Instantiating stack to get path in graph (DFS)
    Stack<GNode> stack = new Stack<>();
    //
    public ArrayList paths(GNode node){
        stack.push(node);
        prevNodeList.add(node);
        while(!stack.isEmpty()){
            GNode current = stack.peek();
            
            GNode[] currentChildren = current.getChildren();
            
            for(GNode c : currentChildren){
                paths(c);
            }
            stack.pop();
            prevNodeList.remove(prevNodeList.size() - 1 );
            
            if (currentChildren.length == 0){
                pathNodeList.add(new ArrayList<GNode>(prevNodeList));
            }
            break;
        }
        return pathNodeList;
    }

}
