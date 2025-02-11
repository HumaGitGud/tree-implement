public class Traversal {
  public static void main(String[] args) {
    TreeNode groot = new TreeNode(77, null, null);

    groot.left = new TreeNode(22, null, null);
    groot.right = new TreeNode(88, null, null);
    groot.left.right = new TreeNode(33, null, null);

    // System.out.println(groot.left.right.value);

    preOrder(groot);
  }

  public static void preOrder(TreeNode node) {
    if (node == null) {
      return;
    }

    System.out.println(node.value);

    preOrder(node.left);
    preOrder(node.right);
  }

}