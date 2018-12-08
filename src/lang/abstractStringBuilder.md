# java.lang.AbstractStringBuilder
该抽象类是StringBuilder和StringBuffer的父类，用于定义可变字符串相关的操作。由于JVM的限制，
可变字符串能最容纳的字符个数为Integer.MAX_VALUE - 1，也就是2147483647个。

关于‘unicode code point’，字符码点： unicode把所有的字符对应到一个整数上，也就是为每个字符都编了
一个序号，code point就是这个字符在unicode编码里对应的序号值。


