public class BinaryTreeArrayMain10 {
    public static void main(String[] args) {
        BinaryTreeArray10 bta = new BinaryTreeArray10();
        // int[] data = {6,4,8,3,5,7,9,0,0,0};

        int idxLast = 6;

        bta.add(11);
        bta.add(8);
        bta.add(2);
        bta.add(6);
        bta.add(3);
        // bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");

        System.out.print("Pre-order traversal: ");
        bta.traversePreOrder();
        System.out.println();

        System.out.print("Post-order traversal: ");
        bta.traversePostOrder();
        System.out.println();
    }
}