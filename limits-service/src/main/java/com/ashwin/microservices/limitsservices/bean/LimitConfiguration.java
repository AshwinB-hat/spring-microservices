package com.ashwin.microservices.limitsservices.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LimitConfiguration {

    private int maximum;
    private int minimum;

}
