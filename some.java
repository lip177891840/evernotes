/*servlet接口五个方法*/
public interface Servlet {
	public ServletConfig getServletConfig();
	public String getServletInfo();


	public void init(ServletConfig config) throws ServletException;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException;

	public void destroy();
}






// 接口
AutoCloseable

Appendable     能够被添加 char 序列和值
CharSequence   字符序列(三个实现 String,StringBuffer,StringBuilder)
Comparable
Iterable
Runnable

// 标志接口
Serializable  Cloneable    Remote    EventListener



// 常用类
Object
System
RunTime  //表示运行时操作类，是一个封装了JVM进程的类，每一个JVM都对应着一个Runtime类的实例，此实例由JVM运行时为其实例化
Process

Thread (结合 Runable接口,线程池)


String
StringBuffer
StringBuilder


//数值类型
byte  short  int     long  float   double  char      boolean  void

Byte  Short  Integer Long  Float   Double  Character Boolean  Void


//### 集合框架 ###


HashMap
    // 哈希桶部分
    static final int DEFAULT_INITIAL_CAPACITY 	= 1 << 4;   哈希桶默认初始大小 16
    static final int MAXIMUM_CAPACITY 			= 1 << 30;  哈希桶最大容量
    static final float DEFAULT_LOAD_FACTOR 		= 0.75f;    默认的加载因子
    // 链表部分
    static final int TREEIFY_THRESHOLD 			= 8;        树形化阀值
    static final int UNTREEIFY_THRESHOLD 		= 6;
    static final int MIN_TREEIFY_CAPACITY 		= 64;

	/* ---------------- Fields -------------- */
    transient Node<K,V>[] table;                  哈希桶
    transient Set<Map.Entry<K,V>> entrySet;       
    transient int size;                           key-value映射的个数
    transient int modCount;                       Hash表结构性修改次数，用于实现迭代器快速失败行为
    int           threshold;                      下次扩容阈值，当size > threshold时，开始扩容 threshold = 哈希桶.length * loadFactor;
    final float   loadFactor;                     加载因子

/*#########################################################################*/


//### IO流  ###

//### 引用  ###

