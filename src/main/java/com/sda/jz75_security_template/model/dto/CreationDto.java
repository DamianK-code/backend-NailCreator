package com.sda.jz75_security_template.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.intellij.lang.annotations.Identifier;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreationDto {

    private Long identifier;
    private String name;
    private HandDto right;
    private HandDto left;
//    {
//        id: null,
//        name: null,
//        right: {
//            id: null,
//            handSide: 'RIGHT',
//            fingers: [
//                {id: null, label: "LITTLE_FINGER", color: '#f00'},
//                {id: null, label: "RING_FINGER", color: '#f00'},
//                {id: null, label: "MIDDLE_FINGER", color: '#f00'},
//                {id: null, label: "POINTING_FINGER", color: '#f00'},
//                {id: null, label: "THUMB", color: '#f00'},
//            ]
//        },
//        left: {
//            id: null,
//            handSide: 'LEFT',
//            fingers: [
//                {id: null, label: "LITTLE_FINGER", color: '#f00'},
//                {id: null, label: "RING_FINGER", color: '#f00'},
//                {id: null, label: "MIDDLE_FINGER", color: '#f00'},
//                {id: null, label: "POINTING_FINGER", color: '#f00'},
//                {id: null, label: "THUMB", color: '#f00'},
//            ]
//        }
//    }
}
