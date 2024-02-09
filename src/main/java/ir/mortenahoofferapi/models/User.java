package ir.mortenahoofferapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
 class User {
    String Username;
    String Password;
    String Email;
    Boolean IsActive;
    private @Id @GeneratedValue(strategy = GenerationType.AUTO) long UserId ;
   Date CreatedDate;
}
