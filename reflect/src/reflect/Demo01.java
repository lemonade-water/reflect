package reflect;

public class Demo01 {
	//反射得到实例化对象，看看有没有使用到对象的构造方法
	//答案：newInstance()  调用了对象的无参构造方法
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> clazz = Class.forName("Bean.Student");
		Object obj = clazz.newInstance();   //实例化对象
		System.out.println(obj);
	}
}
