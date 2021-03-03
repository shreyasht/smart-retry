package com.smartretry.model;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class NotificationData {

	private String userId;

	private String message;

	private Date sentAt;

	private Date actualSentAt;

}
