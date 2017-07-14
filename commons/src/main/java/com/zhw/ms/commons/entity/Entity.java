package com.zhw.ms.commons.entity;

import java.io.Serializable;

/**
 * 基础实例类.
 * Created by hongweizou on 16/8/30.
 */
public class Entity implements Serializable {
    public Long id;
    public Integer version;
    public Long created;
    public Long updated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }
}
