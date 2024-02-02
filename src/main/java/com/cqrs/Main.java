package com.cqrs;

import com.cqrs.command.CreateUserCommand;
import com.cqrs.handler.CreateUserCommandHandler;
import com.cqrs.handler.GetUserQueryHandler;
import com.cqrs.mediator.ConcreteMediator;
import com.cqrs.query.GetUserQuery;

public class Main {
    public static void main(String[] args) {


        ConcreteMediator mediator = new ConcreteMediator();

        // Register command handlers
        mediator.registerCommandHandler(CreateUserCommand.class, new CreateUserCommandHandler());

        // Register query handlers
        mediator.registerQueryHandler(GetUserQuery.class, new GetUserQueryHandler());

        // Creating User
        CreateUserCommand createUserCommand = new CreateUserCommand("Samiul Arafin");
        mediator.send(createUserCommand);

        // Getting user data
        GetUserQuery getUserQuery = new GetUserQuery(123);
        String userDetails = mediator.send(getUserQuery);
        System.out.println(userDetails);
    }
}