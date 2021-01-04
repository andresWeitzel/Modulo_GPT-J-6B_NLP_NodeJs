
package mypackage.entities;


public class Gasto {
    
    private int id;
    private float precio_compras;
    private String comentario_compras;
    private float precio_servicios;
    private String comentario_servicios;
    private float precio_transporte;
    private String comentario_transporte;
    private String fecha;

    public Gasto() {
    }
    
    public Gasto(float precio_compras, String comentario_compras, float precio_servicios, String comentario_servicios, float precio_transporte, String comentario_transporte, String fecha) {
        this.precio_compras = precio_compras;
        this.comentario_compras = comentario_compras;
        this.precio_servicios = precio_servicios;
        this.comentario_servicios = comentario_servicios;
        this.precio_transporte = precio_transporte;
        this.comentario_transporte = comentario_transporte;
        this.fecha = fecha;
    }
    
    public Gasto(int id, float precio_compras, String comentario_compras, float precio_servicios, String comentario_servicios, float precio_transporte, String comentario_transporte, String fecha) {
        this.id = id;
        this.precio_compras = precio_compras;
        this.comentario_compras = comentario_compras;
        this.precio_servicios = precio_servicios;
        this.comentario_servicios = comentario_servicios;
        this.precio_transporte = precio_transporte;
        this.comentario_transporte = comentario_transporte;
        this.fecha = fecha;
    }
    
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getPrecio_compras() {
        return precio_compras;
    }
    public void setPrecio_compras(float precio_compras) {
        this.precio_compras = precio_compras;
    }
    public String getComentario_compras() {
        return comentario_compras;
    }
    public void setComentario_compras(String comentario_compras) {
        this.comentario_compras = comentario_compras;
    }
    public float getPrecio_servicios() {
        return precio_servicios;
    }
    public void setPrecio_servicios(float precio_servicios) {
        this.precio_servicios = precio_servicios;
    }
    public String getComentario_servicios() {
        return comentario_servicios;
    }
    public void setComentario_servicios(String comentario_servicios) {
        this.comentario_servicios = comentario_servicios;
    }
    public float getPrecio_transporte() {
        return precio_transporte;
    }
    public void setPrecio_transporte(float precio_transporte) {
        this.precio_transporte = precio_transporte;
    }
    public String getComentario_transporte() {
        return comentario_transporte;
    }
    public void setComentario_transporte(String comentario_transporte) {
        this.comentario_transporte = comentario_transporte;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    @Override
    public String toString() {
        return "Gasto{" + "id=" + id + ", fecha=" + fecha + ", precio_compras=" + precio_compras + ", comentario_compras=" + comentario_compras + ", precio_servicios=" + precio_servicios + ", comentario_servicios=" + comentario_servicios + ", precio_transporte=" + precio_transporte + ", comentario_transporte=" + comentario_transporte + '}';
    }
    
    
    
    
    
    
    

    
    

}

