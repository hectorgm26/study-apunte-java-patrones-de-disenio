package observer.ejemplo2observer;

public interface MyObserver {

    void update();
}

// EL OBSERVADOR u observer ES QUIEN ESTARA RONDANDO, ESPERANDO LA NOTIFICACION DEL OBSERVABLE
// POR ENDE, EL OBSERVADOR DEBE TENER UN METODO QUE SE EJECUTARA CUANDO RECIBA LA NOTIFICACION DEL OBSERVABLE, ACTUALIZANDO SU ESTADO
