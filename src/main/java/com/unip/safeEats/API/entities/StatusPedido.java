package com.unip.safeEats.API.entities;

public enum StatusPedido {
    PEDIDO_RECEBIDO(0),
    AGUARDANDO_PAGAMENTO(1),
    PEDIDO_REALIZADO(2),
    PAGAMENTO_CONFIRMADO(3),
    PEDIDO_ENVIADO(4),
    PEDIDO_ENTREGUE(5),
    CANCELADO(6);

    private int code;

    private StatusPedido(int code) {
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static StatusPedido valueOf(int code) throws IllegalArgumentException {
        for(var i : StatusPedido.values()){
           if (i.getCode() == code)
               return i;
        }
        throw new IllegalArgumentException("Invalid StatusPedido code");
    }
}
