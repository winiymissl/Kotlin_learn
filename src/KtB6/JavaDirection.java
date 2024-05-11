package KtB6;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @Description
 * @Author winiymissl
 * @Date 2024-05-06
 * java的枚举类
 * enum方式定义的要求和特点
 * <p>
 * * 枚举类的常量对象列表必须在枚举类的首行，因为是常量，所以建议大写。
 * * 列出的实例系统会自动添加 public static final 修饰。
 * * 如果常量对象列表后面没有其他代码，那么“；”可以省略，否则不可以省略“；”。
 * * 编译器给枚举类默认提供的是private的无参构造，如果枚举类需要的是无参构造，就不需要声明，写常量对象列表时也不用加参数
 * * 如果枚举类需要的是有参构造，需要手动定义，有参构造的private可以省略，调用有参构造的方法就是在常量对象名后面加(实参列表)就可以。
 * * 枚举类默认继承的是java.lang.Enum类，因此不能再继承其他的类型。
 * * JDK5.0 之后switch，提供支持枚举类型，case后面可以写枚举常量名，无需添加枚举类作为限定。
 */
enum MyDirection {
	SOUTH("south");

	private final String directionName;

	private MyDirection(String name) {
		this.directionName = name;
	}
}


class JavaDirection {
	public static void main(String[] args) {
		ArrayList<Object> objects = new ArrayList<>();
		objects.add(new Object());
		objects.add(new Object());
		objects.add(new Object());
		objects.add(new Object());
		objects.stream().filter(new Predicate<Object>() {
			@Override
			public boolean test(Object o) {
				if (o instanceof Object) {
					System.out.println("返回的是true");
					return true;
				}
				return false;
			}
		}).distinct();
	}
}