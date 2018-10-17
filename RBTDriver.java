/*
Timi Ryan
Advanced Topics Computer Science
Purpose: tests a stack
22.9.18
*/

public class RBTDriver.java
{

    public static void main(String[] args) {
        RedBlackBST test = new RedBlackBST();
        Node og = new Node(10, "root", 5, false);
        Node l = new Node(5, "left", 1, false);
        Node r = new Node(3, "right", 1, true);

        og.setRight(r);
        og.setLeft(l);

        Node lRight = new Node(7, "lRight", 1, true);
        //Node lLeft = new Node(1, "lLeft", 1, false);

        l.setRight(lRight);
        //l.setLeft(lLeft);

        System.out.println("see if the tree is empty - expected answer: false");
        System.out.println(test.isEmpty());
        System.out.println("check if the tree is a red black tree - expected answer: false");
        System.out.println(test.isRBT());
        System.out.println("see if og is a GParent - expected answer: true");
        System.out.println(og.isGParent());

        test.rotateRight(og);

        System.out.println("retest if the tree is a red black tree - expected answer: true");
        System.out.println(test.isRBT());


        

        }
}