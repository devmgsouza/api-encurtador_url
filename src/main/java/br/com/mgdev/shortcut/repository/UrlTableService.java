package br.com.mgdev.shortcut.repository;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mgdev.shortcut.entity.UrlTable;
import br.com.mgdev.shortcut.service.IUrlTable;
import br.com.mgdev.shortcut.utils.CodeGenerator;

@Service
public class UrlTableService {

	@Autowired
	IUrlTable iUrlTables;

	public UrlTable cadastraUrl(String urlOriginal) {

		UrlTable urlTable = new UrlTable();

		urlTable.setDataCriacao(new Date());
		urlTable.setUrlOriginal(urlOriginal);
		urlTable.setUrlAtalho(geradorDeCodigo());
		urlTable.setValido(true);

		return iUrlTables.save(urlTable);
	}

	public Optional<UrlTable> buscarAtalho(String param) {

		return iUrlTables.findByUrlAtalho(param);
	}
	
	
	
	private String geradorDeCodigo() {
		String code = CodeGenerator.GerarCodigoRand(6);

		while (iUrlTables.findByUrlAtalho(code).isPresent()) {
			code = CodeGenerator.GerarCodigoRand(6);

		}

		return code;
	}

	

}
