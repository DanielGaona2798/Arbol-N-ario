package models;

import java.util.ArrayList;

public class Node<T> {
		
	private T info;
	private ArrayList<Node<T>> nodeList;
	private Node<T> father;
	
	public Node() {
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public ArrayList<Node<T>> getNodeList() {
		return nodeList;
	}

	public void setNodeList(ArrayList<Node<T>> nodeList) {
		this.nodeList = nodeList;
	}

	public Node<T> getFather() {
		return father;
	}

	public void setFather(Node<T> father) {
		this.father = father;
	}

}
