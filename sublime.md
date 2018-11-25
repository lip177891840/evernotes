#sublime的一些 
####中文输入
[简书](http://www.jianshu.com/p/bf05fb3a4709)上的解决方法  
[github](https://github.com/lyfeyaj/sublime-text-imfix)对应仓库和设置方法  
####vim模式
```
Preferences -> Setting-User    中设置"ignored_packages": []
```

####常用快捷键

	ctrl+/			注释
	ctrl+shift+/	当前位置插入注释

	ctrl+n 			新建
	ctrl+w 			关闭当前文档
	ctrl+v
	ctrl+shift+v 	粘贴过程中保持缩进

	ctrl+l 			选择行，重复可依次增加选择下一行
	ctrl+shift+l  	选择多行

	ctrl+x 			删除当前行
	ctrl+shift+k 	删除一行
	ctrl+k+k 		从光标处开始删除代码至行尾
	ctrl+enter 		相当于vim的o(添加一行空行)
	ctrl+shift+enter相当于vim的O

	alt+F3 			选中所有 选择的词(ctrl+d要一个个选中)
	ctrl+d 			选中下一个选择的词(配合ctrl+k[跳过当前选中的]使用)
	ctrl+shift+d 	复制改行并插入到下一行

	ctrl+m 			跳转到对应括号
	ctrl+shift+m 	选中当前括号内容，重复可选着括号本身

	ctrl+f 			查找
	ctrl+h 			替换
	ctrl+shift+f 	查找并替换
	ctrl+r 			前往 method(自动带@)
	ctrl+g 			跳转到第几行(自动带：)

	ctrl+f2 		设置/取消书签
	f2 				下一个书签
	shift+f2 		上一个书签

	ctrl+shift+p    打开命令框
	ctrl+p  		1、输入当前项目中的文件名，快速搜索文件
	                2、输入@和关键字，查找文件中函数名
	                3、输入：和数字，跳转到文件中该行代码
	                4、输入#和关键字，查找变量名

	按Ctrl，依次点击或选取，可需要编辑的多个位置
	ctrl+k+u
	ctrl+k+l

####常用的一些插件(个人) 
```  
1: package Control  

2: emmet  
编写前端的插件，使编写前端变得更快，有趣


3: colorPicker


4: fileDiffs

5: jsFormat

6： Clipboard History

7： Bracket Highlighter

8: docBlockr

9: ConvertToUTF8

10: AutoFileName

11: InsertNum
	真的好用，谁用谁知道


12: SublimeREPL  调试工具
	PDB
		---breakPoint---
		b  10 第10行设置断点(不加参数查看断点)
		cl  2　删除第二个断点
		---run---
		n    单步运行
		s    细点运行
		c    跳到下个断点
		--查看--
		p    param #查看当前 变量值
		l    #查看运行到某处代码
		a    #查看全部栈内变量
		w    列出目前call    stack 中的所在层。
		d    在call stack中往下移一层
		u    在call stack中往上移一层。
		disable 取消所有断点的功能,但仍然保留这些断点。
		enable 恢复断点的功能。
		ignore 设定断点的忽略次数。如果没指定 count,其初始 为 0。当 count 为 0 时,断点会正常动作。若有指定 count,则每次执行到该中断, count 就少 1,直到 count 数为 0。





markdown篇:





```


#### 使用正则式替换
> 有时候想看看jdk里的源码是怎么写的，但是源码的注释占据的大部分，看的时候很不爽
> 所以想一个办法把注释快速的去掉(一行行删除肯定是不行的)

	//想到用sublime的替换功能，配合正则式，威力强大无比．
	\/\/[^\n]*                                   //行级注释匹配
	\/\*([^\*^\/]*|[\*^\/*]*|[^\**\/]*)*\*\/     //块级注释匹配

	TrailingSpacer    它可以高亮显示多余的空格和Tab并一键删除
	DeleteBlankLines  删除空行(带有tab或空格字符则不会被删除,只删除只含有\n或\r的空行)