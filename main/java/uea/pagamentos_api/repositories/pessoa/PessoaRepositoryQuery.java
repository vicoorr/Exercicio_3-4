package uea.pagamentos_api.repositories.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import uea.pagamentos_api.models.Pessoa;
import uea.pagamentos_api.repositories.filters.LancamentoFilter;
import uea.pagamentos_api.repositories.filters.PessoaFilter;
import uea.pagamentos_api.dto.ResumoPessoaDto;

public interface PessoaRepositoryQuery {
	public Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);

}