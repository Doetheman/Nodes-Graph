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
public interface GNode {
    //Name of graph node
    public String getName();
    //return an array of children gnodes
    public GNode[] getChildren();
}