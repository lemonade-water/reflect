package reflect;

public class Demo01 {
	//����õ�ʵ�������󣬿�����û��ʹ�õ�����Ĺ��췽��
	//�𰸣�newInstance()  �����˶�����޲ι��췽��
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> clazz = Class.forName("Bean.Student");
		Object obj = clazz.newInstance();   //ʵ��������
		System.out.println(obj);
	}
}
