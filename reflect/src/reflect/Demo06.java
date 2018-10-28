package reflect;

import java.lang.annotation.Annotation;

import Bean.MyAnnotation;

//取得annotation

//annotation的好处是节约书写
public class Demo06 {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("Bean.TestDemo06");
			
			Annotation[] annotations = clazz.getAnnotations();
			
			for(Annotation annotation:annotations) {
				MyAnnotation my = (MyAnnotation) annotation;
				System.out.println(my.name()+my.value());
			}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
