## shell常用通配符
* 匹配 0 或多个字符
? 匹配任意一个字符
[list] 匹配 list 中的任意单一字符 ([!list])  [c1-c2] 
{string1,string2,...}   匹配 sring1 或 string2 (或更多)其一字符串 
{c2..c2} 	匹配 c1-c2 中全部字符 如{1..10} 

## 正则式 
元字符: 
* 匹配前面的子表达式零次或多次 
+ 匹配前面的子表达式一次或多次 
? 匹配前面的子表达式零次或一次 
{n,m} 最少匹配 n 次且最多匹配 m 次 {n} {n,m} 
^ $ 开始位置  结束位置 
x|y   匹配 x 或 y 
[xyz]   匹配所包含的任意一个字符 
[^xyz]   匹配未包含的任意字符 
[a-z]   匹配指定范围内的任意字符 
[^a-z]  匹配任何不在指定范围内的任意字符 

\b  匹配一个单词边界
\d  匹配一个数字字符.等价于 [0-9]. 
\s  匹配任何空白字符，包括空格、制表符、换页符等等 




# find 
格式:     find  	[option]	path	expression 
完整格式: find [-H] [-L] [-P] [-D debugopts] [-Olevel] [path...] [expression]
[option] 
-P(不跟踪链接)  -L(跟踪)	-H(不跟踪)     -O	-D 


expression (options  tests    actions) 

test 
-name (-iname)支持简单的shell字符拓展    -regex pattern(复杂的拓展,完全的正则式)
-path 

-type 
-size  + - 
-readable  -writeable  -executable (-perm) 
-mtime -mmin -newer 
-atime -amin -anweer 
-ctime -cmin -cnewer 

-a与  -o或   !非 

-exec (-ok)  {} \; 

其他查找命令 
grep 文本 
which 查找命令是否存在，以及命令的存放位置在哪儿 
whereis 程序,反正和which差不多 
locate 查找文件(但是是从数据库种查找) 
