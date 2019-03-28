package Tree;

public class Main {

    public static void main(String[] args) {
        Tree number = new Tree();
        int[] data = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        for (int i = 0; i < data.length; i++) {
            number.insertNode(data[i]);
        }
        System.out.print("In Order      : ");
        number.inOrderTranversal();
        System.out.println("");
        System.out.print("Pre Order     : ");
        number.preOrderTransversal();
        System.out.println("");
        System.out.print("Post Order    : ");
        number.postOrderTransversal();
        System.out.println("");

        number.depthNode(40);
        number.heightNode(40);
        System.out.println("");
        System.out.print("Leaf Node     : ");
        number.leafNode();
        System.out.println("");
        System.out.print("Descendant    : ");
        number.descendant(38);

    }
}
