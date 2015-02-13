package com.vorsutusgames.nn.functions;

/**
 * Created by Tyler on 2/13/2015.
 */
public class FuncStaticParameter extends Function {

	protected final float VALUE;
	protected final Function FUNC;

	FuncStaticParameter(float value) {
		VALUE = value;
		FUNC = null;
	}

	FuncStaticParameter(Function function) {
		VALUE = 0f;
		FUNC = function;
	}

	@Override
	public float get(float x, float y) {
		if(FUNC != null) return FUNC.get(x, y);
		return VALUE;
	}

	@Override
	public float get(float x, float y, float z) {
		if(FUNC != null) return FUNC.get(x, y, z);
		return VALUE;
	}

	@Override
	public float get(float x, float y, float z, float w) {
		if(FUNC != null) return FUNC.get(x, y, z, w);
		return VALUE;
	}
}
