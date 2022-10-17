package com.example.kafkaspringboot.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    private Long age;
    private String name;
    private Address address;
}
