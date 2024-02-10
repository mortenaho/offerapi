package ir.mortenahoofferapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class User {
    String Username;
    String Password;
    String Email;
    Boolean IsActive;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long UserId;
    Date CreatedDate;
}
