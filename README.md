创建线程的两种方法
一、继承Thread + 重写run方法
二、实现Runnable接口 + 重写run方法
	1、创建真实角色
	2、创建代理角色 +真的角色的引用 +代理角色名
	3、调用 .start 方法启动线程

Demo01 和Demo02