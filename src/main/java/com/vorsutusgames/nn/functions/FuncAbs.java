package com.vorsutusgames.nn.functions;

/**
 * Created by Tyler on 2/13/2015.
 */
public class FuncAbs extends Function {

	@Override
	public float get(float x, float y) {
		return Math.abs(getInput(RELATION_BASE).get(x, y));
	}

	@Override
	public float get(float x, float y, float z) {
		return Math.abs(getInput(RELATION_BASE).get(x, y, z));
	}

	@Override
	public float get(float x, float y, float z, float w) {
		return Math.abs(getInput(RELATION_BASE).get(x, y, z, w));
	}
}
