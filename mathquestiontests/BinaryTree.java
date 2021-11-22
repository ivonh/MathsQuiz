/*
    Binary Tree class
    Generic type <T> which uses IComparable interface
    needed to use the CompareTo() method

    Developed by Hans Telford, 2019
    Version 1.1

    This work is licensed under Creative Commons Attribution
    Licensees may copy, distribute, display and perform the work 
    and make derivative works and remixes based on it 
    only if they give the author or licensor the credits (attribution) 
    in the manner specified by these.
*/

package mathquestiontests;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree <T extends Comparable <T>>
{
    // properties
    private Node<T> root;
    private int count;
    private String traversalString;

    // constructor - initialise the Binary Tree structure 
    //               and set up the root node with a null memory address
        
    public BinaryTree()
    {
        root = null;
        count = 0;
        traversalString = "";
    }

    // Get the root node
    public Node<T> getRoot()
    {
        return root;
    }


    // Get the node count of the Binary Tree structure
    public int size()
    {
        return count;
    }

    // Get the height of the Binary Tree structure
    // e.g. number of nodes along the longest path from root node to furthest leaf node
    public int getHeight(Node<T> root)
    {
        if (root == null)
        {
            return 0;
        }
        else
        {
            // compute height of each sub-tree
            int leftSideHeight = getHeight(root.leftChild);
            int rightSideHeight = getHeight(root.rightChild);
            // use the larger
            if (leftSideHeight > rightSideHeight)
            {
                return (leftSideHeight + 1);
            }
            else
            {
                return (rightSideHeight + 1);
            }
        }
    }

    // Add a node to the Binary Tree structure
    public void add (T data)
    {
        // Create the node
        Node<T> newNode = new Node<T>(data);
        // check if the root is null
        // if so, assign the root to newNode
        if (root == null)
        {
            root = newNode;
            count++;
        }
        else
        {
            Node<T> current = root;
            Node<T> parent;

            while (true)
            {
                parent = current;
                // check if data is the same as the parent data
                // and if so, ignore
                if (data.compareTo(current.data) == 0)
                {
                    // duplicate - ignore the node
                    return;
                }
                // check if data is less than the parent data
                // and if so, assign current to the left node
                if (data.compareTo(current.data) == -1)
                {
                    current = current.leftChild;
                    if (current == null)
                    {
                        parent.leftChild = newNode;
                        count++;
                        return;
                    }
                }
                // data is now greater than the parent data
                // in this case, assign current to the right node
                else
                {
                    current = current.rightChild;
                    if (current == null)
                    {
                        parent.rightChild = newNode;
                        count++;
                        return;
                    }
                }

            } // end while loop

        } // end if-else

    } // end Add() method

    // Contains() method --- looks for a specific value and returns boolean
    // true if found and false if not found
    public boolean contains (T value)
    {
        return (this.find(value) != null);
    }

    // Find() method called from Contains() method
    public Node<T> find (T value)
    {
        Node<T> nodeToFind = getRoot();

        while (nodeToFind != null)
        {
            if (value.compareTo(nodeToFind.data) == 0)
            {
                // found
                return nodeToFind;
            }
            else
            {
                // search left if the value to find is smaller than the current node
                if (value.compareTo(nodeToFind.data) == -1)
                {
                    nodeToFind = nodeToFind.leftChild;

                }
                // search right if the value to find is greater than the current node
                else if (value.compareTo(nodeToFind.data) == 1)
                {
                    nodeToFind = nodeToFind.rightChild;
                }
            }
        }

        // not found
        return null;
    }

    // Traverse through the Binary Tree structure using 
    // Preorder method of Root-L-R
    public void preOrder(Node<T> root)
    {
        // Order of method: (Root-L-R)
        if (root != null)
        {
            traversalString += root.data.toString() + ", ";
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }

    // Traverse through the Binary Tree structure 
    // using Postorder method of L-R-Root
    public void postOrder(Node<T> root)
    {
        // Order of method: (L-R-Root)
        if (root != null)
        {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            traversalString += root.data.toString() + ", ";
        }
    }

    // Traverse through the Binary Tree structure 
    // using Inorder method of L-Root-R
    // This method produces an ordered display of the values
    public void inOrder(Node<T> root)
    {
        // Order of method: (L-Root-R)

        if (root != null)
        {
            inOrder(root.leftChild);
            traversalString += root.data.toString() + ", ";
            inOrder(root.rightChild);
        }
    }

    // Traverse through the Binary Tree structure using Breadth-First method
    // uses a queue to systematically traverse every node by level (left to right)
    public void breadthFirst()
    {
        // breadth-first using a queue
        Queue<Node<T>> q = new LinkedList<Node<T>>();
        q.add(this.root);
        
        // loop until the queue is empty
        while (q.size() > 0)
        {
            // get current node
            Node<T> n = q.poll();
            traversalString += n.data.toString() + ", ";
            
            if (n.leftChild != null)
            {
                q.add(n.leftChild);
            }
            if (n.rightChild != null)
            {
                q.add(n.rightChild);
            }
        }
    }
    
    // Traverse through the Binary Tree structure using Depth-First method
    // using a stack to systematically traverse every node starting with the root node
    // and moving down the right side of the root node
    public void depthFirst()
    {
        // depth-first using a stack
        Stack<Node<T>> s = new Stack<Node<T>>();
        s.push(this.root);
        while (s.size() > 0)
        {
            Node<T> n = s.pop();
            traversalString += n.data.toString() + ", ";
            if (n.leftChild != null)
            {
                s.push(n.leftChild);
            }
            if (n.rightChild != null)
            {
                s.push(n.rightChild);
            }
        }
    }
    
    // Get traversal string value
    public String getTraversalString()
    {
        return traversalString;
    }
    
    // reSet traversal string value
    public void resetTraversalString()
    {
        traversalString = "";
    }
    
}