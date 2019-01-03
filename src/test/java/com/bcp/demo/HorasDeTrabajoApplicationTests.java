package com.bcp.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.bcp.demo.model.Usuario;
import com.bcp.demo.service.IUsuarioService;



@RunWith(SpringRunner.class)
@SpringBootTest
public class HorasDeTrabajoApplicationTests {
	
	@Autowired
	private IUsuarioService service;

	@Autowired
	private BCryptPasswordEncoder bCryptEnconder;
	
	@Test
	public void contextLoads() {
		Usuario us = new Usuario();
		us.setId(1);		
		us.setNombre("admin");
		us.setClave(bCryptEnconder.encode("123"));
		us.setTipo("ROLE_ADMIN");
		us.setEstado("1");		
		
		Usuario retorno = service.create(us);
		assertTrue(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}

