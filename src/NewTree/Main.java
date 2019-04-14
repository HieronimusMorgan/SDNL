package NewTree;

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
        number.delete(12);
        number.delete(27);
        number.delete(6);
        number.delete(55);
        System.out.print("In Order      : ");
        number.inOrderTranversal();
        System.out.println("");
    }

}
