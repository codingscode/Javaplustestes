package programa;

import java.util.Date;

import entidades.Pedido;
import entidades.enums.StatusPedido;

public class Teste1 {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1080, new Date(), StatusPedido.PAGAMENTO_PENDENTE);		
		
		System.out.println(pedido);
		System.out.println();

	}

}
/*
Pedido [id=1080, momento=Fri Sep 19 21:47:01 BRT 2025, status=PAGAMENTO_PENDENTE]

------------------------------------
enumerações



*/
