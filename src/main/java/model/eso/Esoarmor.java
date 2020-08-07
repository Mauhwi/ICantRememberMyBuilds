package model.eso;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ESO Armor")
public class Esoarmor {
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Slot")
    private String slot;

    @Column(name = "Source")
    private String source;

}
