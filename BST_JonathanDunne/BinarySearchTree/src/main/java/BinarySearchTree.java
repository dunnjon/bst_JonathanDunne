public class BinarySearchTree {

    class Node {
        int key;
        Node right, left;

        public Node(int data) {
            key = data;
            right = null;
            left = null;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }
    }

    Node root;

    BinarySearchTree() {
        root = null;
    }


    int minValue(Node root) {
        int minval = root.key;
        while (root.left != null) {
            minval = root.left.key;
            root = root.left;
        }

        return minval;
    }

    void insert(int key) {
        root = insert(root, key);
    }

    Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insert(root.left, key);
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        }
        return root;
    }

    void delete(int key) {
        root = delete(root, key);
    }

    Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.key) {
            root.left = delete(root.left, key);
        } else if (key > root.key) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.key = minValue(root.right);
            root.right = delete(root.right, root.key);
        }

        return root;
    }

    void order() {
        order(root);
    }

    void order(Node root) {
        if (root != null) {
            order(root.left);
            System.out.print(root.key);
            order(root.right);
        }
    }

    boolean search(int key) {
        root = search(root, key);

        if (root != null) {
            return true;
        } else {
            return false;
        }
    }

    Node search(Node root, int key) {

        if (root == null || root.key == key) {
            return root;
        } else if (root.key > key) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
