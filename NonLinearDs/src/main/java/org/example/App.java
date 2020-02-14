package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       BinaryTree bt = new BinaryTree(11);
        bt.add(4);
        bt.add(2);
        bt.add(6);
       bt.add(7);

       bt.balanceTree();
    }
}
