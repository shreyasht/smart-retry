package com.smartretry.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "retry_data")
public class RetryData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "customer_number", nullable = false)
	private String userId;

	@Column(name = "data", nullable = false, length = 4000)
	private String data;

	@Column(name = "attempts", nullable = false)
	private int attempts;

	@Column(name = "created_at", nullable = false)
	@CreationTimestamp
	private Timestamp createDate;

	@Column(name = "updated_at", nullable = false)
	@UpdateTimestamp
	private Timestamp updatedDate;
}
