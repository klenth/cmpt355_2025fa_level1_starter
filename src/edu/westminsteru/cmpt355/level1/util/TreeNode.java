package edu.westminsteru.cmpt355.level1.util;

/** Interface representing a tree node - used by Tree class */
public interface TreeNode<T extends TreeNode<T>> {

    Iterable<? extends T> children();
}
