class Root{
static{
System.out.println("Root的静态初始化块");
}
{
System.out.println("Root的普通初始化块");
}
public Root(){
System.out.println("Root的无参数的构造方法");
}
}
class Mid extends Root{
static{
System.out.println("Mid的静态初始化块");
}
{
System.out.println("Mid的普通初始化块");
}
public Mid(){
System.out.println("Mid的无参数的构造方法");
}
public Mid(String msg){
//通过this调用同一类中重载的构造方法
this();
System.out.println("Mid的带参数构造方法，其参数值：" + msg);
}
}
class Leaf extends Mid{
static{
System.out.println("Leaf的静态初始化块");
}
{
System.out.println("Leaf的普通初始化块");
}	
public Leaf(){
//通过super调用父类中有一个字符串参数的构造方法
super("Struts2权威指南");
System.out.println("执行Leaf的构造方法");
}
}
public class Test{
public static void main(String[] args) {
new Leaf();
new Leaf();
}
}
