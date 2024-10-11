package org.marroquin.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //Supongamos que UserService depende de NotificationService para
    //enviar notificaciones cuando se realiza una accion

    //Inyeccion de dependencias por setter: Se usa un metodo setter para inyectar la dependencia
    private NotificationService notificationService;

    //Inyeccion por metodo Setter
    @Autowired
    public void setterUserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    public void performUserAction(){
        //Logica de negocio relacionada con usuarios
        System.out.println("Acción del usuario realizada.");

        //enviar notificacion utilizando el servicio inyectado
        notificationService.sendNotification("accion del usuario completado");

    }
}
