package com.puhu17.signup.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.management.RuntimeOperationsException;
import javax.persistence.*;
import java.time.LocalDateTime;

@Builder
@Data
@Table(name="user_information")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserInformation extends BaseEntity {
    @Id
    @Column(name="uno")
    private Long uno;
    @Column(name="email")
    private String email;
    @Column(name="id")
    private String id;
    @Column(name="name")
    private String name;
    @Column(name="password")
    private String password;
    @Column(name="usertype")
    private Integer usertype;

}
