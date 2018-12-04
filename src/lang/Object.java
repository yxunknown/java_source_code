/**
 * Object.class
 * Created in Intelij IDEA
 * <p>
 * Write Some Describe of this class here
 *
 * @author Mevur
 * @date 12/04/18 20:58
 */
package lang;

public class Object {
    public static void main(String[] args) {
        java.lang.Object o = new java.lang.Object();
    }
}

/**
 * java.lang.Object is super class of of all object, include Arrays,
 * all object implements methods defined in Object class.
 */
/*
<Class ?> getClass(): 返回对象运行时的类
int hashCode(): 每个不同的对象都应该有不同的hash码，这能够提高hashmap对该对象的存储效率。
                一个典型的实现是把对象的内部地址转换成一个整数后返回。

bool equals(): 自反性 x.equals(x) = true
               对称性 x.equals(y) = y.equals(x)
               传递性 x.equals(y) = true, y.equals(z) = true, 则x.equals(z) = true
               绝对性 在x,y不改变的情况下，对于任意多次的x.equals(y)调用，应该返回同一个结果
               一个对象和null比较，返回false
               该方法提供了最明显的对对象等价性的判断，如果两个非空引用指向同一个对象，则应该相等。
               若提供了对该方法的实现，同时也应该提供对hasCode()方法的实现。

Object clone(): 克隆当前对象的所有值并赋值给新的一个对象，产生的新对象与原对象不相等（equals为false）
                如果遵循由父类（非Object）调用clone方法，则x.getClass == y.getClass = true,
                如果该类没有实现Cloneable接口，这应该抛出CloneNotSupportedException异常，
                而在实现的时候，也应该注意浅拷贝和深拷贝的区别。如果是直接返回当前对象，则是一个浅拷贝，
                若新建一个对象，并把当前对象属性的值赋给新对象，再返回新对象，则是深拷贝。

String toString(): 返回一个简洁、有力的、方便人类阅读的、能够准确描述该对象的字符串。
                   原则上所有的子类都应该实现该方法，如果没有实现，默认的返回结果是
                   getClass().getName + "@" + Integer.toHexString(hashCode())

void notify(): 唤醒单个正在等待当前对象锁的线程。只有当前线程释放了该对象的锁以后，被唤醒的线程才能进行处理。
               该方法应当只能被拥有该对象锁的线程去调用，而一个线程可以如下几种方式获得一个对象锁的拥有权：
               1. 执行该对象的同步方法
               2. 通过执行同步代码段对该对象进行同步操作
               3. 对于Class类型的对象，执行该对象的静态同步方法
void notifyAll(): 唤醒所有等待该对象锁的线程，被唤醒的线程在当前线程释放该对象锁后进行处理。

void wait(long timeout): 使当前线程进入等待该对象锁的状态，直到其他线程调用了notify或notifyAll方法，或则特定的时间结束。
             调用该方法的线程，必须拥有该对象的锁。
             调用该方法后，当前线程被放入等待该对象的队列中，并释放所有对该对象的同步声明。该进程会进入休眠状态，
             线程调度也不会再对该线程进行调度操作。休眠状态直到一下几个情况发生后被解除：
             1. 其他线程调用了该对象的notify方法，且当前线程被选为唤醒线程
             2. 其他线程调用了该对象的notifyAll方法
             3. 其他线程调用interrupt方法中断了线程
             4. 特定的真实时间结束。如果该时间为0，则该线程不会被立即唤醒，而是等待对象的notify方法被调用。

             * (For more information on this topic, see Section 3.2.3 in Doug Lea's
             * "Concurrent Programming in Java (Second Edition)" (Addison-Wesley,
             * 2000), or Item 50 in Joshua Bloch's "Effective Java Programming
             * Language Guide" (Addison-Wesley, 2001)

             线程也可以不由notify方法唤醒，比如线程中断或等待时间超时也会将线程唤醒，这种方式成为假唤醒。但实际上，
             很少这样使用，即使线程因为中断或等待时间超时，仍然要判断是否拥有对象的锁，否则应该继续进入休眠状态。

void wait(long timeout, long nanos): 和wait(long)方法类似，但是提供了一个纳秒的控制参数。该方法的实现最终调用了wait(timeout),
             对于nanos参数，范围是(0,999999), 只要在范围内，timeout参数加1，然后调用wait(timeout)
             所以该方法也没有和源码说的那样，提供了更好的控制，该方法实际上还是wait(timeout)方法。

void wait(): 相当于wait(0)，使当前线程进入无限期等待，直到对象的notify方法被调用。

             示例
             synchronized (obj) {
               while (condition does not hold)
                  obj.wait();
              ... // 获得对象锁，进行相关操作
             }

void finalize(): 当垃圾回收器判定该对象没有其他引用的时候，由垃圾回收器调用。
                 子类可以实现该方法，执行一切特殊的清理工作。
 */