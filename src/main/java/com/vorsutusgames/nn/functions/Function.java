package com.vorsutusgames.nn.functions;

import com.vorsutusgames.nn.nodes.NodePool;

/**
 * Created by Tyler on 2/12/2015.
 */
public abstract class Function
{
	public static String RELATION_BASE = "base";

	protected int nodeId;

	public abstract float get(float x, float y);

	public abstract float get(float x, float y, float z);

	public abstract float get(float x, float y, float z, float w);


	public final void setNode(int nodeId) {
		this.nodeId = nodeId;
	}

	protected final Function getInput(String relation) {
		return NodePool.getNode(nodeId).getInput(relation);
	}
}
