public class BinarySearchTrees {
    private Node root;

    public BinarySearchTrees() {
        root = null;
    }

    public void insert(int key, String value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node findMinimum() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMaximum() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public Node search(int key) {
        Node current = root;

        while (current != null) {
            if (key == current.key) {
                return current;
            } else if (key < current.key) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        return null; // Key not found
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.leftChild);
            System.out.println("Key: " + node.key + ", Value: " + node.value);
            inOrderTraversal(node.rightChild);
        }
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.println("Key: " + node.key + ", Value: " + node.value);
            preOrderTraversal(node.leftChild);
            preOrderTraversal(node.rightChild);
        }
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.leftChild);
            postOrderTraversal(node.rightChild);
            System.out.println("Key: " + node.key + ", Value: " + node.value);
        }
    }

    public boolean remove(int key) {
        Node current = root;
        Node parent = null;
        boolean isLeftChild = false;

        while (current != null && current.key != key) {
            parent = current;
            if (key < current.key) {
                isLeftChild = true;
                current = current.leftChild;
            } else {
                isLeftChild = false;
                current = current.rightChild;
            }
        }

        if (current == null) {
            return false; // Key not found
        }

        // Case 1: Node to be deleted has no children (leaf node)
        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null; // Tree becomes empty
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        }
        // Case 2: Node to be deleted has one child
        else if (current.rightChild == null) { // Only left child
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.leftChild == null) { // Only right child
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        }
        // Case 3: Node to be deleted has two children
        else {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }

        return true; // Node successfully removed
    }

    private Node getSuccessor(Node node) {
        Node successorParent = node;
        Node successor = node;
        Node current = node.rightChild;

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.leftChild;
        }

        if (successor != node.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = node.rightChild;
        }

        return successor;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void displayTree(Node node, int level) {
        if (node != null) {
            displayTree(node.rightChild, level + 1);
            System.out.println(" ".repeat(level * 4) + node.key + " : " + node.value);
            displayTree(node.leftChild, level + 1);
        }
    }
}
