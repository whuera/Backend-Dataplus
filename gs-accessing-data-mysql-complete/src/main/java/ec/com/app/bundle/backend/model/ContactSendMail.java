package ec.com.app.bundle.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@ToString
 public class  ContactSendMail {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Getter @Setter private int id;
	@Column(length = 100) @Getter @Setter private String names;
	@Column(length = 100) @Getter @Setter private String lastNames;
	@Column(length = 80) @Getter @Setter private String mailtosend;
	@Column(length = 20) @Getter @Setter private String celphone;
	@Column(length = 255) @Getter @Setter private String observation;	
}