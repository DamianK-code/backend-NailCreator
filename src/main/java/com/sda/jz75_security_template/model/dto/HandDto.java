package com.sda.jz75_security_template.model.dto;

import com.sda.jz75_security_template.model.HandSide;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.intellij.lang.annotations.Identifier;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HandDto {

    private Long identifier;
    private HandSide handSide;
    private List<FingerDto> fingers;
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
