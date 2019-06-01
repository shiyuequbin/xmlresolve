package com.springboot_xml.xml_pfa;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot_xml.xml_pfa.mapper")
public class XmlPfaApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmlPfaApplication.class, args);
	}

}
