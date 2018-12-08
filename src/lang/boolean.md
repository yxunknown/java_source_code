# java.lang.Boolean
Boolean类是对原始数据类型boolean的封装。每个对象都包含了单个boolean值。
该类提供了一些boolean和String类型相互转换的方法。  

## 常量
Boolean FALSE = new Boolean(false);  
Boolean TRUE = new Boolean(true);  

## hashCode
Boolean对象的hash值是确定的，其hashCode的实现如下：  
```aidl
public static int hashCode(boolean value) {
    return value ? 1231 : 1237;
}
```

## equals
Boolean对象对于equals方法的实现，没有去比较hashCode方法的返回值，而实直接
比较取值，这样性能会更高些。  

## 逻辑运算
Boolean提供了逻辑与、逻辑或和逻辑异或的方法。