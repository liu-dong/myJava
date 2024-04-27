package com.dong.tree;

/**
 * 树节点
 *
 * @author liudong 2024/4/27
 */
public class TreeNode {

    /**
     * 节点值
     */
    private Object value;

    /**
     * 子节点
     */
    private TreeNode[] childNode;


    public TreeNode(Object value, TreeNode... childNode) {
        this.value = value;
    }

    public TreeNode(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public TreeNode[] getChildNode() {
        return childNode;
    }

    public void setChildNode(TreeNode... childNode) {
        this.childNode = childNode;
    }
}
