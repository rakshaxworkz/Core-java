package com.xworkz.bookapp.stationary;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Stationary {
    private int chartId;
    private String chartType;
    private String chartName;
    private String chartColor;
    private double price;

}
