# java.lang.StringBuffer
一个线程安全的字符序列，和java.lang.String类似，但是StringBuffer可以修改。也可以在
多线程环境中安全使用，StringBuffer在必要的方法中都做了同步处理。 

StringBuffer提供了inert和append两个重要方法，而且对不同的数据类型进行兼容。

**注意**： java.lang.StringBuffer和java.lang.StringBuilder的区别：  
两个类都是可变字符串类型，都用共同的父类java.lang.AbstractStringBuilder。  
java.lang.StringBuffer是多线程安全的，内部的一些方法经过同步处理，保证
多线程环境下的安全性，但是其性能由于同步控制的原因，会有一定损耗。  
java.lang.StringBuilder是单线程的，在多线程环境下无法保证数据操作的
安全性，但是其性能更快。  
因此java.lang.StringBuffer适合用在多线程环境，而java.lang.StringBuilder
适合用在单线程环境。java.lang.StringBuilder的性能比java.lang.StringBuffer
的性能要好。  

## 构造方法
StringBuffer无参构造函数默认分配的大小为16个字符。对于用String或
是CharSequence对象来构造StringBuffer对象，StringBuffer都会留出
16个字符的多余空间。  

## insert
insert的方法不是每一个实现都带有同步控制， 如下的方法就没用进行同步：  
1. StringBuffer insert(int offset, double d)  
2. StringBuffer insert(int offset, float f)  
3. StringBuffer insert(int offset, long l) 
4. StringBuffer insert(int offset, int i)  
5. StringBuffer insert(int offset, boolean b)  
6. StringBuffer insert(int dstOffset, CharSequence s) 
 
但是synchronized StringBuffer insert(int offset, String str)方法会进行同步，
因此要保证如上方法的安全，可以通过调用insert(offset, str)方法来是实现。
