package br.com.mgdev.shortcut.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.mgdev.shortcut.entity.UrlTable;
import br.com.mgdev.shortcut.repository.UrlTableService;

@RestController
@RequestMapping("/rest/url")
public class UrlController {
	
	@Autowired
	UrlTableService urlTableService;
	
	
	
	@GetMapping
	public ResponseEntity<UrlTable> getUrl(@RequestParam("q") String param) {
		
		Optional<UrlTable> response = urlTableService.buscarAtalho(param);
		
		return response.isPresent() ? ResponseEntity.ok(response.get()) : ResponseEntity.noContent().build();
		
	}
	
	@PostMapping
	public ResponseEntity<UrlTable> putUrl(@RequestBody String urlOriginal) {
		UrlTable response = urlTableService.cadastraUrl(urlOriginal);
		
		return response != null ? ResponseEntity.ok(response) : ResponseEntity.badRequest().build();
	}

}
