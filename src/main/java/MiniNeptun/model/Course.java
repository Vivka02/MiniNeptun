package MiniNeptun.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Entity
@Table(name = "COURSE")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Course implements Serializable {

    @Id
    @NotNull
    @Column
    private int id;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String time;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name ="subject_id")
    private Subject subject;

    public Course(@NotNull int id, @NotNull String name, @NotNull String time) {
        this.id = id;
        this.name = name;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
