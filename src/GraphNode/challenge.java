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
public class challenge {
    
   public static void main(String[] args) {
       //Test input 
         graph A = new graph("A"); 
         graph B = new graph("B");
         graph C = new graph("C");
         graph D = new graph ("D");
         graph E = new graph ("E");
         graph F = new graph ("F");
         graph G = new graph ("G");
         graph H = new graph ("H");
         graph I = new graph ("I");
         graph J = new graph ("J");
         GNode[] A_children;
       A_children = new GNode[] { B, C, D};
         A.setChildren(A_children);
         GNode[] B_children;
       B_children = new GNode[] { E, F, G};
         B.setChildren(B_children);
         GNode[] C_children;
       C_children = new GNode[] { H, I, J};
         C.setChildren(C_children);
         
         System.out.println(A.walkGraph(A));
    }
}
