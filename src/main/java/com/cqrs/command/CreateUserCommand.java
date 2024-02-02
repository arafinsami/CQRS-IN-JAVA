package com.cqrs.command;

import lombok.Getter;

@Getter
public class CreateUserCommand implements Command {

    private String username;

    public CreateUserCommand(String username) {
        this.username = username;
    }

}
