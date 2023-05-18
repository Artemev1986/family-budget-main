package com.example.familybudget.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.PositiveOrZero;
import java.time.LocalDateTime;

@Data
public class NewAccountDto {
    @NotBlank
    private String name;
    @NotNull
    @PositiveOrZero
    private Double startAmount;
    private String currency;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "yyyy-MM-dd HH:mm:ss")
    @PastOrPresent
    private LocalDateTime createdOn;
    private Long iconNumber;
}
