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
	@Column @Getter @Setter private String names;
	@Column @Getter @Setter private String lastNames;
	@Column @Getter @Setter private String mailtosend;
}