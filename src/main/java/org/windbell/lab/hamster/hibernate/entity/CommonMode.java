package org.windbell.lab.hamster.hibernate.entity;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.util.Date;

@Embeddable
public class CommonMode {

    @Column(name = "CREATOR", length = 128)
    private String creator;
    @Column(name = "UPDATER", length = 128)
    private String updater;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    @Generated(GenerationTime.INSERT)
    private Date createTime;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_TIME", columnDefinition = "timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    @Generated(GenerationTime.ALWAYS)
    private Date updateTime;

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
