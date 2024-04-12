package Exercitiul1;

import isp.lab3.exercise1.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeTest {
@Test
public void testGrow()
{
    Tree tree1=new Tree(15);
    assertEquals(15,tree1.getHeight());
    tree1.grow(2);
assertEquals(17,tree1.getHeight());
}
@Test
    public void testToString()
{
Tree tree1=new Tree(15);
assertEquals("Tree{height=15}",tree1.toString());
}
}
