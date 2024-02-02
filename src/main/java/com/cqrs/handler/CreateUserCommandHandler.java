package com.cqrs.handler;

import com.cqrs.command.CreateUserCommand;

public class CreateUserCommandHandler implements CommandHandler<CreateUserCommand> {
    @Override
    public void handle(CreateUserCommand command) {
        System.out.println("User created: " + command.getUsername());
    }

}
