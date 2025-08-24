package PERTEMUAN3;

public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void add(int x) {
        if (root == null) {
            root = new TreeNode(x);
            return;
        }
        TreeNode bantu = root;
        while (true) {
            if (x < bantu.data) {
                if (bantu.leftNode == null) {
                    bantu.leftNode = new TreeNode(x);
                    return;
                }
                bantu = bantu.leftNode;
                continue;
            }
            if (bantu.rightNode == null) {
                bantu.rightNode = new TreeNode(x);
                return;
            }
            bantu = bantu.rightNode;
        }
    }

    public TreeNode getNode(int key) {
        TreeNode bantu = root;
        while (bantu != null) {
            if (key == bantu.data) {
                return bantu;
            }
            if (key < bantu.data) {
                bantu = bantu.leftNode;
                continue;
            }
            bantu = bantu.rightNode;
        }
        return null;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }
}
