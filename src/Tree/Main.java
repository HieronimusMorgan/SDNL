package Tree;

public class Main {

    public static void main(String[] args) {
        Tree number = new Tree();
        int[] data = {42, 21, 38, 27, 71, 82, 55, 63, 6, 2, 40, 12};
        for (int i = 0; i < data.length; i++) {
            number.insertNode(data[i]);
        }

        number.inOrderTranversal();
        System.out.println("");
        number.preOrderTransversal();
        System.out.println("");
        number.postOrderTransversal();
        System.out.println("");
        number.depthNode(40);
        System.out.println("");
        number.leafNode();
        System.out.println("nu " + number.getSize());
        number.descendant(21);

    }
}
