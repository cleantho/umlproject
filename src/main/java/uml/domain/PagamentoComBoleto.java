package uml.domain;

import java.time.Instant;

import jakarta.persistence.Entity;
import uml.domain.enums.Status;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Instant vencimento;
	private Instant pagamento;
	
	public PagamentoComBoleto() {
		super();
	}
	
	public PagamentoComBoleto(Integer id, Status estado, Pedido pedido, Instant vencimento, Instant pagamento) {
		super(id, estado, pedido);
		this.vencimento = vencimento;
		this.pagamento = pagamento;
	}

	public Instant getVencimento() {
		return vencimento;
	}

	public void setVencimento(Instant vencimento) {
		this.vencimento = vencimento;
	}

	public Instant getPagamento() {
		return pagamento;
	}

	public void setPagamento(Instant pagamento) {
		this.pagamento = pagamento;
	}

}
