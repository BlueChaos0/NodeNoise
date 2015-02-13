package com.vorsutusgames.nn.functions;

import java.util.Random;

/**
 * Created by Tyler on 2/13/2015.
 */
public class FuncStaticNoise extends Function {

	static final float v1 = 85829 * 90499;
	static final float v2 = 90499 * 95231;
	static final float v3 = 95231 * 99859;
	static final float v4 = 99859 * 104729;

	@Override
	public float get(float x, float y) {
		return rand(x * v1 + y * v2);
	}

	@Override
	public float get(float x, float y, float z) {
		return rand(x * v1 + y * v2 + z * v3);
	}

	@Override
	public float get(float x, float y, float z, float w) {
		return rand(x * v1 + y * v2 + z * v3 + w * v4);
	}

	private float rand(float val) {
		Random r = new Random((long) (val));
		if(r.nextBoolean()) return 1;
		return -1;
	}
}
