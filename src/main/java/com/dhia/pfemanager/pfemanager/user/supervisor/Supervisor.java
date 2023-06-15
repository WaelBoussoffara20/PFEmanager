package com.dhia.pfemanager.pfemanager.user.supervisor;

import com.dhia.pfemanager.pfemanager.user.User;
import com.dhia.pfemanager.pfemanager.user.UserRole;
import com.dhia.pfemanager.pfemanager.user.enterprise.Enterprise;
import com.dhia.pfemanager.pfemanager.user.intern.Intern;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "supervisor")
public class Supervisor extends User {

    private UserRole role = UserRole.Supervisor;

    private String type;

    @ManyToOne
    @JoinColumn(name = "enterprise_name")
    private Enterprise enterprise;

    @ManyToMany(mappedBy = "supervisors")
    private List<Intern> internList;

}
