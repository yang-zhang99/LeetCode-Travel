package org.json;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor

public class Admin {
    //    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date localDateTime;

    private String name;

    public Date getLocalDateTime() {
        return localDateTime;
    }

    public Admin setLocalDateTime(Date localDateTime) {
        this.localDateTime = localDateTime;
        return this;
    }

    public String getName() {
        return name;
    }

    public Admin setName(String name) {
        this.name = name;
        return this;
    }
}