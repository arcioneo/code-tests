package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import beans.Node;

public class HuffmanDecoding {

	public String decode(String encoded, Node node) {
		Stack<Character> stack = new Stack<>();
		for (int i = encoded.length() - 1; i >= 0; i--) {
			stack.add(encoded.charAt(i));
		}

		return decode(stack, node, "", node);
	}

	private String decode(Stack<Character> stack, Node node, String decodedValue, Node root) {
		if (stack.isEmpty()) {
			return decodedValue;
		} else {
			Character c = stack.pop();
			node = c == '1' ? node.right : node.left;
			if (isALeaf(node)) {
				decodedValue += node.data;
				return decode(stack, root, decodedValue, root);
			}

			return decode(stack, node, decodedValue, root);

		}
	}

	private boolean isALeaf(Node node) {
		return node.data != 'Ω';
	}

	// *******2nd APPROACH (BOTH WORK)***********

	public String decode2(String encoded, Node node) {

		Map<String, Character> map = getTree(node, new HashMap<String, Character>(), null, "");
		String decodedValue = "";
		String temp = "";

		map.entrySet().forEach(e -> {
			System.out.println(e.getKey() + "->" + e.getValue());
		});

		while (!encoded.isEmpty()) {
			temp += encoded.charAt(0);
			encoded = encoded.substring(1, encoded.length());

			if (map.get(temp) != null) {
				decodedValue += map.get(temp);
				temp = "";
			}
		}

		return decodedValue;

	}

	private Map<String, Character> getTree(Node node, Map<String, Character> map, Node father, String value) {
		if (isALeaf(node)) {
			map.put(value, node.data);
			node.frequency = -1;
			return map;
		} else {
			if (hasRightChild(node)) {
				getTree(node.right, map, node, value + "1");
			}
			if (hasLeftChild(node)) {
				father = node;
				getTree(node.left, map, node, value + "0");
			}
		}

		return map;

	}

	private boolean hasRightChild(Node node) {
		return node.right != null && node.right.frequency != -1;
	}

	private boolean hasLeftChild(Node node) {
		return node.left != null && node.left.frequency != -1;
	}

}
