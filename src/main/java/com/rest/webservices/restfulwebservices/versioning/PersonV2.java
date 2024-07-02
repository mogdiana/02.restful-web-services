package com.rest.webservices.restfulwebservices.versioning;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PersonV2 {

    private Name name;

    @Override
    public String toString() {
        return "PersonV2 [name=" + name + "]";
    }

}
