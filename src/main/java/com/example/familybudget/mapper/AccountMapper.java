package com.example.familybudget.mapper;

import com.example.familybudget.dto.AccountDto;
import com.example.familybudget.dto.NewAccountDto;
import com.example.familybudget.entity.Account;
import com.example.familybudget.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AccountMapper {

    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "amount", target = "amount")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "currency", target = "currency")
    @Mapping(source = "createdOn", target = "createdOn")
    @Mapping(source = "iconNumber", target = "iconNumber")
    AccountDto toAccountDto(Account account);

    @Mapping(source = "accountDto.startAmount", target = "startAmount")
    @Mapping(source = "accountDto.startAmount", target = "amount")
    @Mapping(source = "accountDto.name", target = "name")
    @Mapping(source = "accountDto.currency", target = "currency")
    @Mapping(source = "user", target = "user")
    @Mapping(source = "accountDto.createdOn", target = "createdOn")
    @Mapping(source = "accountDto.iconNumber", target = "iconNumber")
    Account toAccount(NewAccountDto accountDto, User user);
}