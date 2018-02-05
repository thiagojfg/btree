package br.com.thiagojfg.s2it.btree;

/**
 * @author Thiago Luiz Alves
 */
public class BinaryTree {

    private final int valor;

    private final BinaryTree leftTree;

    private final BinaryTree rightTree;

    public BinaryTree(int valor, BinaryTree leftTree, BinaryTree rightTree) {
        this.valor = valor;
        this.leftTree = leftTree;
        this.rightTree = rightTree;
    }

    public int somar() {

        int sumLeft = leftTree != null ? leftTree.somar() : 0;
        int sumRight = rightTree != null ? rightTree.somar() : 0;

        return valor + sumLeft + sumRight;
    }
}
