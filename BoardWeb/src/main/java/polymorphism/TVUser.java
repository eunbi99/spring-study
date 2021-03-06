package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		
		//1. Spring 컨테이너 구동
		AbstractApplicationContext factory= new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. Spring 컨테이너로부터 필요한 객체를 요청 한다.
		// src/main/resources의 applicationContext.xml에서 id가 tv라는 빈을 가져와서 tv로 던져준다. --> samsung
		// getBean("tv2")로 변경시 id가 tv2인 빈을 가져와 tv로 던져줌 --> lg
		
		TV tv = (TV)factory.getBean("tv");

		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		//3.Spring 컨테이너 종료한다.
		factory.close();
		
	}

}
