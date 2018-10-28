package reflect;

//得到父类,接口
public class Demo02 {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("Bean.Apple");
		//获得父类类名
		
		System.out.println(clazz.getSuperclass().getSimpleName());
		
		//获得接口
		
		Class<?> imclazzs[] = clazz.getInterfaces();
		
		for (Class claz : imclazzs) {
			System.out.println(claz);
		}
		
		
		
	}
}
