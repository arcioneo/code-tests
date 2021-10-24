package com;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import beans.Installer;

/**
We are in charge of designing a system to install packages. 
We are required to support the installation of a package and all of its dependent packages. 
Here is an example of a package structure that we would need to install:

A depends on B, C
B depends on D, E, F
C depends on F
F depends on G

Define what a package looks like and code a solution to this problem.

Lets assume the installation logic for a singular package will be implemented by the appropriate platform teams. 
We just need to agree on an interface.
**/

public class DependecyManagerTest {
	
	private DependecyManager subject;

    @Before
    public void setUp() {
        subject = new DependecyManager();
    }

    @Test
    public void installDependency() {
  
    	Installer g = new Installer("G", null);
    	Installer e = new Installer("E", null);
    	Installer d = new Installer("D", null);
    	
    	Installer f = new Installer("F", asList(g));
    	Installer c = new Installer("C", asList(f));
    	Installer b = new Installer("B", asList(d,e,f));
    	
    	Installer a = new Installer("A", asList(b, c));
    	
    	assertEquals("GFEDCBA", subject.installDependency(a));
    }
    
    @Test
    public void installDependency_whenParamsAreNull_returnsEmptyString() {
    	assertEquals("", subject.installDependency(null));
    }
    
    @Test
    public void installDependency_whenIsOnlyOneNode_returnsThatNode() {
    	assertEquals("A", subject.installDependency(new Installer("A", null)));
    }

}
