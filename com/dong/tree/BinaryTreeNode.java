package com.dong.tree;

/**
 * 二叉树
 *
 * @author liudong 2024/4/27
 */
public class BinaryTreeNode {

    /**
     * 节点值
     */
    private Object value;

    /**
     * 左节点
     */
    private BinaryTreeNode leftNode;

    /**
     * 右节点
     */
    private BinaryTreeNode rightNode;


    public BinaryTreeNode(Object value, BinaryTreeNode leftNode, BinaryTreeNode rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public BinaryTreeNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
