package com.smartretry.model;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class SendNotificationRequest {

	private NotificationData notificationData;

}
