package programa;

import java.util.Date;

import entidades.Pedido;
import entidades.enums.StatusPedido;


public class Teste1 {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1080, new Date(), StatusPedido.PAGAMENTO_PENDENTE);		
		
		System.out.println(pedido);
		
		StatusPedido os1 = StatusPedido.ENTREGUE;
		StatusPedido os2 = StatusPedido.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
		System.out.println();

	}

}
/*
Pedido [id=1080, momento=Fri Sep 19 21:52:33 BRT 2025, status=PAGAMENTO_PENDENTE]
ENTREGUE
ENTREGUE


------------------------------------
enumerações



*/
