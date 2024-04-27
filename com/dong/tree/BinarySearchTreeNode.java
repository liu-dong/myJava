package com.dong.tree;

/**
 * 二叉搜索树
 *
 * @author liudong 2024/4/27
 */
public class BinarySearchTreeNode {

    /**
     * 节点值
     */
    private int value;

    /**
     * 左节点
     */
    private BinarySearchTreeNode leftNode;

    /**
     * 右节点
     */
    private BinarySearchTreeNode rightNode;


    public BinarySearchTreeNode(int value, BinarySearchTreeNode... node) {
        this.value = value;
        for (BinarySearchTreeNode binarySearchTreeNode : node) {
            // 小于父节点的放在左子树
            if (binarySearchTreeNode.getValue() <= value) {
                this.leftNode = binarySearchTreeNode;
            }
            // 大于父节点的放在右子树
            if (binarySearchTreeNode.getValue() > value) {
                this.rightNode = binarySearchTreeNode;
            }
        }

    }

    public BinarySearchTreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinarySearchTreeNode getLeftNode() {
        return leftNode;
    }

    public BinarySearchTreeNode getRightNode() {
        return rightNode;
    }

    public void setNode(BinarySearchTreeNode node) {
        // 小于父节点的放在左子树
        if (node.getValue() <= this.value) {
            this.leftNode = node;
        }
        // 大于父节点的放在右子树
        if (node.getValue() > this.value) {
            this.rightNode = node;
        }
    }
}
