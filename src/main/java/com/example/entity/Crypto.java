package com.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Crypto {
    private Integer id;

    private String symbol;

    private String displaySymbol;

    private Long amount;
}
