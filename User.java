package user;

import java.util.Date;
//用户信息
public class User {
	private String userName; // 用户名
	private String password; // 密码
	private Date birthday; // 生日
	private String telNumber; // 手机号码
	private String email; // 邮箱
	public User() {
	}
	public User(String userName, String password, Date birthday, 
			String telNumber, String email) {
		this.userName = userName;
		this.password = password;
		this.birthday = birthday;
		this.telNumber = telNumber;
		this.email = email;
	}
	// 重写hashCode与equals方法
	@Override
	public int hashCode() {// 重写hashCode方法，以用户名作为是否重复的依据
		return userName.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {// 判断是否是同一个对象
			return true;
		}
		if (obj == null) {// 判断这个对象是否为空
			return false;
		}
		if (getClass() != obj.getClass()) {// 判断这个对象是否是User类型
			return false;
		}
		User other = (User) obj;
		if (userName == null) {
			if (other.userName != null) {// 判断对象中的用户名是否为空
				return false;
			}
		} else if (!userName.equals(other.userName)) {// 判断用户名是否相同
			return false;
		}
		return true;
	}
}