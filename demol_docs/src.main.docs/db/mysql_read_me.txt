
一：准备
	version	:	mysql-5.7.12-winx64
	environment	：	win8.1
	path	:	C:\develop\sdk\mysql\mysql-5.7.12-winx64
	
二：安装
	配置：my-default.ini ——》 my.ini	（指定安装目录、字符集编码）
	前提：CMD(管理员身份运行、C:\Windows\System32) + cd:{path}
	*安装前实例化：mysqld --initialize-insecure --user=mysql
		data下数据：mysql、performance_schema、sys、*.log
		5.7.*:新增安装前的操作
		
	安装命令：>mysqld --install	
		提示：Service successfully installed.
		服务：MySQL
		
	卸载命令：>mysqld --remove

	
三：启动
	服务方式：[MySQL]
	命令方式：>net start mysql
		日志：C:\develop\sdk\mysql\mysql-5.7.12-winx64\data
		注意：1：是否实例化；2：my.ini路径中的"\"——》"\\"
	
四：登录
	设置密码：>mysqladmin -uroot password "135246"
	登录：>mysql -u root -p
	
	
	
	
	
	