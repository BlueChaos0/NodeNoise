package com.vorsutusgames.nn.nodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tyler on 2/12/2015.
 */
public class NodePool
{

	protected static List<Node> nodes = new ArrayList<Node>(32);

	/**
	 * Prepares and returns a new {@link com.vorsutusgames.nn.nodes.Node}. Use this instead of <code>new
	 * Node(NodePool)</code>.
	 *
	 * @return A new Node
	 */
	public static Node newNode()
	{
		Node node = new Node();
		nodes.add(node.nodeId, node);
		return node;
	}

	public static Node getNode(int id)
	{
		return nodes.get(id);
	}

}
