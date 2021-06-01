package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		
		//1. Spring �����̳� ����
		AbstractApplicationContext factory= new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û �Ѵ�.
		// src/main/resources�� applicationContext.xml���� id�� tv��� ���� �����ͼ� tv�� �����ش�. --> samsung
		// getBean("tv2")�� ����� id�� tv2�� ���� ������ tv�� ������ --> lg
		
		TV tv = (TV)factory.getBean("tv");

		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3.Spring �����̳� �����Ѵ�.
		factory.close();
		
	}

}