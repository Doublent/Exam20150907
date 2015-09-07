package com.hand.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String logname;
	private String password;
	@Override
	public String execute() {
		String ret = ERROR;
		Connection conn = null;
		try {
			String URL = "jdbc:mysql://localhost:3306/sakila";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, "root", "");
			String sql = "select * from customer where first_name='"+logname+"'and last_name='"+password+"'";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
//				ServletActionContext.getRequest().getSession().setAttribute("logname", logname);
				ActionContext.getContext().getSession().put("logname", logname);
				ret = SUCCESS;
			}
		} catch (Exception e) {
			ret = ERROR;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
				}
			}
		}
		return ret;
	}

	public String getLogname() {
		return logname;
	}

	public void setLogname(String logname) {
		this.logname = logname;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

/*	public String execute() throws Exception {
		System.out.println(username);
		if(username.equals("admin")){
			ServletActionContext.getRequest().getSession().setAttribute("username", "admin");
			return SUCCESS;
		}
		else{
			System.out.println(ServletActionContext.getRequest().getSession().getAttribute("username")+""+username);
			return "loginfail";
		}

	}
 */
