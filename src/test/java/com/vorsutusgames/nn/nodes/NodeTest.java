package com.vorsutusgames.nn.nodes;

import com.vorsutusgames.nn.ImageOutput;
import com.vorsutusgames.nn.functions.FuncAbs;
import com.vorsutusgames.nn.functions.FuncSimplexNoise;
import com.vorsutusgames.nn.functions.Function;
import org.junit.Test;

public class NodeTest {

	@Test
	public void testGet() throws Exception {
		Node n1 = NodePool.newNode();
		Node n2 = NodePool.newNode();

		n1.function = new FuncSimplexNoise();
		n2.function = new FuncAbs();


		n2.setInput(Function.RELATION_BASE, n1.nodeId);

		ImageOutput.image(n2, 1f);
	}
}