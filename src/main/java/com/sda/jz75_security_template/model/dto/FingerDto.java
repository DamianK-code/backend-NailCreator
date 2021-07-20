package com.sda.jz75_security_template.model.dto;

import com.sda.jz75_security_template.model.Finger;
import lombok.Data;
import org.intellij.lang.annotations.Identifier;

@Data
public class FingerDto {

    private Identifier id;
    private Finger label;
    private String color;

//    {identifier: null, label: "LITTLE_FINGER", color: '#f00'}
}
