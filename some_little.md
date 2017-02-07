1: linux中上一条命令 
方向键, !! ,  !-1  ,  Ctrl+P 

2: 上一个工作路径 cd - 


export HISTTIMEFORMAT 对history显示时间戳 

Ctrl+R搜索历史 
通过指定关键字来执行以前的命令 
在下面的例子，输入 !ps 并回车，将执行以 ps 打头的命令： 
```
# !ps 
ps aux | grep yp 
root 16947 0.0 0.1 36516 1264 ? Sl 13:10 0:00 ypbind 
root 17503 0.0 0.0 4124 740 pts/0 S+ 19:19 0:00 grep yp
```

```
control+a  移动到终端的开始 
control+e  移动到终端的结尾 
control+k  删除终端光标后的所有内容 
control+d  删除光标后的单个字符 
control+b 向前移动光标 
control+f  向后移动光标 
control+p 上一条命令 
control+l   清屏=clear 
```