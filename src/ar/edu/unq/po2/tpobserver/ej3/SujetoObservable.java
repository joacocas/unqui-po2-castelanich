package ar.edu.unq.po2.tpobserver.ej3;

public interface SujetoObservable {
    void agregarObserver(Observer o);
    
    void eliminarObserver(Observer o);
    
    void notificarATodos(String mensaje);
}