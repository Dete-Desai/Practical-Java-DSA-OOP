public class Application {
    public static void main(String[] args) {
        BinarySearchTrees bst = new BinarySearchTrees();
        bst.insert(50, "Value 50");
        bst.insert(30, "Value 30");
        bst.insert(70, "Value 70");

        System.out.println("Minimum Node: " + bst.findMinimum().value);
        System.out.println("Maximum Node: " + bst.findMaximum().value);
        System.out.println("Search for key 30: " + bst.search(30).value);
        System.out.println("Search for key 100: " + (bst.search(100) != null ? bst.search(100).value : "Not found"));
        System.out.println("In-order Traversal:");
        bst.inOrderTraversal(bst.getRoot());
        System.out.println("Pre-order Traversal:");
        bst.preOrderTraversal(bst.getRoot());
        System.out.println("Post-order Traversal:");
        bst.postOrderTraversal(bst.getRoot());
        System.out.println("Remove node 30: " + bst.remove(30));
    }
}
