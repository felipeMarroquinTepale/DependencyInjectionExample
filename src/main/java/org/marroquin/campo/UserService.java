package org.marroquin.campo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //Supongamos que UserService depende de NotificationService para
    //enviar notificaciones cuando se realiza una accion

    //Inyeccion de dependencias por campo: Se inyecta la dependencias directamente en el campo de la clase
    @Autowired
    private  NotificationService notificationService;


    public void performUserAction(){
        //Logica de negocio relacionada con usuarios
        System.out.println("Acción del usuario realizada.");

        //enviar notificacion utilizando el servicio inyectado
        notificationService.sendNotification("accion del usuario completado");

    }
}
