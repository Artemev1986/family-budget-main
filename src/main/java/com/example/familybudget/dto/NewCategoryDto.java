package com.example.familybudget.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class NewCategoryDto {
    @NotBlank
    private String name;
}
