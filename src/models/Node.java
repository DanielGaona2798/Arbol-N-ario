package models;

import java.util.ArrayList;

public class Node<T> {
		
	private T info;
	private ArrayList<Node<T>> nodeList;
	private Node<T> father;
	
	public Node(T info, Node<T> father) {
		this.info = info;
		this.father = father;
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

	public void addListNode(Node<T> newNode){
		nodeList.add(newNode);
	}

	public Node<T> getFather() {
		return father;
	}

	public void setFather(Node<T> father) {
		this.father = father;
	}

}
