package com.mauhwi.icantremembermybuilds.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class EsoInventory {
    @Id
    @Column(name = "id")
    protected long id;

    @Column(name = "Name")
    protected String name;

    @Column(name = "Source")
    protected String source;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
