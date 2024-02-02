package com.cqrs.handler;

import com.cqrs.query.GetUserQuery;

public class GetUserQueryHandler implements QueryHandler<GetUserQuery, String> {
    @Override
    public String handle(GetUserQuery query) {
        return "User details for ID " + query.getUserId();
    }

}
