package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import beans.Node;


/**
 * Complete the function decode_huff in the editor below. It must return the decoded string.
 * decode_huff has the following parameters:
 * 
 * root: a reference to the root node of the Huffman tree
 * s: a Huffman encoded string
 * 
 * Note: To see root example see 'HufmanTree.png' under resources folder
 * 
 *
 */

public class HuffmanDecodingTest {
	
	private HuffmanDecoding subject;

    @Before
    public void setUp() {
        subject = new HuffmanDecoding();
    }

    @Test
    public void decode() {
    	Node left1_left = new Node(1, 'B', null, null);
    	Node left1_right = new Node(1, 'C', null, null);
    	
    	Node left1 = new Node(2, 'Ω', left1_left, left1_right);
    	Node right1 = new Node(3, 'A', null, null);
    	
    	Node root = new Node(5, 'Ω', left1, right1);
    	
		assertEquals( "ABACA", subject.decode("1001011",root));
    }
    
    
}
