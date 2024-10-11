package org.marroquin.campo;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    //contiene la logica para enviar notificaciones. Puede estar anotada con @Service
    //para que spring la administre como un bean

    public void sendNotification(String message){
        System.out.println("Sending notification: "+ message);
    }

}
