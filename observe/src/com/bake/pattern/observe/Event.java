package com.bake.pattern.observe;

import java.lang.reflect.Method;

/** 
 * @ClassName: Event 
 * @Description: �¼������װ��
 * @author: Bake
 * @since JDK1.7
 * @version V1.0
 * @date: 2018��1��29�� ����3:46:27  
 */
public class Event {
	
	//Ҫִ�з����Ķ���
	private Object object;
	
	//Ҫִ�з���������
	private String methodName;
	
	//Ҫִ�з����Ĳ���
	private Object[] params;
	
	//Ҫִ�з����Ĳ�������
	public Class[] paramTypes;

	public Event(Object object, String methodName, Object[] args) {
		this.object = object;
		this.methodName = methodName;
		this.params = args;
		contractParamTypes(this.params);	
	}
	
	public Event() {}

	private void contractParamTypes(Object[] params) {
		this.paramTypes = new Class[params.length];
		for (int i=0,leg = params.length; i<leg; i++) {
			this.paramTypes[i] = params[i].getClass();
		}
	}

	public Object getObject() {
		return object;
	}

	public String getMethodName() {
		return methodName;
	}

	public Object[] getParams() {
		return params;
	}

	public Class[] getParamTypes() {
		return paramTypes;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

	public void setParamTypes(Class[] paramTypes) {
		this.paramTypes = paramTypes;
	}
	
	public void invoke() throws Exception {
		Method method = object.getClass().getMethod(this.methodName, this.getParamTypes());
		if(null == method) {
			return;
		}
		method.invoke(this.object, this.getParams());
	}
	
	
}
