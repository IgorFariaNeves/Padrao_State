package padroescomportamentais.state;

public class PedidoEstadoProcessando extends PedidoEstado {

    private PedidoEstadoProcessando() {}
    private static PedidoEstadoProcessando instance = new PedidoEstadoProcessando();
    public static PedidoEstadoProcessando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Processando";
    }

    public boolean enviar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        return true;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
