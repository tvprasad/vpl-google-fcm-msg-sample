package com.vplsolutions.fcm.msg.sample.service;

import com.vplsolutions.fcm.msg.sample.pojo.Note;
import com.google.firebase.messaging.*;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class FirebaseMessagingService {

   /*  private final FirebaseMessaging firebaseMessaging;

    public FirebaseMessagingService(FirebaseMessaging firebaseMessaging) {
        this.firebaseMessaging = firebaseMessaging;
    } */

   // @Scheduled(initialDelay = 60000, fixedDelay = 60000)
    public String sendNotification(Note note, String topic) throws FirebaseMessagingException {
System.out.println("Topic:" + topic);
        Notification notification = Notification
                .builder()
                .setTitle(note.getSubject())
                .setBody(note.getContent())
                .setImage(note.getImage())
                .build();

        Message message = Message
                .builder()
                .setTopic(topic)
                .setNotification(notification)
                .putAllData(note.getData())
                .build();

                
          
        return null;// firebaseMessaging.send(message);
    }

}
