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


        test.put(4,0);
        test.put(10,0);
        test.put(6,0);
        test.put(2,0);
        test.put(9,0);
        test.put(7,0);
        test.put(3,0);
        test.put(5,0);
        test.put(4.5,0);
        test.put(8,0);

        RedBlackBST<Integer,String> rbBST;
        Node <Integer, String> one= new RBNode<>(20,"dumb",3,false);
        RBNode<Integer, String> left= new RBNode<>(8,"dumber",1,false);
        RBNode<Integer, String> right= new RBNode<>(12,"dumbest",1,true);
        one.setRight(right);
        one.setLeft(left);
        RBNode<Integer, String> leftRight= new RBNode<>(9,"dumbest",1,true);
        left.setRight(leftRight);
        rbBST= new RedBlackBST<>(one);
        System.out.println(rbBST.isEmpty());
        System.out.println(rbBST.isRBT());
        rbBST.rotateRight(one);
        System.out.println(rbBST.gParent(left));


        }
}