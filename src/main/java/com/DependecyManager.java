package com;

import java.util.Stack;

import beans.Installer;

public class DependecyManager {

	public String installDependency(Installer root) {
		if(root == null) { return ""; }
		
		StringBuilder sb = new StringBuilder(); 
		Stack<Installer> stack = new Stack<Installer>();
		getDependencies(root,stack);

		while (!stack.isEmpty()) {
			sb.append(stack.pop().getPackageName());
		}
		
		return sb.toString();
	}

	private void getDependencies(Installer installer, Stack<Installer> stack) {
		if(!stack.contains(installer)) {
			stack.add(installer);
		}
		
		
		if(installer.getDependencies() != null) {
			installer.getDependencies().forEach(d -> {
				if(!stack.contains(d)) {
					stack.add(d);
				}
			});
			
			installer.getDependencies().forEach(d -> {
				getDependencies(d, stack);
			});
		}
		
		
	}

}
