package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test7 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");
		Demo d1 = context.getBean("demo", Demo.class);
		System.out.println(d1);
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression parseExpression = temp.parseExpression("25+13"); /* Here curly braces are not required */
		System.out.println(parseExpression.getValue());

	}

}
