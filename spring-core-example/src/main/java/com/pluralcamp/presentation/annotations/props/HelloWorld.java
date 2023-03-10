package com.pluralcamp.presentation.annotations.props;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = "prototype") //El @Scope por defecto es: Singleton
@Component(value = "helloWorld")
public class HelloWorld {

	@Autowired
	@Value("Hello world from property!")
	private String hello;
	
	private UUID uuid;
	
	
	public HelloWorld() {
		this.uuid = UUID.randomUUID();
	}
	
	
	public HelloWorld (String hello) {
		this();
		this.setHello(hello);
	}

	
	
	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	
	
	
}

