package com.yahoo.hadoop_bsp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class HadoopVertex<I, V, E, M> implements Vertex<I, V, E, M> {
	private static long m_superstep = 0;
	private I m_id;
	private V m_vertexValue;
	private List<E> m_outEdgeList = new ArrayList<E>();
	private boolean m_halt = false;
	
	public void addEdge(E edgeValue) {
		m_outEdgeList.add(edgeValue);
	}
	
	public I id() {
		return m_id;
	}
	
	public static void setSuperstep(long superstep) {
		m_superstep = superstep;
	}
	
	public long getSuperstep() {
		return m_superstep;
	}
	public V getVertexValue() {
		return m_vertexValue;
	}
	public void setVertexValue(V vertexValue) {
		m_vertexValue = vertexValue;
	}
	
	public Iterator<E> getOutEdgeIterator() {
		return m_outEdgeList.iterator();
	}
	
	public void sendMsg(String vertex, M msg) {
		
	}
	
	public void voteToHalt() {
		m_halt = true;
	}
	
	public boolean isHalted() {
		return m_halt;
	}
}

