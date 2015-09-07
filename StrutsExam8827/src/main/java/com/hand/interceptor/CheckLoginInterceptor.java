package com.hand.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class CheckLoginInterceptor implements Interceptor {

	public void destroy() {

	}

	public void init() {

	}

	public String intercept(ActionInvocation arg0) throws Exception {
		String url = "";//ServletActionContext.getRequest().getSession().getAttribute("logname")
		if(null!=arg0.getInvocationContext().getSession().get("logname")){
			url = arg0.invoke();
		}else{
			url="error";
		}
		return url;
	}

}
