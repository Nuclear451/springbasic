package spring_for_professionals;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AppContext {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("bean-factory-config.xml");
		ctx.refresh();

		System.out.println(ctx.getBean("injectSimpleSpel"));

	}
}
