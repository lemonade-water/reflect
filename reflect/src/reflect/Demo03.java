package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

//ȡ�ù��췽��
public class Demo03 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class<?> clazz = Class.forName("Bean.Apple");
		
		Constructor<?>[] constructors = clazz.getConstructors();
		for(Constructor constructor:constructors) {
			StringBuffer strbuffer = new StringBuffer();
			strbuffer.append(Modifier.toString(constructor.getModifiers())+" ");
			strbuffer.append(constructor.getName()+" ");
		
			if(constructor.getParameterCount()>0) {
				strbuffer.append(constructor.getParameterCount()+"������  ");
				for(Class parametertype:constructor.getParameterTypes()) {
					strbuffer.append(parametertype.getSimpleName()+" ");
					 
				}
			}
			System.out.println(strbuffer);
		}
	}

}
