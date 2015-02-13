package com.vorsutusgames.nn.functions;

import com.vorsutusgames.nn.util.SimplexNoise;

/**
 * Created by Tyler on 2/13/2015.
 */
public class FuncSimplexNoise extends Function {

	@Override
	public float get(float x, float y) {
		return (float) SimplexNoise.noise(x, y);
	}

	@Override
	public float get(float x, float y, float z) {
		return (float) SimplexNoise.noise(x, y, z);
	}

	@Override
	public float get(float x, float y, float z, float w) {
		return (float) SimplexNoise.noise(x, y, z, w);
	}
}
