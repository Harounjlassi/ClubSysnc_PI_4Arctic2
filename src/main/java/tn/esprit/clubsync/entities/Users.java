package tn.esprit.clubsync.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;
import jakarta.persistence.*;
import java.util.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "table-users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_user;

    private String name;
    private String email;
    private String phone;
    private String password;

    @Enumerated(EnumType.STRING)
    private boolean role;

    @OneToMany(mappedBy = "createur", cascade = CascadeType.ALL)
    private List<Projet> projects = new ArrayList<>();

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<ForumPost> forumPosts = new ArrayList<>();

    @ManyToMany(mappedBy = "members")
    private List<Club> clubs = new ArrayList<>();

    @OneToMany(mappedBy = "assignee", cascade = CascadeType.ALL)
    private List<Tache> assignedTasks = new ArrayList<>();

    @OneToMany(mappedBy = "auteur", cascade = CascadeType.ALL)
    private List<Message> messages = new ArrayList<>();

    @OneToMany(mappedBy = "reporter", cascade = CascadeType.ALL)
    private List<Report> reports = new ArrayList<>();

    // Methods
    public void updateProfile() {
        // Implementation logic
    }

    public void register() {
        // Implementation logic
    }

    public void login() {
        // Implementation logic
    }
}
