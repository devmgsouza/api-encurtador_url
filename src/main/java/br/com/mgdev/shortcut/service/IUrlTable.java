package br.com.mgdev.shortcut.service;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.mgdev.shortcut.entity.UrlTable;

public interface IUrlTable extends PagingAndSortingRepository<UrlTable, Long>{

	
	Optional<UrlTable> findByUrlAtalho(String atalho);
	
}
