package br.com.thiagojfg.s2it.btree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BinaryTreeTest {
      
    @Test
    public void testSomaComNosNulos() {
    
        BinaryTree binaryTree = new BinaryTree(0, null, null);        
        
        assertEquals(0, binaryTree.somar());
    }
    
    @Test
    public void testSomaComNosFilhos() {
    
        BinaryTree left = new BinaryTree(100, null, null);
        BinaryTree right = new BinaryTree(100, null, null);
        
        BinaryTree binaryTree = new BinaryTree(0, left, right);        
        
        assertEquals(200, binaryTree.somar());
    }
}
