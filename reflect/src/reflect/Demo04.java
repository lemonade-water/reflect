package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

//取得方法
public class Demo04 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("Bean.Student");
		Method methods[] = clazz.getMethods();
		
		for(Method method:methods) {
			StringBuffer strbuffer = new StringBuffer();
			
			strbuffer.append(Modifier.toString(method.getModifiers())+" ");
			
			strbuffer.append(method.getReturnType().getSimpleName()+" ");
			
			strbuffer.append(method.getName()+" （");
			
			if(method.getParameterCount()>0) {
				for(Parameter p:method.getParameters()) {
					strbuffer.append(p.getModifiers()+"  "+p.getType().getSimpleName()+"  "+p.getName()+",");
				}
			}
			
			strbuffer.append("）");
			System.out.println(strbuffer);
		}
		
	}

}
