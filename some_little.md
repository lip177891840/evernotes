####一些小技巧
```
------
上一条命令:
方向键    !!    !-1    Ctrl+P ↑    (Ctrl+n ↓下一条命令，分别对应上下方向键) 


上一条命令参数:
!*  所有参数
!$  最后一个参数
!-  除了最后一个参数部分


------
上一个工作路径 cd - 

------
export HISTTIMEFOttyRMAT 对history显示时间戳 

------
Ctrl+R搜索历史 
通过指定关键字来执行以前的命令 

```




终端一些快捷键:

	输入:
	control+a  移动到终端的开始  ahead
	control+e  移动到终端的结尾  end
	control+b  向前移动光标 
	control+f  向后移动光标
	alt+b      光标向前移动一个单词
	alt+f      光标向后移动一个单词
	control+u  删除光标前的所有内容
	control+k  删除光标后的所有内容
	control+h  删除光标前的单个字符
	control+d  删除光标后的单个字符
	control+w  删除光标前的一个单词

	control+y  粘贴刚才所删除的字符

	ctrl+(x+u)撤销操作

	ctrl+l   清屏=clear 
	ctrl+s  挂起
	ctrl+q  解除挂起
	ctrl+z  
	


在下面的例子，输入 !ps 并回车，将执行以 ps 打头的命令： 
```
# !ps 
ps aux | grep yp 
root 16947 0.0 0.1 36516 1264 ? Sl 13:10 0:00 ypbind 
root 17503 0.0 0.0 4124 740 pts/0 S+ 19:19 0:00 grep yp
```
