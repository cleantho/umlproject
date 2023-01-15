package uml.domain;

import jakarta.persistence.Entity;
import uml.domain.enums.Status;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Integer parcelas;

	public PagamentoComCartao() {
		super();
	}

	public PagamentoComCartao(Integer id, Status estado, Pedido pedido, Integer parcelas) {
		super(id, estado, pedido);
		this.parcelas = parcelas;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	
}
