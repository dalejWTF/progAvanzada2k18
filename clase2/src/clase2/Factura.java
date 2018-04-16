/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author dalejwtf
 */
public class Factura {
    private int nroFactura;
    private String fecha;
    private Pedido productos;
    private String tipoPago;

    public Factura(int nroFactura, String fecha, Pedido productos, String tipoPago) {
        this.nroFactura = nroFactura;

        this.fecha = fecha;
        this.productos = productos;
        this.tipoPago = tipoPago;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Pedido getProductos() {
        return productos;
    }

    public void setProductos(Pedido productos) {
        this.productos = productos;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
    
    public double SumatoriaTotal(){
        double total = 0;
        for (int i = 0; i < this.getProductos().getCantidad().size(); i++) {
            total+=this.getProductos().getCantidad().get(i).obtenerPrecio();
        }
        return total;
    }
    
    @Override
    public String toString(){
        String cadena="";
        double total=SumatoriaTotal()*0.12+SumatoriaTotal();
        for (int i = 0; i < this.getProductos().getCantidad().size(); i++) {
            
            cadena+=String.format("%s %10.2f\n",this.getProductos().getCantidad().get(i).toString(),this.getProductos().getCantidad().get(i).obtenerPrecio() );
        }
        return String.format("\n\n\n================================================================\n"
                + "\t\tEmpresa XYZ\n"
                + "================================================================\n"
                + "Factura Nro: %s\n"
                + "Fecha: %s\n"
                + "Cliente: %s %s\n"
                + "RUC/CI: %s\n"
                + "Tipo de Pago: %s\n"
                + "================================================================\n"
                + "%3s %20s %10s %10s %10s\n"
                + "================================================================\n"
                + "%s\n"
                + "================================================================\n"
                + "%51s %5.2f\n"
                + "%51s %5.2f\n"
                + "%51s %5.2f\n"
                + "\n\n\n"
                + "________________ \t \t ________________ \n"
                + "Firma Autorizada \t\t Firma Cliente"
                ,this.getNroFactura(),this.getFecha(),this.getProductos().getCliente().getNombres(),this.getProductos().getCliente().getApellidos()
        ,this.getProductos().getCliente().getIdentificacion(),this.getTipoPago(),"Id","Descripcion","Cant","Unit","Total",cadena,"Subtotal:",SumatoriaTotal(),"IVA",0.12,"Total: ",total);
    }
    
}
