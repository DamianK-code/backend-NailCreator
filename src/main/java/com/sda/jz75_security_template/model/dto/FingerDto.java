package com.sda.jz75_security_template.model.dto;

import com.sda.jz75_security_template.model.Fingers;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FingerDto {

    private Long identifier;
    private Fingers label;
    private String color;

//    {identifier: null, label: "LITTLE_FINGER", color: '#f00'}
}
