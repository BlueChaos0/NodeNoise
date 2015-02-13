package com.vorsutusgames.nn.nodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tyler on 2/12/2015.
 */
public class NodePool
{

	protected static int DEFAULT_MAX_NODES = 32;
	protected List<Node> nodes;

	public NodePool()
	{
		this(DEFAULT_MAX_NODES);
	}

	public NodePool(int maxNodes)
	{
		nodes = new ArrayList<Node>(maxNodes);
	}

	/**
	 * Prepares and returns a new {@link com.vorsutusgames.nn.nodes.Node}. Use this instead of <code>new
	 * Node(NodePool)</code>.
	 *
	 * @return A new Node
	 */
	public Node newNode()
	{
		Node node = new Node(this);
		nodes.add(node.nodeId, node);
		return node;
	}

	public Node getNode(int id)
	{
		return nodes.get(id);
	}

}
