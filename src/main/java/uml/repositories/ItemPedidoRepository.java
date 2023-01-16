package uml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import uml.domain.ItemPedido;
import uml.domain.ItemPedidoPK;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK> {

}
