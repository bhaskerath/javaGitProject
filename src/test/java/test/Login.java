package test;

import org.apache.log4j.Logger;

public class Login {

	static Logger log = Logger.getLogger(Login.class);
	String b = getClass().toString();
	public static void main(String[] args) {
		System.out.println(new Login().b);
		System.out.println("Hello WOrld");
		log.info("MadAfterCloing");
		log.warn("Started");
		log.fatal("fatal");
		log.error("err");
		log.debug("debug");
		log.info(log.getClass());
		//After cloing
		System.out.print("New line added");
		//test1 changes
		System.out.print("method1");
		System.out.print("method02");
		System.out.print("method03");
	}
}
