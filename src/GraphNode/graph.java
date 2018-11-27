/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphNode;

/**
 *
 * @author Doetheman
 */
public class graph implements GNode{
    
    //Name of node
    String nodeName;
    //Set name of node
    public void setNodeName(String nodeN){
        this.nodeName = nodeN;
    }
    //Returns name of node
    @Override
    public String getName() {
        return this.nodeName;
    }
    
    GNode[] children;
    public void setChildren(GNode[] children){
        int length = children.length;
        this.children = new GNode[length];
        
    }
    @Override
    public GNode[] getChildren() {
        if(this.children == null){
        GNode[] emptyList = new GNode[0];
        return emptyList;
        }
    }
        public static void main(String[] args) {
        // TODO code application logic here
    }
}
