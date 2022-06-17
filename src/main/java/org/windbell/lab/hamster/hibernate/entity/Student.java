package org.windbell.lab.hamster.hibernate.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@DynamicInsert
@DynamicUpdate
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Version
    @Column(name = "VERSION")
    private Long version;
    @Embedded
    CommonMode commonMode;
    @Column(name = "name", length = 50)
    String name;

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public CommonMode getCommonMode() {
        return commonMode;
    }

    public void setCommonMode(CommonMode commonMode) {
        this.commonMode = commonMode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
