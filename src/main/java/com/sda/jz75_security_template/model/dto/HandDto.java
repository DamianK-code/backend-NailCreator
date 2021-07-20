package com.sda.jz75_security_template.model.dto;

import com.sda.jz75_security_template.model.HandSide;
import lombok.Data;
import org.intellij.lang.annotations.Identifier;

@Data
public class HandDto {

    private Identifier id;
    private HandSide handSide;
    private FingerDto fingerDto;
//    {
//            identifier: null,
//            handSide: 'RIGHT',
//            fingers: [
//                {id: null, label: "LITTLE_FINGER", color: '#f00'},
//                {id: null, label: "RING_FINGER", color: '#f00'},
//                {id: null, label: "MIDDLE_FINGER", color: '#f00'},
//                {id: null, label: "POINTING_FINGER", color: '#f00'},
//                {id: null, label: "THUMB", color: '#f00'},
//            ]
//        }
}
