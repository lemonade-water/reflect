package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo05 {

	public static void main(String[] args) throws Exception {
		
		String str = "id:1|name:黄达盛|date:2018-10-28|money:8000.00";
		Class<?> cls = Class.forName("Bean.TestDemo05");
		
		Object obj = cls.newInstance();
		
		String result[] = str.split("\\|");
		
		for(int x = 0;x<result.length;x++) {
			String temp[] = result[x].split(":");
			Field field = cls.getDeclaredField(temp[0]);
			Method setmed = cls.getDeclaredMethod("set"+Demo05.getFirst(temp[0]), field.getType());
			if("string".equalsIgnoreCase(field.getType().getSimpleName())) {
				setmed.invoke(obj, temp[1]);
			}else if("int".equalsIgnoreCase(field.getType().getSimpleName())||
					"integer".equalsIgnoreCase(field.getType().getSimpleName())) {
				//判断传进来的参数是否为整数
				if(temp[1].matches("\\d+")) {
					setmed.invoke(obj, Integer.parseInt(temp[1]));
				}
				
			}else if("double".equalsIgnoreCase(field.getType().getSimpleName())) {
				//去理解这个\\d+(\\.\\d{1,2})?
				//正则表达式
				if(temp[1].matches("\\d+(\\.\\d{1,2})?")) {
					setmed.invoke(obj, Double.parseDouble(temp[1]));
				}
			}else if("date".equalsIgnoreCase(field.getType().getSimpleName())) {
				setmed.invoke(obj, new SimpleDateFormat("yyyy-mm-dd").parse((temp[1])));
			}
				
		}
		System.out.println(obj);
	
	}
	
	public static String getFirst(String str) {
		return str.substring(0, 1).toUpperCase()+str.substring(1);
		
	}

}
