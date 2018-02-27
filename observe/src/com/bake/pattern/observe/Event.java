package com.bake.pattern.observe;

import java.lang.reflect.Method;

/** 
 * @ClassName: Event 
 * @Description: 事件对象封装类
 * @author: Bake
 * @since JDK1.7
 * @version V1.0
 * @date: 2018年1月29日 下午3:46:27  
 */
public class Event {
	
	//要执行方法的对象
	private Object object;
	
	//要执行方法的名称
	private String methodName;
	
	//要执行方法的参数
	private Object[] params;
	
	//要执行方法的参数类型
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
