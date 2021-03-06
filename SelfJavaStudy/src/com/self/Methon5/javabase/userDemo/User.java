package com.self.Methon5.javabase.userDemo;
/**
	 * 实现用户注册功能
	 * 1.用户名最多25个字符长度、不能包含空格、单双引号、问号等特殊符号
	 * 2.密码6-18位，只能包含字母、数字、特殊符号(下划线、@、#、$、！)
	 * 纯数字、纯字母时，密码强度都是弱 (★️★☆☆☆☆)
	 * 数字+字母、数字+符号、符号+字母，密码强度都是中(★️★️★️★☆☆)
	 * 同时存在三种字符，强度为强(★️★️★️★★★)
	 * 3.用户输入正确的email
	 * 必须包含一个@符号，且只能包含一个
	 *  @ 和 . 符号不能再开头，也不能在结尾
 * @author jyk
 *
 */
public class User {
	private String userName;
	private String password;
	private String email;
	public User(){
		
	}
	
	public User(String userName,String password,String email){
		setUserName(userName);
		setPassword(password);
		setEmail(email);
	}
	
	
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
