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

