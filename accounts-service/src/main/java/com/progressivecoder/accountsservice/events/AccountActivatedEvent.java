package com.progressivecoder.accountsservice.events;

public class AccountActivatedEvent extends BaseEvent<String> {

    public final String status;

    public AccountActivatedEvent(String id, String status) {
        super(id);
        this.status = status;
    }
}
