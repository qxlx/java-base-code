package Demo5_11;
//死锁示例
class Test implements Runnable{
	private boolean flag = true;
	Test(boolean flag){
		this.flag = flag;
	}
	//线程任务run方法
	public void run(){
		if(flag){
			while(true)
				synchronized(MyLock lock1){
					System.out.println(Thread.currentThread().getName()+"if.....myLock1");
					synchronized(MyLock lock2){
						System.out.println(Thread.currentThread().getName()+"if....myLock2");
					}
				}
		}
		else{
			while(true)
				synchronized(MyLock lock2){
					System.out.println(Thread.currentThread().getName()+"else....mylock2");
					synchronized{
						System.out.println(Thread.currentThread().getName()+"else...mylock1");
					}
				}
		}
	}
}
class MyLock{
	public static final Object lock1 = new Object();
	public static final Object lock2 = new Object();
}
public class DeadLockTest {
	public static void main(String[] args) {
		Test t1 = new Test(true);
		Test t2 = new Test(false);
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();
		
	}
}
