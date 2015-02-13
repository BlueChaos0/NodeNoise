package com.vorsutusgames.nn.nodes;

import java.util.HashMap;

/**
 * Created by Tyler on 2/12/2015.
 */
public final class Node
{

	public static String RELATION_BASE = "base";

	private static int nodeIdCounter = 0;

	public final int nodeId;

	protected HashMap<String, Integer> inputs;
	private int output;
	private NodePool pool;

	protected Node(NodePool pool)
	{
		this.pool = pool;
		nodeId = nodeIdCounter++;
		inputs = new HashMap<String, Integer>(8);
	}

	/**
	 * Set an Input for this node. Calling this method also calls <code>setOutput()</code> for the node with the same
	 * <code>id</code> used as this method's argument.
	 * <p/>
	 * Inputs are used for influencing the <code>get()</code> functions. Different inputs will be used differently
	 * based
	 * on their relation. The simplest relation is the <code>RELATION_BASE</code>, which is a static field of this
	 * <code>Node</code> class.
	 *
	 * @param relation
	 * 		How the node will interact with this input
	 * @param id
	 * 		The id of the node to add as an input
	 *
	 * @return returns Self
	 */
	public Node setInput(String relation, int id)
	{
		inputs.put(relation, id);
		pool.getNode(id).setOutput(this.nodeId);
		return this;
	}

	/**
	 * Sets the output node by it's <code>id</code>.
	 * <p/>
	 *
	 * @param id
	 * 		The id of the Node to be set as this <code>Node</code>'s output.
	 *
	 * @return returns Self
	 */
	protected Node setOutput(int id)
	{
		output = id;
		return this;
	}

}
