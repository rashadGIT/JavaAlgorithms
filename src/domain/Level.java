package domain;

public class Level {
    public BinaryTree root;
    public int depth;

    public Level(BinaryTree root, int depth){
        this.root = root;
        this.depth = depth;
    }
}
