package reflect;

//�õ�����,�ӿ�
public class Demo02 {
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("Bean.Apple");
		//��ø�������
		
		System.out.println(clazz.getSuperclass().getSimpleName());
		
		//��ýӿ�
		
		Class<?> imclazzs[] = clazz.getInterfaces();
		
		for (Class claz : imclazzs) {
			System.out.println(claz);
		}
		
		
		
	}
}
