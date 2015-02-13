package com.vorsutusgames.nn.nodes;

import com.vorsutusgames.nn.functions.Function;

import java.util.HashMap;

/**
 * Created by Tyler on 2/12/2015.
 */
public final class Node {

	public static String RELATION_BASE = "base";

	private static int nodeIdCounter = 0;

	public final int nodeId;

	protected Function function;
	protected HashMap<String, Integer> inputs;

	protected Node() {
		nodeId = nodeIdCounter++;
		inputs = new HashMap<String, Integer>(8);
	}

	/**
	 * Set an Input for this node. Inputs require a relation so that the
	 * functions know what to do with this input.
	 * <p/>
	 * Inputs are used for influencing the <code>get()</code> functions.
	 * Different inputs will be used differently based on their relation. The
	 * simplest relation is the <code>RELATION_BASE</code>, which is a static
	 * field of this <code>Node</code> class.
	 *
	 * @param relation How the node will interact with this input
	 * @param id The id of the node to add as an input
	 * @return returns Self
	 */
	public Node setInput(String relation, int id) {
		inputs.put(relation, id);
		return this;
	}

	/**
	 * @param relation The relationship between this node and the one to be
	 * retrieved
	 * @return the input Node that shares <code>relation</code> with this Node
	 */
	public Node getInput(String relation) {
		return NodePool.getNode(inputs.get(relation));
	}

	public Node setFunction(Function function) {
		function.setNode(this.nodeId);
		this.function = function;
		return this;
	}

}
