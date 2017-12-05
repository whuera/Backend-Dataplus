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

// TODO: Auto-generated Javadoc
/**
 * The Class ContactSendMail.
 */
@Entity

/**
 * Instantiates a new contact send mail.
 */
@NoArgsConstructor

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@ToString
 public class  ContactSendMail {
	
	/** The id. */
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Getter 
 /**
  * Sets the id.
  *
  * @param id the new id
  */
 @Setter private int id;
	
	/** The names. */
	@Column(length = 100) 
 /**
  * Gets the names.
  *
  * @return the names
  */
 @Getter 
 /**
  * Sets the names.
  *
  * @param names the new names
  */
 @Setter private String names;
	
	/** The last names. */
	@Column(length = 100) 
 /**
  * Gets the last names.
  *
  * @return the last names
  */
 @Getter 
 /**
  * Sets the last names.
  *
  * @param lastNames the new last names
  */
 @Setter private String lastNames;
	
	/** The mailtosend. */
	@Column(length = 80) 
 /**
  * Gets the mailtosend.
  *
  * @return the mailtosend
  */
 @Getter 
 /**
  * Sets the mailtosend.
  *
  * @param mailtosend the new mailtosend
  */
 @Setter private String mailtosend;
	
	/** The celphone. */
	@Column(length = 20) 
 /**
  * Gets the celphone.
  *
  * @return the celphone
  */
 @Getter 
 /**
  * Sets the celphone.
  *
  * @param celphone the new celphone
  */
 @Setter private String celphone;
	
	/** The observation. */
	@Column(length = 255) 
 /**
  * Gets the observation.
  *
  * @return the observation
  */
 @Getter 
 /**
  * Sets the observation.
  *
  * @param observation the new observation
  */
 @Setter private String observation;	
}